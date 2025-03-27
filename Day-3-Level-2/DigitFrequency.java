import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        long tempNumber = Math.abs(number);
        int digitCount = 0;

        long temp = tempNumber;
        while (temp > 0) {
            digitCount++;
            temp /= 10;
        }

        int[] digits = new int[digitCount];

        for (int i = 0; i < digitCount; i++) {
            digits[i] = (int)(tempNumber % 10);
            tempNumber /= 10;
        }

        int[] frequency = new int[10];

        for (int i = 0; i < digitCount; i++) {
            frequency[digits[i]]++;
        }

        System.out.println("\nFrequency of each digit in " + number + ":");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " time(s)");
            }
        }

        scanner.close();
    }
}