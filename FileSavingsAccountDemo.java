import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileSavingsAccountDemo {
    public static void main(String[] args) {
        double startingBalance = 500.00;
        double annualInterestRate = 0.05; // Example annual interest rate
        SavingsAccount account = new SavingsAccount(startingBalance);
        account.setAnnualInterestRate(annualInterestRate);

        try {
            // Process Deposits.txt
            File depositFile = new File("Deposits.txt");
            Scanner depositScanner = new Scanner(depositFile);
            while (depositScanner.hasNextDouble()) {
                double deposit = depositScanner.nextDouble();
                account.deposit(deposit);
            }
            depositScanner.close();

            // Process Withdrawals.txt
            File withdrawalFile = new File("Withdrawals.txt");
            Scanner withdrawalScanner = new Scanner(withdrawalFile);
            while (withdrawalScanner.hasNextDouble()) {
                double withdrawal = withdrawalScanner.nextDouble();
                account.withdraw(withdrawal);
            }
            withdrawalScanner.close();

            // Add monthly interest
            account.addMonthlyInterest();

            // Display results
            System.out.printf("Ending Balance: %.2f%n", account.getBalance());
            System.out.printf("Total Deposits: %.2f%n", account.getTotalDeposits());
            System.out.printf("Total Withdrawals: %.2f%n", account.getTotalWithdrawals());
            System.out.printf("Total Interest Earned: %.2f%n", account.getTotalInterest());

        } catch (IOException e) {
            System.out.println("Error reading files: " + e.getMessage());
        }
    }
}