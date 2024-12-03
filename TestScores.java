import java.util.Scanner;

public class TestScores {
    private double score1;
    private double score2;
    private double score3;

    // Constructor
    public TestScores(double score1, double score2, double score3) {
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }

    // Accessors
    public double getScore1() { return score1; }
    public double getScore2() { return score2; }
    public double getScore3() { return score3; }

    // Mutators
    public void setScore1(double score1) { this.score1 = score1; }
    public void setScore2(double score2) { this.score2 = score2; }
    public void setScore3(double score3) { this.score3 = score3; }

    // Method to calculate average
    public double getAverage() {
        return (score1 + score2 + score3) / 3.0;
    }

    // Main program to test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first test score: ");
        double score1 = scanner.nextDouble();
        System.out.print("Enter second test score: ");
        double score2 = scanner.nextDouble();
        System.out.print("Enter third test score: ");
        double score3 = scanner.nextDouble();

        TestScores testScores = new TestScores(score1, score2, score3);
        System.out.println("The average score is: " + testScores.getAverage());

        scanner.close();
    }
}