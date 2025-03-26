import java.util.Scanner;

public class HarshadNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int originalNumber = number;
        int sum = 0;
        
        // Calculate sum of digits
        while (number != 0) {
            sum += number % 10;  // Add last digit to sum
            number /= 10;        // Remove last digit
        }
        
        // Check if original number is divisible by sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number");
        }
        
        scanner.close();
    }
}
