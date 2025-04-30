import java.util.Scanner;

public class EuclideanDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take inputs for two points
        System.out.println("Enter coordinates for first point:");
        System.out.print("x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("y1: ");
        double y1 = scanner.nextDouble();

        System.out.println("Enter coordinates for second point:");
        System.out.print("x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("y2: ");
        double y2 = scanner.nextDouble();

        // Calculate and display the Euclidean distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean distance: %.2f\n", distance);

        // Calculate and display the line equation
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        double slope = lineEquation[0];
        double yIntercept = lineEquation[1];

        System.out.println("Line equation: y = " + slope + "x + " + yIntercept);

        scanner.close();
    }

    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        // Calculate Euclidean distance using the formula: sqrt((x2-x1)² + (y2-y1)²)
        double xDiff = Math.pow(x2 - x1, 2);
        double yDiff = Math.pow(y2 - y1, 2);
        return Math.sqrt(xDiff + yDiff);
    }

    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        // Calculate slope (m) using the formula: m = (y2 - y1) / (x2 - x1)
        double slope = (y2 - y1) / (x2 - x1);

        // Calculate y-intercept (b) using the formula: b = y1 - m * x1
        double yIntercept = y1 - slope * x1;

        // Return an array containing slope and y-intercept
        return new double[] {slope, yIntercept};
    }
}
