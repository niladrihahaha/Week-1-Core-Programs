class KilometerToMiles {
    public static void main(String[] args) {
        // Create a variable for the distance in kilometers
        double kilometers = 10.8;
        
        // Create a conversion factor
        double conversionFactor = 0.621371;
        
        // Convert kilometers to miles
        double miles = kilometers * conversionFactor;
        
        // Display the result
        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}
