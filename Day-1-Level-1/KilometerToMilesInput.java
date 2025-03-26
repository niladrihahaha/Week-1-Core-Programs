import java.util.Scanner;

class KilometerToMilesInput {
    public static void main(String[] args) {
        // Create variables
        double km, miles, convFactor;
        
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt user for input
        System.out.println("Enter the kilometers to convert:");
        km = input.nextDouble();
        
        // Set conversion factor and calculate miles
        convFactor = 0.621371;
        miles = km * convFactor;
        
        // Display the result
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        
        // Close the Scanner
        input.close();
    }
}
