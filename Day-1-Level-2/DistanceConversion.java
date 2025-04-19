import java.util.Scanner;

class DistanceConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take distance in feet as input
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Convert to yards and miles
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        // Display results
        System.out.println("The distance in yards is: " + distanceInYards);
        System.out.println("The distance in miles is: " + distanceInMiles);

        input.close();
    }
}
