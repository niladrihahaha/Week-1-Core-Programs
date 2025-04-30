import java.util.Scanner;

public class CaseToggler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to toggle case: ");
        String str = scanner.nextLine();
        String toggled = toggleCase(str);
        System.out.println("Toggled Case: " + toggled);
    }

    static String toggleCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                sb.append(Character.toLowerCase(ch));
            } else {
                sb.append(Character.toUpperCase(ch));
            }
        }
        return sb.toString();
    }
}
