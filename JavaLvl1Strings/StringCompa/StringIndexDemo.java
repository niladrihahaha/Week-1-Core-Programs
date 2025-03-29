import java.util.Scanner;

public class StringIndexDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.next();

        generateException(str);
        handleException(str);
    }

    public static void generateException(String str) {
        System.out.println(str.charAt(str.length())); // This will throw StringIndexOutOfBoundsException
    }

    public static void handleException(String str) {
        try {
            System.out.println(str.charAt(str.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
