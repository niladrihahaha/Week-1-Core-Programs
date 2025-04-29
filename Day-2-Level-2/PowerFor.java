import java.util.Scanner;

public class PowerFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the base number: ");
        int number = scanner.nextInt();
        
        System.out.print("Enter the power (a positive integer): ");
        int power = scanner.nextInt();
        
        if (power < 0) {
            System.out.println("Please enter a non-negative power.");
            return;
        }
        
        int result = 1;
        
        for (int i = 1; i <= power; i++) {
            result *= number;
        }
        
        System.out.println(number + " raised to the power of " + power + " is: " + result);
        
        scanner.close();
    }
}

