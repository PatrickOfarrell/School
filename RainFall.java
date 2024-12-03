import java.util.Scanner;

public class RainFall {
    private double[] rainfall = new double[12];

    // Method to input rainfall data for each month
    public void inputRainfall() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 12; i++) {
            while (true) {
                System.out.print("Enter the rainfall for month " + (i + 1) + " (in inches): ");
                double rain = scanner.nextDouble();
                if (rain >= 0) {
                    rainfall[i] = rain;
                    break;
                } else {
                    System.out.println("Rainfall cannot be negative. Please enter a valid value.");
                }
            }
        }
    }

    // Method to calculate the total rainfall for the year
    public double getTotalRainfall() {
        double total = 0;
        for (double rain : rainfall) {
            total += rain;
        }
        return total;
    }

    // Method to calculate the average monthly rainfall
    public double getAverageRainfall() {
        return getTotalRainfall() / 12;
    }

    // Method to get the month with the most rainfall
    public int getMonthWithMostRain() {
        double mostRain = rainfall[0];
        int month = 0;
        for (int i = 1; i < 12; i++) {
            if (rainfall[i] > mostRain) {
                mostRain = rainfall[i];
                month = i;
            }
        }
        return month + 1; // returning month as 1-based index
    }

    // Method to get the month with the least rainfall
    public int getMonthWithLeastRain() {
        double leastRain = rainfall[0];
        int month = 0;
        for (int i = 1; i < 12; i++) {
            if (rainfall[i] < leastRain) {
                leastRain = rainfall[i];
                month = i;
            }
        }
        return month + 1; // returning month as 1-based index
    }

    // Method to display the summary
    public void displaySummary() {
        System.out.println("\nTotal rainfall for the year: " + getTotalRainfall() + " inches.");
        System.out.println("Average monthly rainfall: " + getAverageRainfall() + " inches.");
        System.out.println("Month with the most rain: " + getMonthWithMostRain());
        System.out.println("Month with the least rain: " + getMonthWithLeastRain());
    }
    
    public static void main(String[] args) {
        RainFall rainfall = new RainFall();
        rainfall.inputRainfall();
        rainfall.displaySummary();
    }
}