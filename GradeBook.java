import java.util.Scanner;

public class GradeBook {

    // Arrays to store student names, grades, and test scores
    private String[] studentNames = new String[5];
    private char[] letterGrades = new char[5];
    private double[][] testScores = new double[5][4];

    // Method to enter student data
    public void enterStudentData() {
        Scanner scanner = new Scanner(System.in);

        // Collecting data for each student
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter student " + (i + 1) + "'s name: ");
            studentNames[i] = scanner.nextLine();

            // Collecting test scores for each student
            for (int j = 0; j < 4; j++) {
                double score;
                do {
                    System.out.print("Enter score " + (j + 1) + " for " + studentNames[i] + ": ");
                    score = scanner.nextDouble();
                    if (score < 0 || score > 100) {
                        System.out.println("Invalid input. Test score must be between 0 and 100.");
                    }
                } while (score < 0 || score > 100);
                testScores[i][j] = score;
            }
            scanner.nextLine();  // Consume the newline character
        }
    }

    // Method to calculate the average test score for a student
    public double calculateAverage(int studentIndex) {
        double total = 0;
        for (double score : testScores[studentIndex]) {
            total += score;
        }
        return total / 4;
    }

    // Method to assign a letter grade based on the average score
    public char assignLetterGrade(double average) {
        if (average >= 90) {
            return 'A';
        } else if (average >= 80) {
            return 'B';
        } else if (average >= 70) {
            return 'C';
        } else if (average >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    // Method to display the results
    public void displayResults() {
        System.out.println("\nGrade Book Results:");
        for (int i = 0; i < 5; i++) {
            double average = calculateAverage(i);
            letterGrades[i] = assignLetterGrade(average);
            System.out.println("Student: " + studentNames[i]);
            System.out.println("Average Score: " + average);
            System.out.println("Letter Grade: " + letterGrades[i]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GradeBook gradeBook = new GradeBook();
        gradeBook.enterStudentData();
        gradeBook.displayResults();
    }
}