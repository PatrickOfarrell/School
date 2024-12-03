public class DiceGame {
    public static void main(String[] args) {
        final int ROUNDS = 10;

        Die computerDie = new Die(6);
        Die userDie = new Die(6);

        int computerWins = 0;
        int userWins = 0;

        // Loop for 10 rounds
        for (int round = 1; round <= ROUNDS; round++) {
            computerDie.roll();
            userDie.roll();

            int computerRoll = computerDie.getValue();
            int userRoll = userDie.getValue();

            System.out.printf("Round %d: Computer rolled %d, User rolled %d%n", round, computerRoll, userRoll);

            if (computerRoll > userRoll) {
                computerWins++;
                System.out.println("Computer wins this round!");
            } else if (userRoll > computerRoll) {
                userWins++;
                System.out.println("User wins this round!");
            } else {
                System.out.println("It's a tie!");
            }
            System.out.println();
        }

        // Display final results
        System.out.printf("Final Results:%nComputer Wins: %d%nUser Wins: %d%n", computerWins, userWins);

        if (computerWins > userWins) {
            System.out.println("Grand Winner: Computer!");
        } else if (userWins > computerWins) {
            System.out.println("Grand Winner: User!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}