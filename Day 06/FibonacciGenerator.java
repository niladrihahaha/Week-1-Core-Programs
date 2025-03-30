package Day8ProblemStatementsPART2;

import java.util.Scanner;

public class FibonacciGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci sequence: ");
        int terms = scanner.nextInt();
        generateFibonacci(terms);
    }

    static void generateFibonacci(int terms) {
        int a = 0, b = 1;
        System.out.print("Fibonacci sequence up to " + terms + " terms: ");
        for (int i = 0; i < terms; i++) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
    }
}

