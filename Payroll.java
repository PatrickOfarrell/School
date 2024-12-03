import java.util.Scanner;

public class Payroll {
    private int[] employeeId = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
    private int[] hours = new int[7];
    private double[] payRate = new double[7];
    private double[] wages = new double[7];

    // Method to input hours worked and pay rate for each employee
    public void inputEmployeeData() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            System.out.println("\nEmployee ID: " + employeeId[i]);
            // Get valid hours
            while (true) {
                System.out.print("Enter hours worked: ");
                int h = scanner.nextInt();
                if (h >= 0) {
                    hours[i] = h;
                    break;
                } else {
                    System.out.println("Hours cannot be negative.");
                }
            }
            // Get valid pay rate
            while (true) {
                System.out.print("Enter pay rate (min 6.00): ");
                double rate = scanner.nextDouble();
                if (rate >= 6.00) {
                    payRate[i] = rate;
                    break;
                } else {
                    System.out.println("Pay rate must be at least 6.00.");
                }
            }
        }
    }

    // Method to calculate wages for each employee
    public void calculateWages() {
        for (int i = 0; i < 7; i++) {
            wages[i] = hours[i] * payRate[i];
        }
    }

    // Method to display employee information and wages
    public void displayEmployeeWages() {
        System.out.println("\nEmployee ID | Gross Wages");
        for (int i = 0; i < 7; i++) {
            System.out.println(employeeId[i] + " | $" + wages[i]);
        }
    }

    public static void main(String[] args) {
        Payroll payroll = new Payroll();
        payroll.inputEmployeeData();
        payroll.calculateWages();
        payroll.displayEmployeeWages();
    }
}