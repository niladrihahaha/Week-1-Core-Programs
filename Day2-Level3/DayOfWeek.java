import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter month (1-12): ");
        int m = scanner.nextInt();
        
        System.out.print("Enter day (1-31): ");
        int d = scanner.nextInt();
        
        System.out.print("Enter year: ");
        int y = scanner.nextInt();
        
        // Adjust month and year for Zeller's Congruence algorithm
        if (m == 1 || m == 2) {
            m += 12;
            y--;
        }
        
        // Calculate day of week using Zeller's Congruence
        int h = (d + (13 * (m + 1)) / 5 + y + y / 4 - y / 100 + y / 400) % 7;
        
        // Convert to 0 for Sunday, 1 for Monday, etc.
        String dayName;
        switch (h) {
            case 0: dayName = "Saturday"; break;
            case 1: dayName = "Sunday"; break;
            case 2: dayName = "Monday"; break;
            case 3: dayName = "Tuesday"; break;
            case 4: dayName = "Wednesday"; break;
            case 5: dayName = "Thursday"; break;
            case 6: dayName = "Friday"; break;
            default: dayName = "Invalid day"; break;
        }
        
        System.out.println("Day of the week: " + h + " (" + dayName + ")");
        
        scanner.close();
    }
}
