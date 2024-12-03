import java.util.Scanner;

public class Temperature {
    private double fahrenheit;

    // Constructor
    public Temperature(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    // Mutator
    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    // Accessor
    public double getFahrenheit() {
        return fahrenheit;
    }

    // Convert to Celsius
    public double celsius() {
        return (5.0 / 9.0) * (fahrenheit - 32);
    }

    // Convert to Kelvin
    public double kelvin() {
        return ((5.0 / 9.0) * (fahrenheit - 32)) + 273.15;
    }

    // Main program to test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a temperature in Fahrenheit: ");
        double tempF = scanner.nextDouble();

        Temperature temperature = new Temperature(tempF);
        System.out.printf("Fahrenheit: %.2f°F%n", temperature.getFahrenheit());
        System.out.printf("Celsius: %.2f°C%n", temperature.celsius());
        System.out.printf("Kelvin: %.2f K%n", temperature.kelvin());

        scanner.close();
    }
}