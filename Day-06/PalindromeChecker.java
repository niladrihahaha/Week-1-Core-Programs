import java.util.Scanner;

class PalindromeChecker1 {
    String text;

    public PalindromeChecker1(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }

    public void displayResult() {
        System.out.println("Text: " + text);
        System.out.println("Is Palindrome: " + isPalindrome());
    }
}


class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        scanner.close(); // Close the scanner to prevent resource leak

        PalindromeChecker1 checker = new PalindromeChecker1(text);
        checker.displayResult();
    }
}
