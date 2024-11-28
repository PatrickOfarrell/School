import java.util.Random;
import java.util.Scanner;

public class ESPGame {
    public static String getRandomColor() {
        String[] colors = {"Red", "Green", "Blue", "Orange", "Yellow"};
        Random random = new Random();
        return colors[random.nextInt(colors.length)];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int correctGuesses = 0;

        for (int i = 0; i < 10; i++) {
            String computerChoice = getRandomColor();

            System.out.print("Guess the color (Red, Green, Blue, Orange, Yellow): ");
            String userGuess = scanner.next();

            if (userGuess.equalsIgnoreCase(computerChoice)) {
                System.out.println("Correct!");
                correctGuesses++;
            } else {
                System.out.println("Wrong! The correct color was " + computerChoice);
            }
        }

        System.out.println("You guessed correctly " + correctGuesses + " times out of 10.");

        scanner.close();
    }
}           