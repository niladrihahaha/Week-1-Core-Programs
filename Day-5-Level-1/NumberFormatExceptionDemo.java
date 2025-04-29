import java.util.Scanner;

public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text (try non-numeric): ");
        String input = scanner.nextLine();

        try {
            System.out.println("Trying to generate exception...");
            generateException(input);
        } catch (Exception e) {
            System.out.println("Exception caught in main: " + e);
        }

        System.out.println("\nNow with exception handling:");
        handleException(input);

        scanner.close();
    }

    public static void generateException(String text) {
        // This will generate NumberFormatException for non-numeric input
        int number = Integer.parseInt(text);
        System.out.println("Parsed number: " + number); // This line won't execute for non-numeric input
    }

    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught other RuntimeException: " + e.getMessage());
        }
    }
}
