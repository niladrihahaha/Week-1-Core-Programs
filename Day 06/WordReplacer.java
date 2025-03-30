import java.util.Scanner;

public class WordReplacer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.print("Enter the word to replace: ");
        String oldWord = scanner.next();
        System.out.print("Enter the new word: ");
        String newWord = scanner.next();
        String modified = replaceWord(sentence, oldWord, newWord);
        System.out.println("Modified Sentence: " + modified);
    }

    static String replaceWord(String sentence, String oldWord, String newWord) {
        return sentence.replace(oldWord, newWord);
    }
}
