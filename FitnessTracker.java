import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FitnessTracker {

    public static void main(String[] args) {
        // Array for the number of days in each month (non-leap year)
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // Array to store the number of steps taken for each day of the year
        int[] steps = new int[365];
        
        // Read the steps data from the file
        try (BufferedReader reader = new BufferedReader(new FileReader("steps.txt"))) {
            for (int i = 0; i < 365; i++) {
                steps[i] = Integer.parseInt(reader.readLine());
            }
        } catch (IOException e) {
            System.out.println("Error reading the file.");
            return;
        }
        
        // Calculate the average steps for each month
        int dayIndex = 0;
        for (int month = 0; month < 12; month++) {
            int totalSteps = 0;
            int daysInCurrentMonth = daysInMonth[month];
            
            for (int day = 0; day < daysInCurrentMonth; day++) {
                totalSteps += steps[dayIndex++];
            }
            
            double averageSteps = totalSteps / (double) daysInCurrentMonth;
            System.out.printf("Month %d Average Steps: %.2f\n", month + 1, averageSteps);
        }
    }
}