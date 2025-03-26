class ProfitLoss {
    public static void main(String[] args) {
        // Create variables for cost price and selling price
        int costPrice = 129;
        int sellingPrice = 191;
        
        // Calculate profit or loss
        int profit = sellingPrice - costPrice;
        double profitPercentage = (profit * 100.0) / costPrice;
        
        // Display the results
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice);
        System.out.println("The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
    }
}
