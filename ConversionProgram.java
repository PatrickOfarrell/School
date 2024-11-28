import java.util.Scanner;

public class ConversionProgram {
    public static void showKilometers(double meters) {
        System.out.printf("%.2f meters is %.2f kilometers.\n", meters, meters * 0.001);
    }

    public static void showInches(double meters) {
        System.out.printf("%.2f meters is %.2f inches.\n", meters, meters * 39.37);
    }

    public static void showFeet(double meters) {
        System.out.printf("%.2f meters is %.2f feet.\n", meters, meters * 3.281);
    }

    public static void menu() {
        System.out.println("\n1. Convert to kilometers");
        System.out.println("2. Convert to inches");
        System.out.println("3. Convert to feet");
        System.out.println("4. Quit the program");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a distance in meters: ");
        double meters = scanner.nextDouble();

        if (meters < 0) {
            System.out.println("Error: Distance cannot be negative.");
            return;
        }

        int choice;
        do {
            menu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showKilometers(meters);
                case 2 -> showInches(meters);
                case 3 -> showFeet(meters);
                case 4 -> System.out.println("Bye!");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
