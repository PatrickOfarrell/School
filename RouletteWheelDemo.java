import java.util.Scanner;

public class RouletteWheelDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a pocket number (0-36): ");
        int pocketNumber = scanner.nextInt();

        RoulettePocket pocket = new RoulettePocket(pocketNumber);

        System.out.println("Pocket " + pocketNumber + " is " + pocket.getPocketColor());
    }
}