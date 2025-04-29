package JavaLvl3Strings;
import java.util.Scanner;

public class FrequencyUsingNestedLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[][] frequencies = findCharacterFrequencies(input);

        System.out.println("Character Frequencies:");
        for (String[] frequency : frequencies) {
            if (!frequency[0].equals("0")) { // Ignore '0' placeholders
                System.out.println(frequency[0] + ": " + frequency[1]);
            }
        }

        scanner.close();
    }

    public static String[][] findCharacterFrequencies(String str) {
        char[] chars = str.toCharArray();
        int[] frequencyArray = new int[str.length()];

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') { // Skip already counted characters
                frequencyArray[i] = 1;
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[i] == chars[j]) {
                        frequencyArray[i]++;
                        chars[j] = '0'; // Mark as counted
                    }
                }
            }
        }

        String[][] result = new String[str.length()][2];
        for (int i = 0; i < chars.length; i++) {
            result[i][0] = String.valueOf(chars[i]);
            result[i][1] = String.valueOf(frequencyArray[i]);
        }

        return result;
    }
}

