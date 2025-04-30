import java.util.Scanner;

public class CalendarDisplay {
    // Arrays for month names and days in each month
    private static final String[] MONTH_NAMES = {
            "", "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };

    private static final int[] DAYS_IN_MONTH = {
            0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get month and year input from user
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        // Validate input
        if (month < 1 || month > 12) {
            System.out.println("Invalid month. Month should be between 1 and 12.");
            return;
        }

        // Display the calendar
        displayCalendar(month, year);

        scanner.close();
    }

    public static void displayCalendar(int month, int year) {
        // Get month name, days in month, and first day of month
        String monthName = getMonthName(month);
        int daysInMonth = getDaysInMonth(month, year);
        int firstDayOfMonth = getFirstDayOfMonth(month, year);

        // Print header
        System.out.println("\n      " + monthName + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        // Print leading spaces for the first week
        for (int i = 0; i < firstDayOfMonth; i++) {
            System.out.print("   ");
        }

        // Print days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%2d ", day);

            // Move to the next line after Saturday (or at the end of the month)
            if ((day + firstDayOfMonth) % 7 == 0 || day == daysInMonth) {
                System.out.println();
            }
        }
    }

    public static String getMonthName(int month) {
        return MONTH_NAMES[month];
    }

    public static int getDaysInMonth(int month, int year) {
        // Handle February in leap years
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return DAYS_IN_MONTH[month];
    }

    public static boolean isLeapYear(int year) {
        // Leap year is divisible by 4 and not divisible by 100, or divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getFirstDayOfMonth(int month, int year) {
        // Gregorian calendar algorithm to find the day of the week
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + 31*m0 / 12) % 7;

        return d0;
    }
}
