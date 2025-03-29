import java.util.Scanner;
import java.util.Arrays;

public class CharArrayCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.next();

        char[] customCharArray = stringToCharArray(str);
        char[] builtInCharArray = str.toCharArray();

        System.out.println("Custom char array: " + Arrays.toString(customCharArray));
        System.out.println("Built-in char array: " + Arrays.toString(builtInCharArray));
        System.out.println("Arrays match: " + Arrays.equals(customCharArray, builtInCharArray));
    }

    public static char[] stringToCharArray(String str) {
        char[] charArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }
        return charArray;
    }
}

