 import java.util.Scanner;

public class HandshakesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        int maxHandshakes = calculateMaxHandshakes(numberOfStudents);

        System.out.printf("The maximum number of handshakes among %d students is %d",
                numberOfStudents, maxHandshakes);

        scanner.close();
    }

    public static int calculateMaxHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
}


