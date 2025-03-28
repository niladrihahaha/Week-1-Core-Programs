package JavaLvl3Methods;

public class NumberChecker4 {
    public static void main(String[] args) {
        int number = 28; // Example number

        System.out.println("Is prime: " + isPrime(number));
        System.out.println("Is neon number: " + isNeonNumber(number));
        System.out.println("Is spy number: " + isSpyNumber(number));
        System.out.println("Is automorphic number: " + isAutomorphicNumber(number));
        System.out.println("Is buzz number: " + isBuzzNumber(number));
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    public static boolean isSpyNumber(int number) {
        int sum = 0, product = 1;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        return sum == product;
    }

    public static boolean isAutomorphicNumber(int number) {
        int square = number * number;
        while (number > 0) {
            if (number % 10 != square % 10) return false;
            number /= 10;
            square /= 10;
        }
        return true;
    }

    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }
}

