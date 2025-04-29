import java.util.Scanner;

public class CharRemover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter a character to remove: ");
        char ch = scanner.next().charAt(0);
        String modified = removeChar(str, ch);
        System.out.println("Modified String: " + modified);
    }

    static String removeChar(String str, char ch) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c != ch) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

