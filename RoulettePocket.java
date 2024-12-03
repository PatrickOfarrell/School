public class RoulettePocket {
    private int pocketNumber;

    // Constructor
    public RoulettePocket(int pocketNumber) {
        this.pocketNumber = pocketNumber;
    }

    // Method to get pocket color
    public String getPocketColor() {
        if (pocketNumber < 0 || pocketNumber > 36) {
            return "Invalid pocket number.";
        } else if (pocketNumber == 0) {
            return "Green";
        } else if (pocketNumber >= 1 && pocketNumber <= 10) {
            return (pocketNumber % 2 == 0) ? "Black" : "Red";
        } else if (pocketNumber >= 11 && pocketNumber <= 18) {
            return (pocketNumber % 2 == 0) ? "Red" : "Black";
        } else if (pocketNumber >= 19 && pocketNumber <= 28) {
            return (pocketNumber % 2 == 0) ? "Black" : "Red";
        } else {
            return (pocketNumber % 2 == 0) ? "Red" : "Black";
        }
    }
}