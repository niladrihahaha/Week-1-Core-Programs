import java.util.Scanner;

public class SubstringCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter a substring to count occurrences: ");
        String sub = scanner.nextLine();
        int count = countOccurrences(str, sub);
        System.out.println("Occurrences of '" + sub + "': " + count);
    }

    static int countOccurrences(String str, String sub) {
        int count = 0;
        int index = str.indexOf(sub);
        while (index != -1) {
            count++;
            index = str.indexOf(sub, index + 1);
        }
        return count;
    }
}
