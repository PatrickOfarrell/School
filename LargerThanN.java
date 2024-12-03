import java.util.Scanner;

public class LargerThanN {

    // Method to display all numbers in the array greater than n
    public static void displayLargerThanN(int[] array, int n) {
        System.out.println("Numbers greater than " + n + ":");
        for (int num : array) {
            if (num > n) {
                System.out.println(num);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sample array of integers
        int[] numbers = {12, 45, 67, 89, 23, 45, 90, 100, 35, 60};

        // Ask user for the number n
        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();

        // Display all numbers greater than n
        displayLargerThanN(numbers, n);
    }
}
