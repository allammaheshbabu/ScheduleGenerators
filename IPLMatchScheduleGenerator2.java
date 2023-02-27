import java.util.ArrayList;

public class IPLMatchScheduleGenerator2 {
    public static void main(String[] args) {
        // Create an ArrayList of teams
        ArrayList<String> teams = new ArrayList<String>();
        teams.add("Mumbai Indians");
        teams.add("Chennai Super Kings");
        teams.add("Kolkata Knight Riders");
        teams.add("Delhi Capitals");
        teams.add("Royal Challengers Bangalore");
        teams.add("Rajasthan Royals");
        teams.add("Sunrisers Hyderabad");
        teams.add("Punjab Kings");

        // Calculate the number of teams and rounds
        int numTeams = teams.size();
        int numRounds = numTeams - 1;

        // Create a 2D array to store the match schedule
        String[][] matchSchedule = new String[numRounds * numTeams / 2][2];

        // Fill in the match schedule using round-robin algorithm
        for (int round = 0, i = 0; round < numRounds; round++) {
            for (int match = 0; match < numTeams / 2; match++) {
                int home = (round + match) % (numTeams - 1);
                int away = (numTeams - 1 - match + round) % (numTeams - 1);
                if (match == 0) {
                    away = numTeams - 1;
                }
                matchSchedule[i][0] = teams.get(home);
                matchSchedule[i][1] = teams.get(away);
                i++;
            }
        }

        // Print the match schedule
        for (int i = 0; i < matchSchedule.length; i++) {
            System.out.println("Match " + (i + 1) + ": " + matchSchedule[i][0] + " vs " + matchSchedule[i][1]);
        }
    }
}
