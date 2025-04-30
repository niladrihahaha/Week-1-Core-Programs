
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int tempNumber = Math.abs(number);
        int digitCount = 0;

        int temp = tempNumber;
        while (temp > 0) {
            digitCount++;
            temp /= 10;
        }

        int[] digits = new int[digitCount];

        for (int i = 0; i < digitCount; i++) {
            digits[i] = tempNumber % 10;
            tempNumber /= 10;
        }

        System.out.print("Reversed number: ");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(digits[i]);
        }

        scanner.close();
    }
}

