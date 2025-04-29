import java.util.Scanner;

public class FrequencyUsingUniqueCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char[] uniqueChars = findUniqueCharacters(input);
        String[][] frequencies = findCharacterFrequencies(input, uniqueChars);

        System.out.println("Character Frequencies:");
        for (String[] frequency : frequencies) {
            System.out.println(frequency[0] + ": " + frequency[1]);
        }

        scanner.close();
    }

    public static char[] findUniqueCharacters(String str) {
        char[] uniqueChars = new char[str.length()];
        int index = 0;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < index; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueChars[index++] = currentChar;
            }
        }

        char[] result = new char[index];
        System.arraycopy(uniqueChars, 0, result, 0, index);
        return result;
    }

    public static String[][] findCharacterFrequencies(String str, char[] uniqueChars) {
        int[] frequencyArray = new int[256]; // ASCII character frequencies

        for (int i = 0; i < str.length(); i++) {
            frequencyArray[str.charAt(i)]++;
        }

        String[][] frequencies = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            frequencies[i][0] = String.valueOf(uniqueChars[i]);
            frequencies[i][1] = String.valueOf(frequencyArray[uniqueChars[i]]);
        }

        return frequencies;
    }
}

