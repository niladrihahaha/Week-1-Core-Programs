package Day8ProblemStatementsPART2;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int min = 1, max = 100;
        System.out.println("Think of a number between 1 and 100.");

        while (true) {
            int guess = generateGuess(min, max, random);
            System.out.println("My guess is: " + guess);
            String feedback = getFeedback(scanner);
            if (feedback.equals("correct")) {
                System.out.println("I guessed it!");
                break;
            } else if (feedback.equals("high")) {
                max = guess - 1;
            } else {
                min = guess + 1;
            }
        }
    }

    static int generateGuess(int min, int max, Random random) {
        return random.nextInt(max - min + 1) + min;
    }

    static String getFeedback(Scanner scanner) {
        System.out.print("Is my guess high, low, or correct? ");
        return scanner.next().toLowerCase();
    }
}

