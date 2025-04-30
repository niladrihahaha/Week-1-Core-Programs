package Day8ProblemStatementsPART2;

import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = takeInput(scanner, "Enter the first number: ");
        int num2 = takeInput(scanner, "Enter the second number: ");
        int num3 = takeInput(scanner, "Enter the third number: ");
        int max = findMax(num1, num2, num3);
        System.out.println("The maximum number is: " + max);
    }

    static int takeInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
