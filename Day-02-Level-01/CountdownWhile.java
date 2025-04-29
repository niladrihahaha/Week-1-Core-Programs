import java.util.Scanner;

public class CountdownWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the starting number for countdown: ");
        int counter = scanner.nextInt();
        
        System.out.println("Rocket Launch Countdown:");
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("Blast Off!");
        
        scanner.close();
    }
}
