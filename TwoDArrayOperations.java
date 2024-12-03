public class TwoDArrayOperations {

    public static void main(String[] args) {
        // Initialize a 2D array with test data
        int[][] array = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        // Display the results of various operations
        System.out.println("Total of all values: " + getTotal(array));
        System.out.println("Average of all values: " + getAverage(array));
        System.out.println("Total of row 2: " + getRowTotal(array, 1)); // Row index starts at 0
        System.out.println("Total of column 3: " + getColumnTotal(array, 2)); // Column index starts at 0
        System.out.println("Highest in row 1: " + getHighestInRow(array, 0));
        System.out.println("Lowest in row 3: " + getLowestInRow(array, 2));
    }

    // Method to get total of all values in the 2D array
    public static int getTotal(int[][] array) {
        int total = 0;
        for (int[] row : array) {
            for (int value : row) {
                total += value;
            }
        }
        return total;
    }

    // Method to get average of all values in the 2D array
    public static double getAverage(int[][] array) {
        int total = getTotal(array);
        int numberOfValues = array.length * array[0].length; // Total number of elements
        return (double) total / numberOfValues;
    }

    // Method to get total of values in a specific row
    public static int getRowTotal(int[][] array, int row) {
        int total = 0;
        for (int value : array[row]) {
            total += value;
        }
        return total;
    }

    // Method to get total of values in a specific column
    public static int getColumnTotal(int[][] array, int col) {
        int total = 0;
        for (int[] row : array) {
            total += row[col];
        }
        return total;
    }

    // Method to get the highest value in a specific row
    public static int getHighestInRow(int[][] array, int row) {
        int highest = array[row][0];
        for (int value : array[row]) {
            if (value > highest) {
                highest = value;
            }
        }
        return highest;
    }

    // Method to get the lowest value in a specific row
    public static int getLowestInRow(int[][] array, int row) {
        int lowest = array[row][0];
        for (int value : array[row]) {
            if (value < lowest) {
                lowest = value;
            }
        }
        return lowest;
    }
}