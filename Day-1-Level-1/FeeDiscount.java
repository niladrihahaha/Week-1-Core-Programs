class FeeDiscount {
    public static void main(String[] args) {
        // Create variables for fee and discount percentage
        int fee = 125000;
        int discountPercent = 10;
        
        // Calculate discount amount and final fee
        double discountAmount = (fee * discountPercent) / 100.0;
        double finalFee = fee - discountAmount;
        
        // Display the results
        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalFee);
    }
}
