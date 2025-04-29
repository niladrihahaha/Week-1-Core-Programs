import java.util.Scanner;

public class DuplicateRemover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to remove duplicates: ");
        String str = scanner.nextLine();
        String uniqueStr = removeDuplicates(str);
        System.out.println("String without duplicates: " + uniqueStr);
    }

    static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (sb.indexOf(String.valueOf(ch)) == -1) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}

