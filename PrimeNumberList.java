import java.io.FileWriter;
import java.io.IOException;

public class PrimeNumberList {
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("PrimeNumbers.txt")) {
            for (int i = 1; i <= 100; i++) {
                if (isPrime(i)) {
                    writer.write(i + "\n");
                }
            }
            System.out.println("Prime numbers from 1 to 100 have been written to PrimeNumbers.txt.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }
    }
}