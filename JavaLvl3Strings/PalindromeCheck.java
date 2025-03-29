import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean logic1Result = isPalindromeLogic1(input);
        boolean logic2Result = isPalindromeLogic2(input, 0, input.length() - 1);

        System.out.println("Logic 1: " + logic1Result);
        System.out.println("Logic 2: " + logic2Result);

        scanner.close();
    }

    public static boolean isPalindromeLogic1(String text) {
        int startIndex = 0;
        int endIndex = text.length() - 1;

        while (startIndex < endIndex) {
            if (text.charAt(startIndex) != text.charAt(endIndex)) return false;
            startIndex++;
            endIndex--;
        }

        return true;
    }

    public static boolean isPalindromeLogic2(String text, int startIndex, int endIndex) {
        if (startIndex >= endIndex) return true;

        if (text.charAt(startIndex) != text.charAt(endIndex)) return false;

        return isPalindromeLogic2(text, startIndex + 1, endIndex - 1);
    }
}

