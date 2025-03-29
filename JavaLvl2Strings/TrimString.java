import java.util.Scanner;

public class TrimString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        int[] trimPoints = trimLeadingTrailingSpaces(input);
        String trimmedText = createSubstring(input, trimPoints[0], trimPoints[1]);

        System.out.println("Trimmed text using custom method: " + trimmedText);
        System.out.println("Trimmed text using built-in method: " + input.trim());

        System.out.println("Are strings equal? " + compareStrings(trimmedText, input.trim()));
    }

    public static int[] trimLeadingTrailingSpaces(String text) {
        int start = 0;
        while (start < text.length() && text.charAt(start) == ' ') {
            start++;
        }

        int end = text.length() - 1;
        while (end >= 0 && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    public static String createSubstring(String text, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
