import java.util.Scanner;

class QuotientRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take two numbers as inputs
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        // Calculate quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Display results
        System.out.println("The Quotient is: " + quotient);
        System.out.println("The Remainder is: " + remainder);

        input.close();
    }
}
