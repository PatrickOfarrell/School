import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class WorldSeriesChampions {

    public static void main(String[] args) {
        // Create a list to hold the winners from the file
        ArrayList<String> winners = new ArrayList<>();
        
        // Read the file and store the team names in the list
        try {
            BufferedReader reader = new BufferedReader(new FileReader("WorldSeriesWinners.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                winners.add(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading the file.");
            return;
        }

        // Prompt the user for a team name
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of a team: ");
        String teamName = scanner.nextLine();

        // Count how many times the team has won
        int count = 0;
        for (String winner : winners) {
            if (winner.equalsIgnoreCase(teamName)) {
                count++;
            }
        }

        // Display the result
        if (count > 0) {
            System.out.println(teamName + " has won the World Series " + count + " times between 1903 and 2009.");
        } else {
            System.out.println(teamName + " has not won the World Series between 1903 and 2009.");
        }
    }
}