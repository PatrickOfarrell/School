import java.util.Scanner;

public class Payroll {
    private String employeeName;
    private int idNumber;
    private double hourlyPayRate;
    private double hoursWorked;

    // Constructor
    public Payroll(String employeeName, int idNumber) {
        this.employeeName = employeeName;
        this.idNumber = idNumber;
    }

    // Accessors
    public String getEmployeeName() { return employeeName; }
    public int getIdNumber() { return idNumber; }
    public double getHourlyPayRate() { return hourlyPayRate; }
    public double getHoursWorked() { return hoursWorked; }

    // Mutators
    public void setHourlyPayRate(double hourlyPayRate) {
        if (hourlyPayRate < 0) throw new IllegalArgumentException("Pay rate cannot be negative.");
        this.hourlyPayRate = hourlyPayRate;
    }

    public void setHoursWorked(double hoursWorked) {
        if (hoursWorked < 0 || hoursWorked > 168) // 168 hours = 24 hours * 7 days
            throw new IllegalArgumentException("Hours worked must be between 0 and 168.");
        this.hoursWorked = hoursWorked;
    }

    // Calculate gross pay
    public double calculateGrossPay() {
        return hourlyPayRate * hoursWorked;
    }

    // Main program to test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get employee details
        System.out.print("Enter employee's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee's ID number: ");
        int id = scanner.nextInt();

        // Create Payroll object
        Payroll payroll = new Payroll(name, id);

        // Set pay rate and hours worked
        System.out.print("Enter hourly pay rate: ");
        payroll.setHourlyPayRate(scanner.nextDouble());
        System.out.print("Enter hours worked: ");
        payroll.setHoursWorked(scanner.nextDouble());

        // Display gross pay
        System.out.println("Gross pay for " + payroll.getEmployeeName() + ": $" + payroll.calculateGrossPay());
        scanner.close();
    }
}