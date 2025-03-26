
import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the perimeter of the square: ");
        float perimeter = scanner.nextFloat();
        
        float side = perimeter / 4;
        
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
        
        scanner.close();
    }
}
