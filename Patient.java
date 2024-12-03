public class Patient {
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String phoneNumber;
    private String emergencyContactName;
    private String emergencyContactPhone;

    // Constructor
    public Patient(String firstName, String middleName, String lastName, String address, 
                   String city, String state, String zipCode, String phoneNumber,
                   String emergencyContactName, String emergencyContactPhone) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.emergencyContactName = emergencyContactName;
        this.emergencyContactPhone = emergencyContactPhone;
    }

    // Accessors
    public String getFullName() {
        return firstName + " " + middleName + " " + lastName;
    }

    public String getAddress() {
        return address + ", " + city + ", " + state + " " + zipCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmergencyContact() {
        return emergencyContactName + " (" + emergencyContactPhone + ")";
    }
}
