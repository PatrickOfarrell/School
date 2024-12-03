public class CoinTossSimulator {
    public static void main(String[] args) {
        Coin coin = new Coin();
        int headsCount = 0;
        int tailsCount = 0;

        // Display initial state
        System.out.println("Initial side up: " + coin.getSideUp());

        // Toss the coin 20 times
        for (int i = 1; i <= 20; i++) {
            coin.toss();
            String side = coin.getSideUp();
            System.out.println("Toss " + i + ": " + side);

            if (side.equals("heads")) {
                headsCount++;
            } else {
                tailsCount++;
            }
        }

        // Display results
        System.out.println("\nNumber of heads: " + headsCount);
        System.out.println("Number of tails: " + tailsCount);
    }
}