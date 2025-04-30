
import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();

        double[][] personData = new double[numberOfPersons][3]; // [weight, height, BMI]
        String[] weightStatus = new String[numberOfPersons];

        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("\nEnter details for person " + (i + 1) + ":");

            System.out.print("Enter weight (in kg): ");
            personData[i][0] = scanner.nextDouble();

            while (personData[i][0] <= 0) {
                System.out.println("Invalid weight. Please enter a positive value.");
                System.out.print("Enter weight (in kg): ");
                personData[i][0] = scanner.nextDouble();
            }

            System.out.print("Enter height (in meters): ");
            personData[i][1] = scanner.nextDouble();

            while (personData[i][1] <= 0) {
                System.out.println("Invalid height. Please enter a positive value.");
                System.out.print("Enter height (in meters): ");
                personData[i][1] = scanner.nextDouble();
            }

            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 25) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }

        System.out.println("\nBMI Results:");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.println("  Weight: " + personData[i][0] + " kg");
            System.out.println("  Height: " + personData[i][1] + " m");
            System.out.println("  BMI: " + personData[i][2]);
            System.out.println("  Status: " + weightStatus[i]);
        }

        scanner.close();
    }
}

