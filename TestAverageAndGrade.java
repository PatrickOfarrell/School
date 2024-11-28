import java.util.Scanner;

public class TestAverageAndGrade {
    public static double calcAverage(int[] scores) {
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        return (double) total / scores.length;
    }

    public static char determineGrade(int score) {
        if (score >= 90) return 'A';
        else if (score >= 80) return 'B';
        else if (score >= 70) return 'C';
        else if (score >= 60) return 'D';
        else return 'F';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[5];
        
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
        }

        System.out.println("\nScores and Grades:");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("Score %d: %d - Grade: %c\n", i + 1, scores[i], determineGrade(scores[i]));
        }

        double average = calcAverage(scores);
        System.out.printf("\nAverage score: %.2f\n", average);
        System.out.printf("Average grade: %c\n", determineGrade((int) average));

        scanner.close();
    }
}