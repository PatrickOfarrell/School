import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static String getComputerChoice() {
        Random random = new Random();
        int choice = random.nextInt(3) + 1; // 1 for Rock, 2 for Paper, 3 for Scissors
        switch (choice) {
            case 1: return "Rock";
            case 2: return "Paper";
            case 3: return "Scissors";
            default: return "";
        }
    }

    public static String determineWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if ((user.equals("Rock") && computer.equals("Scissors")) ||
            (user.equals("Paper") && computer.equals("Rock")) ||
            (user.equals("Scissors") && computer.equals("Paper"))) {
            return "User";
        }
        return "Computer";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] choices = {"Rock", "Paper", "Scissors"};

        while (true) {
            System.out.print("Enter Rock, Paper, or Scissors (or Quit to exit): ");
            String userChoice = scanner.next();

            if (userChoice.equalsIgnoreCase("Quit")) {
                System.out.println("Goodbye!");
                break;
            }

            String computerChoice = getComputerChoice();
            System.out.println("Computer chose: " + computerChoice);

            String winner = determineWinner(userChoice, computerChoice);
            if (winner.equals("Draw")) {
                System.out.println("It's a draw!");
            } else {
                System.out.println(winner + " wins!");
            }
        }

        scanner.close();
    }
}