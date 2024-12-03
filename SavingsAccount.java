public class SavingsAccount {
    private double annualInterestRate;
    private double balance;
    private double totalDeposits;
    private double totalWithdrawals;
    private double totalInterest;

    // Constructor
    public SavingsAccount(double balance) {
        this.balance = balance;
        this.totalDeposits = 0;
        this.totalWithdrawals = 0;
        this.totalInterest = 0;
    }

    // Setter for annual interest rate
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        totalDeposits += amount;
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        balance -= amount;
        totalWithdrawals += amount;
    }

    // Method to add monthly interest
    public void addMonthlyInterest() {
        double monthlyInterestRate = annualInterestRate / 12;
        double monthlyInterest = balance * monthlyInterestRate;
        balance += monthlyInterest;
        totalInterest += monthlyInterest;
    }

    // Accessor methods for totals and balance
    public double getBalance() {
        return balance;
    }

    public double getTotalDeposits() {
        return totalDeposits;
    }

    public double getTotalWithdrawals() {
        return totalWithdrawals;
    }

    public double getTotalInterest() {
        return totalInterest;
    }
}