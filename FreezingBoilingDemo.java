import java.util.Scanner;

class Temperature2 {
    private double temperature;

    // Constructor
    public Temperature2(double temperature) {
        this.temperature = temperature;
    }

    // Accessor
    public double getTemperature() {
        return temperature;
    }

    // Mutator
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    // Methods for freezing and boiling checks
    public boolean isEthylFreezing() {
        return temperature <= -173;
    }

    public boolean isEthylBoiling() {
        return temperature >= 172;
    }

    public boolean isOxygenFreezing() {
        return temperature <= -362;
    }

    public boolean isOxygenBoiling() {
        return temperature >= -306;
    }

    public boolean isWaterFreezing() {
        return temperature <= 32;
    }

    public boolean isWaterBoiling() {
        return temperature >= 212;
    }
}

public class FreezingBoilingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a temperature: ");
        double temp = scanner.nextDouble();

        Temperature2 temperature = new Temperature2(temp);

        System.out.println("At " + temp + " degrees:");
        if (temperature.isEthylFreezing()) {
            System.out.println("- Ethyl Alcohol will freeze.");
        }
        if (temperature.isEthylBoiling()) {
            System.out.println("- Ethyl Alcohol will boil.");
        }
        if (temperature.isOxygenFreezing()) {
            System.out.println("- Oxygen will freeze.");
        }
        if (temperature.isOxygenBoiling()) {
            System.out.println("- Oxygen will boil.");
        }
        if (temperature.isWaterFreezing()) {
            System.out.println("- Water will freeze.");
        }
        if (temperature.isWaterBoiling()) {
            System.out.println("- Water will boil.");
        }

        scanner.close();
    }
}