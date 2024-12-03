public class TossingCoinsForADollar {
    public static void main(String[] args) {
        Coin quarter = new Coin();
        Coin dime = new Coin();
        Coin nickel = new Coin();

        double balance = 0.0;
        final double QUARTER_VALUE = 0.25;
        final double DIME_VALUE = 0.10;
        final double NICKEL_VALUE = 0.05;

        while (balance < 1.0) {
            System.out.println("\nTossing coins...");

            // Toss each coin
            quarter.toss();
            dime.toss();
            nickel.toss();

            // Add value to balance if heads
            if (quarter.getSideUp().equals("heads")) {
                balance += QUARTER_VALUE;
                System.out.println("Quarter landed heads-up! Added $0.25");
            }
            if (dime.getSideUp().equals("heads")) {
                balance += DIME_VALUE;
                System.out.println("Dime landed heads-up! Added $0.10");
            }
            if (nickel.getSideUp().equals("heads")) {
                balance += NICKEL_VALUE;
                System.out.println("Nickel landed heads-up! Added $0.05");
            }

            // Display balance
            System.out.printf("Current balance: $%.2f\n", balance);

            // Check if game is over
            if (balance > 1.0) {
                System.out.println("You exceeded $1.00. You lose!");
                return;
            }
        }

        if (balance == 1.0) {
            System.out.println("Congratulations! You reached exactly $1.00. You win!");
        }
    }
}