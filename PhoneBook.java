import java.util.ArrayList;

public class PhoneBook {
    public static void main(String[] args) {
        // Create an ArrayList to store PhoneBookEntry objects
        ArrayList<PhoneBookEntry> phoneBook = new ArrayList<>();

        // Add at least five PhoneBookEntry objects to the ArrayList
        phoneBook.add(new PhoneBookEntry("John Doe", "555-1234"));
        phoneBook.add(new PhoneBookEntry("Jane Smith", "555-5678"));
        phoneBook.add(new PhoneBookEntry("Alice Johnson", "555-8765"));
        phoneBook.add(new PhoneBookEntry("Bob Brown", "555-4321"));
        phoneBook.add(new PhoneBookEntry("Charlie Davis", "555-6789"));

        // Use a loop to display the contents of each object in the ArrayList
        for (PhoneBookEntry entry : phoneBook) {
            entry.displayEntry();
        }
    }
}