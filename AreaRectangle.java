import java.util.Scanner;

public class AreaRectangle {
    public static double getLength() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        return scanner.nextDouble();
    }

    public static double getWidth() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width of the rectangle: ");
        return scanner.nextDouble();
    }

    public static double getArea(double length, double width) {
        return length * width;
    }

    public static void displayData(double length, double width, double area) {
        System.out.printf("Length: %.2f\nWidth: %.2f\nArea: %.2f\n", length, width, area);
    }

    public static void main(String[] args) {
        double length = getLength();
        double width = getWidth();
        double area = getArea(length, width);
        displayData(length, width, area);
    }
}
