import java.util.Scanner;

public class SubstringCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.next();
        System.out.print("Enter start index: ");
        int start = scanner.nextInt();
        System.out.print("Enter end index: ");
        int end = scanner.nextInt();

        String charAtSubstring = createSubstringUsingCharAt(str, start, end);
        String builtInSubstring = str.substring(start, end);

        System.out.println("charAt() substring: " + charAtSubstring);
        System.out.println("substring() result: " + builtInSubstring);
        System.out.println("Substrings match: " + compareStrings(charAtSubstring, builtInSubstring));
    }

    public static String createSubstringUsingCharAt(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
}

