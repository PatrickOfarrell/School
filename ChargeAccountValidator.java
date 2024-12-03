import java.util.Scanner;

public class ChargeAccountValidator {

    // Array containing valid charge account numbers
    private static final int[] validAccountNumbers = {
        5658845, 4520125, 7895122, 8777541, 8451277, 1302850,
        8080152, 4562555, 5552012, 5050552, 7825877, 1250255,
        1005231, 6545231, 3852085, 7576651, 7881200, 4581002
    };

    // Method to validate charge account number
    public static boolean isValidAccountNumber(int accountNumber) {
        for (int validAccount : validAccountNumbers) {
            if (accountNumber == validAccount) {
                return true;  // Account number is valid
            }
        }
        return false;  // Account number is invalid
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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