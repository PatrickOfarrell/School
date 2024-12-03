import java.util.Scanner;

public class TriviaGame {

    public static void main(String[] args) {
        // Create an array of 10 trivia questions
        Question[] questions = {
            new Question("What is the capital of France?", "Paris", "London", "Berlin", "Madrid", 1),
            new Question("Which planet is known as the Red Planet?", "Earth", "Mars", "Jupiter", "Venus", 2),
            new Question("Who wrote 'Romeo and Juliet'?", "Shakespeare", "Dickens", "Hemingway", "Austen", 1),
            new Question("What is 5 + 3?", "6", "8", "10", "12", 2),
            new Question("Which animal is known as the King of the Jungle?", "Lion", "Tiger", "Elephant", "Bear", 1),
            new Question("What is the square root of 64?", "6", "7", "8", "9", 3),
            new Question("Who painted the Mona Lisa?", "Van Gogh", "Da Vinci", "Picasso", "Rembrandt", 2),
            new Question("What is the longest river in the world?", "Amazon", "Nile", "Yangtze", "Mississippi", 2),
            new Question("What is the smallest planet in our solar system?", "Mercury", "Mars", "Venus", "Earth", 1),
            new Question("What year did World War II end?", "1945", "1939", "1918", "1965", 1)
        };

        Scanner scanner = new Scanner(System.in);

        int player1Score = 0;
        int player2Score = 0;

        // Player 1's turn
        System.out.println("Player 1's Turn:");
        player1Score = askQuestions(scanner, questions, 1);

        // Player 2's turn
        System.out.println("Player 2's Turn:");
        player2Score = askQuestions(scanner, questions, 6);

        // Display the results
        System.out.println("Player 1 Score: " + player1Score);
        System.out.println("Player 2 Score: " + player2Score);

        if (player1Score > player2Score) {
            System.out.println("Player 1 is the Winner!");
        } else if (player2Score > player1Score) {
            System.out.println("Player 2 is the Winner!");
        } else {
            System.out.println("It's a Tie!");
        }
    }

    // Method to ask questions to the player
    public static int askQuestions(Scanner scanner, Question[] questions, int startIndex) {
        int score = 0;

        for (int i = startIndex - 1; i < startIndex + 4; i++) {
            Question question = questions[i];
            System.out.println(question.getQuestion());
            System.out.println("1. " + question.getAnswer1());
            System.out.println("2. " + question.getAnswer2());
            System.out.println("3. " + question.getAnswer3());
            System.out.println("4. " + question.getAnswer4());
            System.out.print("Enter your answer (1-4): ");
            int answer = scanner.nextInt();

            if (answer == question.getCorrectAnswer()) {
                score++;
            }
        }
        return score;
    }
}