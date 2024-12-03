public class ArrayOperations {
    
    // Method to get the total of the values in the array
    public static int getTotal(int[] array) {
        int total = 0;
        for (int num : array) {
            total += num;
        }
        return total;
    }

    // Method to get the average of the values in the array
    public static double getAverage(int[] array) {
        int total = getTotal(array);
        return (double) total / array.length;
    }

    // Method to get the highest value in the array
    public static int getHighest(int[] array) {
        int highest = array[0];
        for (int num : array) {
            if (num > highest) {
                highest = num;
            }
        }
        return highest;
    }

    // Method to get the lowest value in the array
    public static int getLowest(int[] array) {
        int lowest = array[0];
        for (int num : array) {
            if (num < lowest) {
                lowest = num;
            }
        }
        return lowest;
    }

    public static void main(String[] args) {
        // Test data: array of integers representing some test scores or values
        int[] data = {15, 22, 35, 40, 55, 70, 89, 91, 100};

        // Displaying the results of the methods
        System.out.println("Total: " + getTotal(data));
        System.out.println("Average: " + getAverage(data));
        System.out.println("Highest: " + getHighest(data));
        System.out.println("Lowest: " + getLowest(data));
    }
}