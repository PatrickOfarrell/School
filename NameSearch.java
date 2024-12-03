import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class NameSearch {

    public static void main(String[] args) {
        // Initialize lists to store names
        ArrayList<String> girlNames = new ArrayList<>();
        ArrayList<String> boyNames = new ArrayList<>();
        
        // Read the names from the files
        try {
            BufferedReader girlReader = new BufferedReader(new FileReader("GirlNames.txt"));
            String line;
            while ((line = girlReader.readLine()) != null) {
                girlNames.add(line);
            }
            girlReader.close();

            BufferedReader boyReader = new BufferedReader(new FileReader("BoyNames.txt"));
            while ((line = boyReader.readLine()) != null) {
                boyNames.add(line);
            }
            boyReader.close();
        } catch (IOException e) {
            System.out.println("Error reading files.");
            return;
        }

        // Prompt user to enter names
        Scanner scanner = new Scanner(System.in);

        // Check for girl’s name
        System.out.print("Enter a girl’s name: ");
        String girlName = scanner.nextLine();
        if (girlNames.contains(girlName)) {
            System.out.println(girlName + " is among the most popular girl names.");
        } else {
            System.out.println(girlName + " is NOT among the most popular girl names.");
        }

        // Check for boy’s name
        System.out.print("Enter a boy’s name: ");
        String boyName = scanner.nextLine();
        if (boyNames.contains(boyName)) {
            System.out.println(boyName + " is among the most popular boy names.");
        } else {
            System.out.println(boyName + " is NOT among the most popular boy names.");
        }
    }
}