import java.util.Random;
import java.util.Scanner;

// Die Class
class Die {
    private int sides;
    private int value;

    // Constructor
    public Die(int sides) {
        this.sides = sides;
        roll();
    }

    // Rolls the die and sets a random value
    public void roll() {
        Random rand = new Random();
        value = rand.nextInt(sides) + 1;
    }

    // Accessor
    public int getValue() {
        return value;
    }
}

public class TwentyOneGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Die die1 = new Die(6);
        Die die2 = new Die(6);

        int playerTotal = 0, computerTotal = 0;
        String choice;

        // Computer rolls its dice
        die1.roll();
        die2.roll();
        computerTotal = die1.getValue() + die2.getValue();

        System.out.println("Welcome to the Game of Twenty-One!");
        System.out.println("Your goal is to beat the computer without exceeding 21.");

        do {
            // Player rolls
            die1.roll();
            die2.roll();
            int rollTotal = die1.getValue() + die2.getValue();
            playerTotal += rollTotal;

            System.out.printf("You rolled: %d and %d (Total this round: %d)%n", die1.getValue(), die2.getValue(), rollTotal);
            System.out.printf("Your total is now: %d%n", playerTotal);

            if (playerTotal > 21) {
                System.out.println("You exceeded 21! You lose.");
                return;
            }

            System.out.print("Do you want to roll again? (yes/no): ");
            choice = scanner.next().toLowerCase();

        } while (choice.equals("yes"));

        System.out.printf("Computer's total is: %d%n", computerTotal);

        // Determine winner
        if (computerTotal > 21 || playerTotal > computerTotal) {
            System.out.println("You win!");
        } else if (computerTotal == playerTotal) {
            System.out.println("It's a tie!");
        } else {
            System.out.println("Computer wins!");
        }

        scanner.close();
    }
}