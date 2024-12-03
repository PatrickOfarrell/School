public class Car {
    private int yearModel;
    private String make;
    private int speed;

    // Constructor
    public Car(int yearModel, String make) {
        this.yearModel = yearModel;
        this.make = make;
        this.speed = 0;
    }

    // Accessors
    public int getYearModel() { return yearModel; }
    public String getMake() { return make; }
    public int getSpeed() { return speed; }

    // Mutators
    public void accelerate() { speed += 5; }
    public void brake() { if (speed >= 5) speed -= 5; }

    // Main program to test
    public static void main(String[] args) {
        Car car = new Car(2022, "Toyota");

        System.out.println("Accelerating:");
        for (int i = 0; i < 5; i++) {
            car.accelerate();
            System.out.println("Current speed: " + car.getSpeed());
        }

        System.out.println("Braking:");
        for (int i = 0; i < 5; i++) {
            car.brake();
            System.out.println("Current speed: " + car.getSpeed());
        }
    }
}