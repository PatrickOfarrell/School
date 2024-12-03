import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PopulationData {

    public static void main(String[] args) {
        // Array to store the population data
        ArrayList<Integer> population = new ArrayList<>();
        
        // Read the population data from the file
        try {
            BufferedReader reader = new BufferedReader(new FileReader("USPopulation.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                population.add(Integer.parseInt(line));
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading the file.");
            return;
        }

        // Calculate the average annual change in population
        int totalChange = 0;
        int maxIncrease = Integer.MIN_VALUE;
        int minIncrease = Integer.MAX_VALUE;
        int maxYear = 0;
        int minYear = 0;

        for (int i = 1; i < population.size(); i++) {
            int change = population.get(i) - population.get(i - 1);
            totalChange += change;

            // Find the year with the greatest and smallest increase in population
            if (change > maxIncrease) {
                maxIncrease = change;
                maxYear = 1950 + i; // Adjusting the year based on index
            }
            if (change < minIncrease) {
                minIncrease = change;
                minYear = 1950 + i;
            }
        }

        // Calculate average annual change
        double averageChange = (double) totalChange / (population.size() - 1);

        // Display the results
        System.out.println("Average Annual Change in Population: " + averageChange);
        System.out.println("Year with the greatest increase in population: " + maxYear + " (" + maxIncrease + ")");
        System.out.println("Year with the smallest increase in population: " + minYear + " (" + minIncrease + ")");
    }
}