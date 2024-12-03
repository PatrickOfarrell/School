public class RetailItem {
    private String description;
    private int unitsOnHand;
    private double price;

    // Constructor
    public RetailItem(String description, int unitsOnHand, double price) {
        this.description = description;
        this.unitsOnHand = unitsOnHand;
        this.price = price;
    }

    // Accessors
    public String getDescription() { return description; }
    public int getUnitsOnHand() { return unitsOnHand; }
    public double getPrice() { return price; }

    // Mutators
    public void setDescription(String description) { this.description = description; }
    public void setUnitsOnHand(int unitsOnHand) { this.unitsOnHand = unitsOnHand; }
    public void setPrice(double price) { this.price = price; }

    // Main program to test
    public static void main(String[] args) {
        RetailItem item1 = new RetailItem("Jacket", 12, 59.95);
        RetailItem item2 = new RetailItem("Designer Jeans", 40, 34.95);
        RetailItem item3 = new RetailItem("Shirt", 20, 24.95);

        System.out.printf("%-20s %-15s %-10s%n", "Description", "Units on Hand", "Price");
        System.out.printf("%-20s %-15d $%-10.2f%n", item1.getDescription(), item1.getUnitsOnHand(), item1.getPrice());
        System.out.printf("%-20s %-15d $%-10.2f%n", item2.getDescription(), item2.getUnitsOnHand(), item2.getPrice());
        System.out.printf("%-20s %-15d $%-10.2f%n", item3.getDescription(), item3.getUnitsOnHand(), item3.getPrice());
    }
}