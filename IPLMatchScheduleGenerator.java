import java.util.ArrayList;
import java.util.Collections;

public class IPLMatchScheduleGenerator {
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
        
        // Shuffle the ArrayList
        Collections.shuffle(teams);
        
        // Calculate the number of matches
        int numMatches = teams.size() * (teams.size() - 1);
        
        // Create a 2D array to store the match schedule
        String[][] matchSchedule = new String[numMatches][2];
        
        // Fill in the match schedule
        int count = 0;
        for (int i = 0; i < teams.size(); i++) {
            for (int j = i + 1; j < teams.size(); j++) {
                matchSchedule[count][0] = teams.get(i);
                matchSchedule[count][1] = teams.get(j);
                count++;
            }
        }
        
        // Print the match schedule
        for (int i = 0; i < matchSchedule.length; i++) {
            System.out.println("Match " + (i + 1) + ": " + matchSchedule[i][0] + " vs " + matchSchedule[i][1]);
        }
    }
}
