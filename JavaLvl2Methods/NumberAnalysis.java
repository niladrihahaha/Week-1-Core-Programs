package JavaLvl2Methods;

import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Get 5 numbers from user
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            numbers[i] = scanner.nextInt();

            if (isPositive(numbers[i])) {
                System.out.print(numbers[i] + " is positive and ");
                if (isEven(numbers[i])) {
                    System.out.println("even");
                } else {
                    System.out.println("odd");
                }
            } else {
                System.out.println(numbers[i] + " is negative");
            }
        }

        // Compare first and last elements
        int comparisonResult = compare(numbers[0], numbers[4]);
        if (comparisonResult > 0) {
            System.out.println("First element is greater than last element");
        } else if (comparisonResult < 0) {
            System.out.println("First element is less than last element");
        } else {
            System.out.println("First element is equal to last element");
        }

        scanner.close();
    }

    public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compare(int number1, int number2) {
        if (number1 > number2) return 1;
        if (number1 < number2) return -1;
        return 0;
    }
}

