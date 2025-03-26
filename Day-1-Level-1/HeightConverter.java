import java.util.Scanner;

class HeightConverter {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt user for input
        System.out.println("Enter your height in centimeters:");
        double heightCm = input.nextDouble();
        
        // Convert centimeters to inches
        double heightInches = heightCm / 2.54;
        
        // Convert inches to feet and remaining inches
        int feet = (int)(heightInches / 12);
        double inches = heightInches % 12;
        
        // Display the results
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + inches);
        
        // Close the Scanner
        input.close();
    }
}
