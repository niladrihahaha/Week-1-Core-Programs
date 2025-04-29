import java.util.Scanner;

public class LeapYearSingleIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        // Check if year is valid (>= 1582)
        if (year < 1582) {
            System.out.println("Year should be 1582 or later (Gregorian calendar)");
        } else {
            // Check if it's a leap year using single if with logical operators
            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is not a Leap Year");
            }
        }
        
        scanner.close();
    }
}
