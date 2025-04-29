import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();

        double[] weights = new double[numberOfPersons];
        double[] heights = new double[numberOfPersons];
        double[] bmis = new double[numberOfPersons];
        String[] statuses = new String[numberOfPersons];

        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("\nEnter details for person " + (i + 1) + ":");

            System.out.print("Enter weight (in kg): ");
            weights[i] = scanner.nextDouble();

            while (weights[i] <= 0) {
                System.out.println("Invalid weight. Please enter a positive value.");
                System.out.print("Enter weight (in kg): ");
                weights[i] = scanner.nextDouble();
            }

            System.out.print("Enter height (in meters): ");
            heights[i] = scanner.nextDouble();

            while (heights[i] <= 0) {
                System.out.println("Invalid height. Please enter a positive value.");
                System.out.print("Enter height (in meters): ");
                heights[i] = scanner.nextDouble();
            }

            bmis[i] = weights[i] / (heights[i] * heights[i]);

            if (bmis[i] < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmis[i] < 25) {
                statuses[i] = "Normal weight";
            } else if (bmis[i] < 30) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obesity";
            }
        }

        System.out.println("\nBMI Results:");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.println("  Weight: " + weights[i] + " kg");
            System.out.println("  Height: " + heights[i] + " m");
            System.out.println("  BMI: " + bmis[i]);
            System.out.println("  Status: " + statuses[i]);
        }

        scanner.close();
    }
}


