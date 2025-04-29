import java.util.Scanner;

public class FactorsFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();
        
        if (number <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }
        
        System.out.println("Factors of " + number + " are:");
        
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        
        scanner.close();
    }
}
