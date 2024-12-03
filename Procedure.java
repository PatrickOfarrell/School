public class Procedure {
    private String procedureName;
    private String date;
    private String practitioner;
    private double charge;

    // Constructor
    public Procedure(String procedureName, String date, String practitioner, double charge) {
        this.procedureName = procedureName;
        this.date = date;
        this.practitioner = practitioner;
        this.charge = charge;
    }

    // Accessors
    public String getProcedureName() {
        return procedureName;
    }

    public String getDate() {
        return date;
    }

    public String getPractitioner() {
        return practitioner;
    }

    public double getCharge() {
        return charge;
    }

    public String getProcedureDetails() {
        return String.format("Procedure: %s%nDate: %s%nPractitioner: %s%nCharge: $%.2f%n",
                             procedureName, date, practitioner, charge);
    }
}