import java.util.Scanner;

public class SavingsAccountDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Gather initial inputs
        System.out.print("Enter the starting balance: ");
        double startingBalance = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (as a decimal): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter the number of months: ");
        int months = scanner.nextInt();

        SavingsAccount account = new SavingsAccount(startingBalance);
        account.setAnnualInterestRate(annualInterestRate);

        // Loop through each month
        for (int month = 1; month <= months; month++) {
            System.out.printf("Month %d:%n", month);

            System.out.print("Enter the amount deposited: ");
            double deposit = scanner.nextDouble();
            account.deposit(deposit);

            System.out.print("Enter the amount withdrawn: ");
            double withdrawal = scanner.nextDouble();
            account.withdraw(withdrawal);

            account.addMonthlyInterest();
        }

        // Display final account summary
        System.out.printf("%nEnding Balance: %.2f%n", account.getBalance());
        System.out.printf("Total Deposits: %.2f%n", account.getTotalDeposits());
        System.out.printf("Total Withdrawals: %.2f%n", account.getTotalWithdrawals());
        System.out.printf("Total Interest Earned: %.2f%n", account.getTotalInterest());

        scanner.close();
    }
}