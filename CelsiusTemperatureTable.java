public class CelsiusTemperatureTable {
    public static double celsius(double fahrenheit) {
        return (5.0 / 9.0) * (fahrenheit - 32);
    }

    public static void main(String[] args) {
        System.out.println("Fahrenheit   Celsius");
        System.out.println("----------------------");
        for (int f = 0; f <= 20; f++) {
            System.out.printf("%-12d %.2f\n", f, celsius(f));
        }
    }
}