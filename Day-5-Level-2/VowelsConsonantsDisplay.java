import java.util.Scanner;

public class VowelsConsonantsDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        String[][] characterTypes = getCharacterTypes(input);
        displayCharacterTypes(characterTypes);
    }

    public static String checkCharacter(char c) {
        c = (char) (c >= 'A' && c <= 'Z' ? c + 32 : c);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return "Vowel";
        } else if (c >= 'a' && c <= 'z') {
            return "Consonant";
        } else {
            return "Not a Letter";
        }
    }

    public static String[][] getCharacterTypes(String text) {
        String[][] characterTypes = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            characterTypes[i][0] = String.valueOf(text.charAt(i));
            characterTypes[i][1] = checkCharacter(text.charAt(i));
        }
        return characterTypes;
    }

    public static void displayCharacterTypes(String[][] characterTypes) {
        System.out.println("Character\tType");
        for (String[] type : characterTypes) {
            System.out.println(type[0] + "\t" + type[1]);
        }
    }
}
