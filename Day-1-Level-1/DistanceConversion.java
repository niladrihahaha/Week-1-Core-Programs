
import java.util.Scanner;

public class DistanceConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter distance in feet: ");
        float distanceInFeet = scanner.nextFloat();
        
        float distanceInYards = distanceInFeet / 3;
        float distanceInMiles = distanceInYards / 1760;
        
        System.out.println("Distance in yards: " + distanceInYards);
        System.out.println("Distance in miles: " + distanceInMiles);
        
        scanner.close();
    }
}
