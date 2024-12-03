public class PhoneBookEntry {
    // Fields for name and phone number
    private String name;
    private String phoneNumber;

    // Constructor to initialize the name and phone number
    public PhoneBookEntry(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // Accessor methods
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Mutator methods
    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Method to display the contents of the phone book entry
    public void displayEntry() {
        System.out.println("Name: " + name + ", Phone Number: " + phoneNumber);
    }
}