import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter weight in kg: ");
        double weight = scanner.nextDouble();
        
        System.out.print("Enter height in cm: ");
        double heightCm = scanner.nextDouble();
        
        // Convert height from cm to meters
        double heightM = heightCm / 100;
        
        // Calculate BMI
        double bmi = weight / (heightM * heightM);
        
        // Determine weight status
        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 25) {
            status = "Normal weight";
        } else if (bmi < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }
        
        // Display results
        System.out.println("\nBMI Results:");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + heightCm + " cm (" + heightM + " m)");
        System.out.println("BMI: " + String.format("%.2f", bmi));
        System.out.println("Weight Status: " + status);
        
        scanner.close();
    }
}
