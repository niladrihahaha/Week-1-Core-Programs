import java.util.Scanner;

class PalindromeStringChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = scanner.nextLine();
        scanner.close();

        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

    static boolean isPalindrome(String str) {
        // Remove spaces and punctuation, and convert to lowercase
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int start = 0;
        int end = cleanedStr.length() - 1;

        while (start < end) {
            if (cleanedStr.charAt(start) != cleanedStr.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
