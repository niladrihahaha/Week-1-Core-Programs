import java.util.Scanner;
 
public class CountdownFor  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the starting number for countdown: ");
        int startNumber = scanner.nextInt();
        
        System.out.println("Rocket Launch Countdown:");
        for (int counter = startNumber; counter >= 1; counter--) {
            System.out.println(counter);
        }
        System.out.println("Blast Off!");
        
        scanner.close();
    }
}
