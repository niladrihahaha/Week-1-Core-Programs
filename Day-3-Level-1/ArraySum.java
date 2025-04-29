
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter up to 10 numbers (enter 0 or negative to stop):");

        while (true) {
            System.out.print("Enter number " + (index + 1) + ": ");
            double input = scanner.nextDouble();

            if (input <= 0) {
                break;
            }

            numbers[index] = input;
            index++;

            if (index == 10) {
                System.out.println("Maximum array size reached.");
                break;
            }
        }

        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i];
        }

        System.out.println("\nSum of all numbers: " + total);

        scanner.close();
    }
}

