import java.util.Scanner;

public class PaintJobEstimator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rooms to be painted: ");
        int rooms = scanner.nextInt();

        double totalWallSpace = 0;
        for (int i = 1; i <= rooms; i++) {
            System.out.print("Enter the square feet of wall space for room " + i + ": ");
            totalWallSpace += scanner.nextDouble();
        }

        System.out.print("Enter the price of paint per gallon: ");
        double pricePerGallon = scanner.nextDouble();

        int gallons = calculateGallons(totalWallSpace);
        double laborHours = calculateLaborHours(totalWallSpace);
        double paintCost = calculatePaintCost(gallons, pricePerGallon);
        double laborCharges = calculateLaborCharges(laborHours);
        double totalCost = calculateTotalCost(paintCost, laborCharges);

        System.out.printf("Gallons of paint required: %d\n", gallons);
        System.out.printf("Labor hours required: %.2f\n", laborHours);
        System.out.printf("Cost of paint: $%.2f\n", paintCost);
        System.out.printf("Labor charges: $%.2f\n", laborCharges);
        System.out.printf("Total cost of the paint job: $%.2f\n", totalCost);

        scanner.close();
    }
    public static int calculateGallons(double totalWallSpace) {
        return (int) Math.ceil(totalWallSpace / 115);
    }

    public static double calculateLaborHours(double totalWallSpace) {
        return (totalWallSpace / 115) * 8;
    }

    public static double calculatePaintCost(int gallons, double pricePerGallon) {
        return gallons * pricePerGallon;
    }

    public static double calculateLaborCharges(double hours) {
        return hours * 18.00;
    }

    public static double calculateTotalCost(double paintCost, double laborCharges) {
        return paintCost + laborCharges;
    }
}
