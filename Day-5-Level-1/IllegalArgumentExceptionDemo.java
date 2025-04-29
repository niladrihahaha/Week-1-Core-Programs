import java.util.Scanner;

public class IllegalArgumentExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
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
        // This will generate IllegalArgumentException when start > end
        String result = text.substring(5, 3);
        System.out.println("Result: " + result); // This line won't execute
    }

    public static void handleException(String text) {
        try {
            String result = text.substring(5, 3);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught other RuntimeException: " + e.getMessage());
        }
    }
}
