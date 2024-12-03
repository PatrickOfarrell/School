import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class GasPrices {

    public static void main(String[] args) {
        // Reading the gas prices from the file
        ArrayList<Double> gasPrices = new ArrayList<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader("1994_Weekly_Gas_Averages.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                gasPrices.add(Double.parseDouble(line));
            }
        } catch (IOException e) {
            System.out.println("Error reading the file.");
            return;
        }

        // Array of month names
        String[] months = {
            "January", "February", "March", "April", "May", "June", "July", 
            "August", "September", "October", "November", "December"
        };

        // Finding the lowest and highest prices with the corresponding weeks and months
        double lowestPrice = Double.MAX_VALUE;
        double highestPrice = Double.MIN_VALUE;
        int lowestWeek = -1;
        int highestWeek = -1;
        String lowestMonth = "";
        String highestMonth = "";

        for (int i = 0; i < gasPrices.size(); i++) {
            double price = gasPrices.get(i);
            if (price < lowestPrice) {
                lowestPrice = price;
                lowestWeek = i + 1;  // Weeks are 1-indexed
                lowestMonth = months[i / 4];  // Each month has 4 weeks (52 weeks / 12 months)
            }
            if (price > highestPrice) {
                highestPrice = price;
                highestWeek = i + 1;
                highestMonth = months[i / 4];
            }
        }

        // Displaying the lowest and highest prices along with their week and month
        System.out.println("Lowest Price: $" + lowestPrice + " in Week " + lowestWeek + ", Month: " + lowestMonth);
        System.out.println("Highest Price: $" + highestPrice + " in Week " + highestWeek + ", Month: " + highestMonth);

        // Calculating the average gas price for each month
        double[] monthlyAverages = new double[12];
        for (int month = 0; month < 12; month++) {
            double total = 0;
            for (int week = month * 4; week < (month + 1) * 4; week++) {
                total += gasPrices.get(week);
            }
            monthlyAverages[month] = total / 4;
            System.out.println("Average Price for " + months[month] + ": $" + monthlyAverages[month]);
        }

        // Sorting the months by their average price
        TreeMap<Double, String> sortedMonths = new TreeMap<>();
        for (int i = 0; i < 12; i++) {
            sortedMonths.put(monthlyAverages[i], months[i]);
        }

        // Writing the sorted months and their average gas prices to a new file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Sorted_Gas_Prices_1994.txt"))) {
            for (Map.Entry<Double, String> entry : sortedMonths.entrySet()) {
                writer.write(entry.getValue() + ": $" + entry.getKey());
                writer.newLine();
            }
            System.out.println("\nSorted list of months and their average gas prices has been written to Sorted_Gas_Prices_1994.txt.");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }
}