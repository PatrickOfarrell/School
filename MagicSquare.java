public class MagicSquare {

    // Method to check if a given 3x3 array is a Lo Shu Magic Square
    public static boolean isLoShuMagicSquare(int[][] square) {
        // Check if the 3x3 array contains numbers 1 through 9 exactly once
        boolean[] numbers = new boolean[10]; // To track if numbers 1 to 9 are present

        // Fill the array and check if each number from 1 to 9 is used exactly once
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int num = square[i][j];
                if (num < 1 || num > 9 || numbers[num]) {
                    return false;  // Number is out of range or repeated
                }
                numbers[num] = true;
            }
        }

        // Check if the sum of each row, each column, and both diagonals is 15
        int sum = 15;

        // Check rows
        for (int i = 0; i < 3; i++) {
            int rowSum = 0;
            for (int j = 0; j < 3; j++) {
                rowSum += square[i][j];
            }
            if (rowSum != sum) {
                return false;
            }
        }

        // Check columns
        for (int i = 0; i < 3; i++) {
            int colSum = 0;
            for (int j = 0; j < 3; j++) {
                colSum += square[j][i];
            }
            if (colSum != sum) {
                return false;
            }
        }

        // Check diagonals
        int diag1Sum = square[0][0] + square[1][1] + square[2][2];
        int diag2Sum = square[0][2] + square[1][1] + square[2][0];

        if (diag1Sum != sum || diag2Sum != sum) {
            return false;
        }

        // If all checks pass, it is a Lo Shu Magic Square
        return true;
    }

    public static void main(String[] args) {
        // Define a Lo Shu Magic Square
        int[][] magicSquare = {
            {4, 9, 2},
            {3, 5, 7},
            {8, 1, 6}
        };

        // Test the method
        if (isLoShuMagicSquare(magicSquare)) {
            System.out.println("The array is a Lo Shu Magic Square!");
        } else {
            System.out.println("The array is NOT a Lo Shu Magic Square.");
        }
    }
}