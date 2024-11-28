public class FallingDistance {
    public static double fallingDistance(double time) {
        final double g = 9.8; // Acceleration due to gravity
        return 0.5 * g * time * time;
    }

    public static void main(String[] args) {
        System.out.println("Time (s)   Falling Distance (m)");
        System.out.println("-------------------------------");
        for (int t = 1; t <= 10; t++) {
            System.out.printf("%-10d %.2f\n", t, fallingDistance(t));
        }
    }
}
