import java.util.Scanner;

public class MultipleStockSales {
    public static double calculateProfit(int shares, double purchasePrice, double purchaseCommission, double salePrice, double saleCommission) {
        return ((shares * salePrice) - saleCommission) - ((shares * purchasePrice) + purchaseCommission);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of stock sales: ");
        int salesCount = scanner.nextInt();

        double totalProfit = 0.0;

        for (int i = 1; i <= salesCount; i++) {
            System.out.println("\nStock Sale #" + i);
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
            totalProfit += profit;

            System.out.printf("Profit/Loss for this sale: $%.2f\n", profit);
        }

        System.out.printf("\nTotal profit/loss from all stock sales: $%.2f\n", totalProfit);

        scanner.close();
    }
}
