import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char nonRepeatingChar = findFirstNonRepeatingCharacter(input);

        if (nonRepeatingChar != '\0') {
            System.out.println("First non-repeating character: " + nonRepeatingChar);
        } else {
            System.out.println("No non-repeating character found.");
        }

        scanner.close();
    }

    public static char findFirstNonRepeatingCharacter(String str) {
        int[] frequency = new int[256]; // ASCII character frequencies

        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i)]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (frequency[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }

        return '\0'; // No non-repeating character found
    }
}

