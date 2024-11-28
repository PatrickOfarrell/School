import java.util.Scanner;

public class PresentValue {
    public static double presentValue(double futureValue, double annualRate, int years) {
        return futureValue / Math.pow(1 + annualRate, years);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the future value you want: ");
        double futureValue = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (as a decimal): ");
        double annualRate = scanner.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        double presentValue = presentValue(futureValue, annualRate, years);
        System.out.printf("You need to deposit $%.2f today to reach $%.2f in %d years.\n", presentValue, futureValue, years);

        scanner.close();
    }
}