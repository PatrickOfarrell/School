import java.util.Scanner;

public class Circle {
    private double radius;
    public static final double PI = 3.14159;

    // Constructors
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this.radius = 0.0;
    }

    // Accessor
    public double getRadius() {
        return radius;
    }

    // Mutator
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double area() {
        return PI * radius * radius;
    }

    // Method to calculate diameter
    public double diameter() {
        return radius * 2;
    }

    // Method to calculate circumference
    public double circumference() {
        return 2 * PI * radius;
    }

    // Main program to test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);

        System.out.printf("Area: %.2f%n", circle.area());
        System.out.printf("Diameter: %.2f%n", circle.diameter());
        System.out.printf("Circumference: %.2f%n", circle.circumference());

        scanner.close();
    }
}