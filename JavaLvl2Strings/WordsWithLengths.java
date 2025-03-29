import java.util.Scanner;

public class WordsWithLengths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text:");
        String input = scanner.nextLine();

        String[] words = splitText(input);
        String[][] wordsWithLengths = getWordsWithLengths(words);

        displayWordsWithLengths(wordsWithLengths);
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

    public static int findStringLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static String[][] getWordsWithLengths(String[] words) {
        String[][] wordsWithLengths = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordsWithLengths[i][0] = words[i];
            wordsWithLengths[i][1] = String.valueOf(findStringLength(words[i]));
        }
        return wordsWithLengths;
    }

    public static void displayWordsWithLengths(String[][] wordsWithLengths) {
        System.out.println("Word\tLength");
        for (String[] word : wordsWithLengths) {
            System.out.println(word[0] + "\t" + Integer.parseInt(word[1]));
        }
    }
}
