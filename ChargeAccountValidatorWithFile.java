import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChargeAccountValidatorWithFile {

    // List to store valid account numbers
    private static List<Integer> validAccountNumbers = new ArrayList<>();

    // Method to read account numbers from a file
    public static void readAccountNumbersFromFile(String fileName) {
        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            while (fileScanner.hasNextInt()) {
                validAccountNumbers.add(fileScanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }

    // Method to validate charge account number
    public static boolean isValidAccountNumber(int accountNumber) {
        return validAccountNumbers.contains(accountNumber);  // Checks if the number is in the list
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the valid account numbers from the file
        readAccountNumbersFromFile("valid_accounts.txt");

        // Ask user for charge account number
        System.out.print("Enter a charge account number: ");
        int accountNumber = scanner.nextInt();

        // Validate account number
        if (isValidAccountNumber(accountNumber)) {
            System.out.println("The account number is valid.");
        } else {
            System.out.println("The account number is invalid.");
        }
    }
}
