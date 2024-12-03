public class PatientChargesDemo {
    public static void main(String[] args) {
        // Create a Patient instance
        Patient patient = new Patient("John", "A.", "Doe", "123 Elm St",
                                      "Springfield", "IL", "62701", 
                                      "555-1234", "Jane Doe", "555-5678");

        // Create Procedure instances
        Procedure procedure1 = new Procedure("Physical Exam", "2024-12-02", "Dr. Jamison", 500.00);
        Procedure procedure2 = new Procedure("X-ray", "2024-12-02", "Dr. Smith", 200.00);
        Procedure procedure3 = new Procedure("Blood Test", "2024-12-02", "Dr. Irvine", 250.00);

        // Display Patient and Procedure information
        System.out.println("Patient Information:");
        System.out.println("Name: " + patient.getFullName());
        System.out.println("Address: " + patient.getAddress());
        System.out.println("Phone: " + patient.getPhoneNumber());
        System.out.println("Emergency Contact: " + patient.getEmergencyContact());
        System.out.println();

        System.out.println("Procedures:");
        System.out.println(procedure1.getProcedureDetails());
        System.out.println(procedure2.getProcedureDetails());
        System.out.println(procedure3.getProcedureDetails());

        // Calculate total charges
        double totalCharges = procedure1.getCharge() + procedure2.getCharge() + procedure3.getCharge();
        System.out.printf("Total Charges: $%.2f%n", totalCharges);
    }
}