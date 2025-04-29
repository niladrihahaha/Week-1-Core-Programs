import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int[][] frequencies = findCharacterFrequencies(input);

        System.out.println("Character Frequencies:");
        for (int i = 0; i < frequencies.length; i++) {
            if (frequencies[i][1] > 0) { // Only display characters with non-zero frequency
                System.out.println((char) frequencies[i][0] + ": " + frequencies[i][1]);
            }
        }

        scanner.close();
    }

    public static int[][] findCharacterFrequencies(String str) {
        int[][] frequencies = new int[256][2]; // [ASCII value, frequency]

        for (int i = 0; i < frequencies.length; i++) {
            frequencies[i][0] = i; // Store ASCII value
            frequencies[i][1] = 0; // Initialize frequency to zero
        }

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            frequencies[currentChar][1]++;
        }

        return frequencies;
    }
}
