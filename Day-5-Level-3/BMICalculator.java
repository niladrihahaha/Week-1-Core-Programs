import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][2]; // [weight, height]

        // Input weight and height for 10 people
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for person " + (i + 1));
            System.out.print("Weight (kg): ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Height (cm): ");
            data[i][1] = scanner.nextDouble();
        }

        // Calculate BMI and status
        String[][] results = calculateBMIAndStatus(data);

        // Display results
        displayResults(results);

        scanner.close();
    }

    public static String[][] calculateBMIAndStatus(double[][] data) {
        String[][] results = new String[data.length][4]; // [weight, height, BMI, status]

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100;
            double bmi = weight / (heightInMeters * heightInMeters);

            results[i][0] = String.format("%.2f", weight);
            results[i][1] = String.format("%.2f", data[i][1]);
            results[i][2] = String.format("%.2f", bmi);
            results[i][3] = getBMIStatus(bmi);
        }

        return results;
    }

    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal weight";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }

    public static void displayResults(String[][] results) {
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        for (String[] result : results) {
            System.out.printf("%-10s %-10s %-10s %-15s\n", result[0], result[1], result[2], result[3]);
        }
    }
}

