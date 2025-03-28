import java.util.Scanner;

public class NumberSignChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int result = checkNumberSign(number);

        String message = switch (result) {
            case -1 -> "The number is negative.";
            case 0 -> "The number is zero.";
            case 1 -> "The number is positive.";
            default -> "Invalid result.";
        };

        System.out.println(message);

        scanner.close();
    }

    public static int checkNumberSign(int number) {
        if (number < 0) return -1;
        if (number > 0) return 1;
        return 0;
    }
}

