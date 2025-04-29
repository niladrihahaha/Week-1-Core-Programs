import java.util.Scanner;

public class SumNaturalNumbersFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (number < 0) {
            System.out.println("The number " + number + " is not a natural number");
        } else {
            // Calculate using formula
            int formulaSum = number * (number + 1) / 2;
            
            // Calculate using for loop
            int forSum = 0;
            
            for (int i = 1; i <= number; i++) {
                forSum += i;
            }
            
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + forSum);
            System.out.println("Both results match: " + (formulaSum == forSum));
        }
        
        scanner.close();
    }
}
