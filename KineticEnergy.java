import java.util.Scanner;

public class KineticEnergy {
    public static double kineticEnergy(double mass, double velocity) {
        return 0.5 * mass * velocity * velocity;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the mass of the object (in kg): ");
        double mass = scanner.nextDouble();

        System.out.print("Enter the velocity of the object (in m/s): ");
        double velocity = scanner.nextDouble();

        double energy = kineticEnergy(mass, velocity);
        System.out.printf("The kinetic energy of the object is %.2f Joules.\n", energy);

        scanner.close();
    }
}
