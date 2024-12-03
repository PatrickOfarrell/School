import java.util.Scanner;

public class DriverExam {

    // Correct answers for the exam
    private static final char[] correctAnswers = {
        'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D', 
        'B', 'C', 'D', 'A', 'D', 'C', 'C', 'B', 'D', 'A'
    };
    
    // Student's answers
    private char[] studentAnswers;

    // Constructor to initialize student's answers
    public DriverExam(char[] studentAnswers) {
        this.studentAnswers = studentAnswers;
    }

    // Method to check if the student passed the exam (15 correct answers required)
    public boolean passed() {
        return totalCorrect() >= 15;
    }

    // Method to count total correct answers
    public int totalCorrect() {
        int correctCount = 0;
        for (int i = 0; i < correctAnswers.length; i++) {
            if (studentAnswers[i] == correctAnswers[i]) {
                correctCount++;
            }
        }
        return correctCount;
    }

    // Method to count total incorrect answers
    public int totalIncorrect() {
        return 20 - totalCorrect();
    }

    // Method to get the list of missed questions
    public int[] questionsMissed() {
        int[] missedQuestions = new int[20];
        int missedCount = 0;
        for (int i = 0; i < correctAnswers.length; i++) {
            if (studentAnswers[i] != correctAnswers[i]) {
                missedQuestions[missedCount++] = i + 1;  // Question number is index + 1
            }
        }
        // Trim the array to the actual number of missed questions
        int[] result = new int[missedCount];
        System.arraycopy(missedQuestions, 0, result, 0, missedCount);
        return result;
    }

    // Method to validate the input answer
    public static boolean isValidAnswer(char answer) {
        return answer == 'A' || answer == 'B' || answer == 'C' || answer == 'D';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store student's answers
        char[] studentAnswers = new char[20];

        // Ask user to enter answers for each question
        System.out.println("Enter your answers for the 20 questions (A, B, C, or D): ");
        for (int i = 0; i < 20; i++) {
            System.out.print("Question " + (i + 1) + ": ");
            char answer = scanner.next().toUpperCase().charAt(0);

            // Validate the input
            while (!isValidAnswer(answer)) {
                System.out.print("Invalid answer. Please enter A, B, C, or D: ");
                answer = scanner.next().toUpperCase().charAt(0);
            }
            studentAnswers[i] = answer;
        }

        // Create a DriverExam object with the student's answers
        DriverExam exam = new DriverExam(studentAnswers);

        // Display the results
        System.out.println("Total Correct: " + exam.totalCorrect());
        System.out.println("Total Incorrect: " + exam.totalIncorrect());

        // Display missed questions
        int[] missedQuestions = exam.questionsMissed();
        System.out.print("Questions Missed: ");
        for (int question : missedQuestions) {
            System.out.print(question + " ");
        }

        // Check if the student passed
        if (exam.passed()) {
            System.out.println("\nCongratulations! You passed the exam.");
        } else {
            System.out.println("\nSorry, you did not pass the exam.");
        }
    }
}
