import java.util.Scanner;

public class CollinearPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for three points
        System.out.println("Enter coordinates for point A (x1 y1):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Enter coordinates for point B (x2 y2):");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.println("Enter coordinates for point C (x3 y3):");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        boolean collinearBySlope = checkCollinearBySlope(x1, y1, x2, y2, x3, y3);
        boolean collinearByArea = checkCollinearByArea(x1, y1, x2, y2, x3, y3);

        System.out.println("Points are collinear (Slope method): " + collinearBySlope);
        System.out.println("Points are collinear (Area method): " + collinearByArea);

        // Check for the given sample points
        System.out.println("\nChecking for A(2,4), B(4,6), C(6,8):");
        System.out.println("Collinear (Slope method): " + checkCollinearBySlope(2, 4, 4, 6, 6, 8));
        System.out.println("Collinear (Area method): " + checkCollinearByArea(2, 4, 4, 6, 6, 8));

        scanner.close();
    }

    public static boolean checkCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);
        return Math.abs(slopeAB - slopeBC) < 1e-9 && Math.abs(slopeBC - slopeAC) < 1e-9;
    }

    public static boolean checkCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area < 1e-9;
    }
}

