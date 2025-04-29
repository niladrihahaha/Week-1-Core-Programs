import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char[] uniqueChars = findUniqueCharacters(input);

        System.out.println("Unique characters:");
        for (char c : uniqueChars) {
            if (c != '\0') { // Ignore empty slots in the array
                System.out.print(c + " ");
            }
        }

        scanner.close();
    }

    public static char[] findUniqueCharacters(String str) {
        char[] uniqueChars = new char[str.length()];
        int index = 0;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < index; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueChars[index++] = currentChar;
            }
        }

        return uniqueChars;
    }
}

