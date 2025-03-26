import java.util.Scanner;

class FeeDiscountInput {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt user for input
        System.out.println("Enter the fee amount:");
        int fee = input.nextInt();
        
        System.out.println("Enter the discount percentage:");
        int discountPercent = input.nextInt();
        
        // Calculate discount amount and final fee
        double discountAmount = (fee * discountPercent) / 100.0;
        double finalFee = fee - discountAmount;
        
        // Display the results
        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalFee);
        
        // Close the Scanner
        input.close();
    }
}
