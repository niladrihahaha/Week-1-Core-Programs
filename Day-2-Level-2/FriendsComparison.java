import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Amar's age: ");
        int amarAge = scanner.nextInt();
        
        System.out.print("Enter Akbar's age: ");
        int akbarAge = scanner.nextInt();
        
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = scanner.nextInt();
        
        System.out.print("Enter Amar's height (in cm): ");
        double amarHeight = scanner.nextDouble();
        
        System.out.print("Enter Akbar's height (in cm): ");
        double akbarHeight = scanner.nextDouble();
        
        System.out.print("Enter Anthony's height (in cm): ");
        double anthonyHeight = scanner.nextDouble();
        
        String youngest = "";
        int minAge = Math.min(Math.min(amarAge, akbarAge), anthonyAge);
        
        if (minAge == amarAge) {
            youngest = "Amar";
        } else if (minAge == akbarAge) {
            youngest = "Akbar";
        } else {
            youngest = "Anthony";
        }
        
        String tallest = "";
        double maxHeight = Math.max(Math.max(amarHeight, akbarHeight), anthonyHeight);
        
        if (maxHeight == amarHeight) {
            tallest = "Amar";
        } else if (maxHeight == akbarHeight) {
            tallest = "Akbar";
        } else {
            tallest = "Anthony";
        }
        
        System.out.println("The youngest friend is " + youngest + " with age " + minAge);
        System.out.println("The tallest friend is " + tallest + " with height " + maxHeight + " cm");
        
        scanner.close();
    }
}
