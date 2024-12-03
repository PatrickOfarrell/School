public class PayrollPO {

    final int[] empId = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
    final int[] hours = {40, 38, 42, 35, 50, 30, 45}; // hours worked
    final double[] payRate = {14.50, 16.25, 14.75, 16.50, 17.50, 21.25, 17.75}; // pay rates
    final double[] wage = new double[7];

    // method to calculate wages
    public PayrollPO() {
        for (int i = 0; i < 7; i++) {
            wage[i] = hours[i] * payRate[i];
        }
    }

    // Method to get pay by employee ID
    public void getGrossPay(int id) {
        for (int i = 0; i < empId.length; i++) {
            if (empId[i] == id) {
                System.out.println("Gross pay for employee ID " + id + ": $" + wage[i]);
                return; 
            }
        }
    }

    // Method to display employee information
    public void displayEmployees() {
        System.out.println("Employee Information:");
        for (int i = 0; i < empId.length; i++) {
            System.out.println("ID: " + empId[i] + ", Gross Pay: $" + wage[i]);
        }
    }

    // Main method to test the PayrollPO class
    public static void main(String[] args) {
        PayrollPO payrolltest = new PayrollPO();

        // Display all employee details
        payrolltest.displayEmployees();

    }
}