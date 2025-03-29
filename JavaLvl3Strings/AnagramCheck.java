import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string:");
        String input1 = scanner.nextLine();
        System.out.println("Enter second string:");
        String input2 = scanner.nextLine();

        System.out.println("Are Anagrams: " + areAnagrams(input1, input2));
    }

    public static boolean areAnagrams(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false;
        }

        int[] frequency1 = new int[256]; // Assuming ASCII
        int[] frequency2 = new int[256];

        for (char c : text1.toCharArray()) {
            frequency1[c]++;
        }
        for (char c : text2.toCharArray()) {
            frequency2[c]++;
        }

        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }
        return true;
    }
}

