import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double total = 0.0;
        double userInput;
        
        System.out.println("Enter numbers to add (enter 0 to stop):");
        userInput = scanner.nextDouble();
        
        while (userInput != 0) {
            total += userInput;
            System.out.print("Enter another number (0 to stop): ");
            userInput = scanner.nextDouble();
        }
        
        System.out.println("The sum of all numbers entered is: " + total);
        
        scanner.close();
    }
}
