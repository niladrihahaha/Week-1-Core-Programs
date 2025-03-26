
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter base of triangle (in inches): ");
        float base = scanner.nextFloat();
        
        System.out.print("Enter height of triangle (in inches): ");
        float height = scanner.nextFloat();
        
        float areaInSquareInches = 0.5f * base * height;
        float areaInSquareCentimeters = areaInSquareInches * 6.4516f;
        
        System.out.println("The area of the triangle is " + areaInSquareInches + 
                           " square inches or " + areaInSquareCentimeters + " square centimeters");
        
        scanner.close();
    }
}
