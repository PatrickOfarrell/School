import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {

    public static void main(String[] args) {
        // List to store the responses
        List<String> responses = new ArrayList<>();
        
        // Load the responses from the file
        try (BufferedReader reader = new BufferedReader(new FileReader("8_ball_responses.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                responses.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        String userResponse;
        
        // Keep the program running until the user decides to quit
        do {
            System.out.println("Ask a yes or no question:");
            scanner.nextLine();  // Wait for user input

            // Select a random response
            Random random = new Random();
            String randomResponse = responses.get(random.nextInt(responses.size()));

            // Display the random response
            System.out.println(randomResponse);

            // Ask the user if they want to ask another question
            System.out.print("Do you want to ask another question? (yes/no): ");
            userResponse = scanner.nextLine();
        } while (userResponse.equalsIgnoreCase("yes"));
        
        System.out.println("Goodbye!");
    }
}
