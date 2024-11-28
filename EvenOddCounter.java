import java.util.Random;

public class EvenOddCounter {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < 100; i++) {
            int number = random.nextInt(1000); // Generate random numbers up to 1000
            if (isEven(number)) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.printf("Number of even numbers: %d\n", evenCount);
        System.out.printf("Number of odd numbers: %d\n", oddCount);
    }
}