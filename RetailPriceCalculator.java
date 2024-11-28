import java.util.Scanner;

public class RetailPriceCalculator {
    public static double calculateRetail(double wholesaleCost, double markupPercentage) {
        return wholesaleCost * (1 + markupPercentage / 100);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the wholesale cost: ");
        double wholesaleCost = scanner.nextDouble();
        System.out.print("Enter the markup percentage: ");
        double markupPercentage = scanner.nextDouble();

        double retailPrice = calculateRetail(wholesaleCost, markupPercentage);
        System.out.printf("The retail price is: $%.2f\n", retailPrice);

        scanner.close();
    }
}