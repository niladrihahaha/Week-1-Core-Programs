import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take base and height as input
        System.out.print("Enter the base of the triangle (in cm): ");
        double base = input.nextDouble();

        System.out.print("Enter the height of the triangle (in cm): ");
        double height = input.nextDouble();

        // Calculate area
        double areaInCm = 0.5 * base * height;
        double areaInInches = areaInCm / (2.54 * 2.54);

        // Display results
        System.out.println("The area of the triangle in square centimeters is: " + areaInCm);
        System.out.println("The area of the triangle in square inches is: " + areaInInches);

        input.close();
    }
}
