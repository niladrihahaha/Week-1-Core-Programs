import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double total = 0.0;
        double userInput;
        
        System.out.println("Enter numbers to add (enter 0 or negative number to stop):");
        
        while (true) {
            userInput = scanner.nextDouble();
            
            if (userInput <= 0) {
                break;
            }
            
            total += userInput;
            System.out.print("Enter another number (0 or negative to stop): ");
        }
        
        System.out.println("The sum of all numbers entered is: " + total);
        
        scanner.close();
    }
}
