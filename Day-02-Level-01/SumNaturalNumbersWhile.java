import java.util.Scanner;

public class SumNaturalNumbersWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (number < 0) {
            System.out.println("The number " + number + " is not a natural number");
        } else {
            // Calculate using formula
            int formulaSum = number * (number + 1) / 2;
            
            // Calculate using while loop
            int whileSum = 0;
            int counter = 1;
            
            while (counter <= number) {
                whileSum += counter;
                counter++;
            }
            
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + whileSum);
            System.out.println("Both results match: " + (formulaSum == whileSum));
        }
        
        scanner.close();
    }
}
