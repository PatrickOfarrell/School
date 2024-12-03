public class PersonalInformation {
    private String name;
    private String address;
    private int age;
    private String phoneNumber;

    // Constructor
    public PersonalInformation(String name, String address, int age, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    // Accessors
    public String getName() { return name; }
    public String getAddress() { return address; }
    public int getAge() { return age; }
    public String getPhoneNumber() { return phoneNumber; }

    // Main program to test
    public static void main(String[] args) {
        PersonalInformation me = new PersonalInformation("John Doe", "123 Main St", 25, "555-1234");
        PersonalInformation friend1 = new PersonalInformation("Jane Smith", "456 Maple St", 30, "555-5678");
        PersonalInformation friend2 = new PersonalInformation("Alice Johnson", "789 Oak St", 28, "555-8765");

        System.out.println(me.getName() + ", " + me.getAddress() + ", " + me.getAge() + ", " + me.getPhoneNumber());
        System.out.println(friend1.getName() + ", " + friend1.getAddress() + ", " + friend1.getAge() + ", " + friend1.getPhoneNumber());
        System.out.println(friend2.getName() + ", " + friend2.getAddress() + ", " + friend2.getAge() + ", " + friend2.getPhoneNumber());
    }
}
