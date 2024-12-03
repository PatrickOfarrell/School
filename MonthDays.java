import java.util.Scanner;

public class MonthDays {
    private int month;
    private int year;

    // Constructor
    public MonthDays(int month, int year) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Month must be between 1 and 12.");
        }
        this.month = month;
        this.year = year;
    }

    // Method to determine if the year is a leap year
    private boolean isLeapYear() {
        if (year % 100 == 0) {
            return year % 400 == 0;
        }
        return year % 4 == 0;
    }

    // Method to return the number of days in the month
    public int numberOfDays() {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear() ? 29 : 28;
            default:
                throw new IllegalStateException("Invalid month.");
        }
    }

    // Main program to test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        try {
            MonthDays monthDays = new MonthDays(month, year);
            System.out.printf("%d days%n", monthDays.numberOfDays());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}