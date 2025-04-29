import java.util.Scanner;

public class FrequentCharFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to find the most frequent character: ");
        String str = scanner.nextLine();
        char frequentChar = findMostFrequentChar(str);
        System.out.println("Most Frequent Character: " + frequentChar);
    }

    static char findMostFrequentChar(String str) {
        int[] count = new int[256]; // Assuming ASCII
        for (char ch : str.toLowerCase().toCharArray()) {
            if (ch != ' ') { // Ignore spaces
                count[ch]++;
            }
        }
        int maxCount = 0;
        char maxChar = ' ';
        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                maxChar = (char) i;
            }
        }
        return maxChar;
    }
}

