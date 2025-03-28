import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int n = getIntegerInput();
        int sum = calculateSum(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }

    public static int getIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        return scanner.nextInt();
    }

    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

