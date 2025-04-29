import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the array of names
        System.out.print("Enter the number of names: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        // Call method to generate the exception
        System.out.println("\nGenerating ArrayIndexOutOfBoundsException...");
        try {
            generateException(names);
        } catch (Exception e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Call method to handle the exception
        System.out.println("\nHandling ArrayIndexOutOfBoundsException...");
        handleException(names);

        scanner.close();
    }

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        // Accessing an index larger than the length of the array
        System.out.println("Accessing element at index " + names.length + ": " + names[names.length]);
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] names) {
        try {
            // Accessing an index larger than the length of the array
            System.out.println("Accessing element at index " + names.length + ": " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught other RuntimeException: " + e.getMessage());
        }
    }
}
