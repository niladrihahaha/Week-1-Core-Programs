import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of games:");
        int n = scanner.nextInt();

        int playerWins = 0;
        int computerWins = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter your choice (rock, paper, scissors):");
            String playerChoice = scanner.next();
            String computerChoice = getComputerChoice();

            System.out.println("Computer chose: " + computerChoice);

            String winner = determineWinner(playerChoice, computerChoice);
            if (winner.equals("Player")) {
                playerWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            }

            System.out.println(winner + " wins this round.\n");
        }

        String[][] stats = getGameStats(playerWins, computerWins, n);
        displayGameStats(stats);
    }

    public static String getComputerChoice() {
        Random random = new Random();
        int choice = random.nextInt(3);
        switch (choice) {
            case 0:
                return "rock";
            case 1:
                return "paper";
            default:
                return "scissors";
        }
    }

    public static String determineWinner(String player, String computer) {
        if (player.equals(computer)) {
            return "Tie";
        }
        if ((player.equals("rock") && computer.equals("scissors")) ||
                (player.equals("scissors") && computer.equals("paper")) ||
                (player.equals("paper") && computer.equals("rock"))) {
            return "Player";
        }
        return "Computer";
    }

    public static String[][] getGameStats(int playerWins, int computerWins, int totalGames) {
        double playerPercentage = ((double) playerWins / totalGames) * 100;
        double computerPercentage = ((double) computerWins / totalGames) * 100;

        String[][] stats = new String[2][3];
        stats[0][0] = "Player";
        stats[0][1] = String.valueOf(playerWins);
        stats[0][2] = String.format("%.2f%%", playerPercentage);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f%%", computerPercentage);

        return stats;
    }

    public static void displayGameStats(String[][] stats) {
        System.out.println("Player\tWins\tWin Percentage");
        System.out.println("------\t----\t--------------");
        for (String[] row : stats) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2]);
        }
    }
}

