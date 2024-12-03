import java.util.Random;

public class Coin {
    private String sideUp;

    // Constructor
    public Coin() {
        toss();
    }

    // Toss the coin
    public void toss() {
        Random rand = new Random();
        sideUp = rand.nextBoolean() ? "heads" : "tails";
    }

    // Get the current side up
    public String getSideUp() {
        return sideUp;
    }
}