import java.util.Scanner;

public class UppercaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        String customUppercase = convertToUppercase(input);
        String builtInUppercase = input.toUpperCase();

        System.out.println("Custom uppercase: " + customUppercase);
        System.out.println("Built-in uppercase: " + builtInUppercase);
        System.out.println("Results match: " + compareStrings(customUppercase, builtInUppercase));

        scanner.close();
    }

    public static String convertToUppercase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                // Convert lowercase to uppercase by subtracting 32 from ASCII value
                result.append((char)(c - 32));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}

