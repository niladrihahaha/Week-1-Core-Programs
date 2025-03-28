import java.util.Scanner;

public class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();
        System.out.print("Enter number of children: ");
        int numberOfChildren = scanner.nextInt();

        int[] result = distributeChocolates(numberOfChocolates, numberOfChildren);
        System.out.println("Chocolates per child: " + result[0] + ", Remaining chocolates: " + result[1]);
    }

    public static int[] distributeChocolates(int chocolates, int children) {
        int chocolatesPerChild = chocolates / children;
        int remainingChocolates = chocolates % children;
        return new int[]{chocolatesPerChild, remainingChocolates};
    }
}

