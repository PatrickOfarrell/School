import java.util.Scanner;

public class StockProfit {
    public static double calculateProfit(int shares, double purchasePrice, double purchaseCommission, double salePrice, double saleCommission) {
        return ((shares * salePrice) - saleCommission) - ((shares * purchasePrice) + purchaseCommission);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of shares: ");
        int shares = scanner.nextInt();

        System.out.print("Enter the purchase price per share: ");
        double purchasePrice = scanner.nextDouble();

        System.out.print("Enter the purchase commission: ");
        double purchaseCommission = scanner.nextDouble();

        System.out.print("Enter the sale price per share: ");
        double salePrice = scanner.nextDouble();

        System.out.print("Enter the sale commission: ");
        double saleCommission = scanner.nextDouble();

        double profit = calculateProfit(shares, purchasePrice, purchaseCommission, salePrice, saleCommission);

        if (profit >= 0) {
            System.out.printf("The profit from the stock sale is: $%.2f\n", profit);
        } else {
            System.out.printf("The loss from the stock sale is: $%.2f\n", Math.abs(profit));
        }

        scanner.close();
    }
}