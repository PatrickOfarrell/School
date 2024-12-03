import java.util.Random;

public class Die {
    private int sides;  // Number of sides on the die
    private int value;  // The die's value

    // Constructor
    public Die(int sides) {
        this.sides = sides;
        roll();
    }

    // Roll the die
    public void roll() {
        Random rand = new Random();
        value = rand.nextInt(sides) + 1;
    }

    // Get the die's value
    public int getValue() {
        return value;
    }
}