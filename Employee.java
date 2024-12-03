public class Employee {
    private String name;
    private int idNumber;
    private String department;
    private String position;

    // Constructors
    public Employee(String name, int idNumber, String department, String position) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }

    public Employee(String name, int idNumber) {
        this(name, idNumber, "", "");
    }

    public Employee() {
        this("", 0, "", "");
    }

    // Accessors and Mutators
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getIdNumber() { return idNumber; }
    public void setIdNumber(int idNumber) { this.idNumber = idNumber; }
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

    // Main program to test
    public static void main(String[] args) {
        Employee emp1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee emp2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee emp3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");

        System.out.printf("%-15s %-10s %-15s %-15s%n", "Name", "ID Number", "Department", "Position");
        System.out.printf("%-15s %-10d %-15s %-15s%n", emp1.getName(), emp1.getIdNumber(), emp1.getDepartment(), emp1.getPosition());
        System.out.printf("%-15s %-10d %-15s %-15s%n", emp2.getName(), emp2.getIdNumber(), emp2.getDepartment(), emp2.getPosition());
        System.out.printf("%-15s %-10d %-15s %-15s%n", emp3.getName(), emp3.getIdNumber(), emp3.getDepartment(), emp3.getPosition());
    }
}