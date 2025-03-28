package JavaLvl2Methods;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] personData = new double[10][3]; // [weight, height, BMI]
        String[] bmiStatus = new String[10];

        // Get weight and height for 10 people
        for (int i = 0; i < 10; i++) {
            System.out.println("\nPerson " + (i+1) + ":");
            System.out.print("Enter weight (in kg): ");
            personData[i][0] = scanner.nextDouble();

            System.out.print("Enter height (in cm): ");
            personData[i][1] = scanner.nextDouble();
        }

        // Calculate BMI for each person
        calculateBMI(personData);

        // Determine BMI status for each person
        bmiStatus = determineBMIStatus(personData);

        // Display results
        System.out.println("\nResults:");
        System.out.println("Person\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t\t%s\n",
                    (i+1), personData[i][0], personData[i][1], personData[i][2], bmiStatus[i]);
        }

        scanner.close();
    }

    public static void calculateBMI(double[][] personData) {
        for (int i = 0; i < personData.length; i++) {
            double weightKg = personData[i][0];
            double heightM = personData[i][1] / 100; // Convert cm to m
            personData[i][2] = weightKg / (heightM * heightM);
        }
    }

    public static String[] determineBMIStatus(double[][] personData) {
        String[] status = new String[personData.length];

        for (int i = 0; i < personData.length; i++) {
            double bmi = personData[i][2];

            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi < 25) {
                status[i] = "Normal weight";
            } else if (bmi < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        return status;
    }
}

