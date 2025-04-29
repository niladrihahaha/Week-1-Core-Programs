
import java.util.Scanner;
public class SpringSeasonChecker {
    public static void main(String[] args) {
        int month = getInputMonth();
        int day = getInputDay();

        boolean isSpring = isSpringSeasonDay(month, day);

        printResult(isSpring);
    }

    public static int getInputMonth() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        return month;
    }

    public static int getInputDay() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day (1-31): ");
        int day = scanner.nextInt();
        return day;
    }

    public static boolean isSpringSeasonDay(int month, int day) {
        // Spring is from March 20 to June 20
        if (month == 3 && day >= 20 && day <= 31) {
            return true;
        } else if (month == 4 && day >= 1 && day <= 30) {
            return true;
        } else if (month == 5 && day >= 1 && day <= 31) {
            return true;
        } else if (month == 6 && day >= 1 && day <= 20) {
            return true;
        }
        return false;
    }

    public static void printResult(boolean isSpring) {
        if (isSpring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}



