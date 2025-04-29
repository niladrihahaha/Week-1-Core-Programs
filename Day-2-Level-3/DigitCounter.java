import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Handle negative numbers
        number = Math.abs(number);
        
        // Count digits
        int count = 0;
        
        // Special case for 0
        if (number == 0) {
            count = 1;
        } else {
            while (number != 0) {
                number /= 10;  // Remove last digit
                count++;
            }
        }
        
        System.out.println("Number of digits: " + count);
        
        scanner.close();
    }
}
