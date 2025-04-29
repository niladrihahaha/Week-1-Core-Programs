import java.util.Scanner;

public class LowercaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        String customLowercase = convertToLowercase(input);
        String builtInLowercase = input.toLowerCase();

        System.out.println("Custom lowercase: " + customLowercase);
        System.out.println("Built-in lowercase: " + builtInLowercase);
        System.out.println("Results match: " + compareStrings(customLowercase, builtInLowercase));

        scanner.close();
    }

    public static String convertToLowercase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                // Convert uppercase to lowercase by adding 32 to ASCII value
                result.append((char)(c + 32));
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

