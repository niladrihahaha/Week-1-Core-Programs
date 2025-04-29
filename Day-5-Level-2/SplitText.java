import java.util.Scanner;

public class SplitText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text:");
        String input = scanner.nextLine();

        String[] customWords = splitText(input);
        String[] builtInWords = input.split("\\s+");

        System.out.println("Are arrays equal? " + compareArrays(customWords, builtInWords));
    }

    public static String[] splitText(String text) {
        int wordCount = 0;
        int[] spaceIndexes = new int[text.length()];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
                wordCount++;
            }
        }

        String[] words = new String[wordCount + 1];
        int wordIndex = 0;
        int start = 0;

        for (int i = 0; i < index; i++) {
            words[wordIndex++] = text.substring(start, spaceIndexes[i]);
            start = spaceIndexes[i] + 1;
        }
        words[wordIndex] = text.substring(start);

        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
}


