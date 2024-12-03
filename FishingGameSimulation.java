import java.util.Scanner;

public class FishingGameSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Die die = new Die(6);
        int totalPoints = 0;

        System.out.println("Welcome to the Fishing Game!");

        boolean keepFishing = true;
        while (keepFishing) {
            System.out.print("\nDo you want to fish for an item? (yes/no): ");
            String response = scanner.nextLine();

            if (response.equalsIgnoreCase("no")) {
                break;
            }

            die.roll();
            int roll = die.getValue();
            int points = 0;
            String item = "";

            switch (roll) {
                case 1:
                    item = "a huge fish";
                    points = 10;
                    break;
                case 2:
                    item = "an old shoe";
                    points = 0;
                    break;
                case 3:
                    item = "a little fish";
                    points = 5;
                    break;
                case 4:
                    item = "a treasure chest";
                    points = 20;
                    break;
                case 5:
                    item = "a crab";
                    points = 7;
                    break;
                case 6:
                    item = "seaweed";
                    points = 1;
                    break;
            }

            System.out.println("You caught " + item + "! It is worth " + points + " points.");
            totalPoints += points;
        }

        System.out.println("\nYou finished fishing!");
        System.out.println("Total points: " + totalPoints);

        // Display result based on points
        if (totalPoints >= 50) {
            System.out.println("Amazing! You're a fishing legend!");
        } else if (totalPoints >= 20) {
            System.out.println("Great job! You're a skilled fisher!");
        } else {
            System.out.println("Better luck next time!");
        }
    }
}