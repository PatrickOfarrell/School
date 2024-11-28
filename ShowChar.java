import java.util.Scanner;

public class ShowChar {
    public static void showChar(String str, int position) {
        if (position >= 0 && position < str.length()) {
            System.out.println("The character at position " + position + " is: " + str.charAt(position));
        } else {
            System.out.println("Invalid position.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Word: ");
        String inputString = scanner.nextLine();
        System.out.print("Enter a Position to search: ");
        int position = scanner.nextInt();
        showChar(inputString, position);
        scanner.close();
    }
}