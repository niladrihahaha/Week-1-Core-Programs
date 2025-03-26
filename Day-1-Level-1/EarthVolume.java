class EarthVolume {
    public static void main(String[] args) {
        // Create variables for radius of Earth and conversion factor
        double radiusKm = 6378;
        double conversionFactor = 0.621371;
        
        // Calculate volume in cubic kilometers
        double volumeKm = (4.0/3.0) * Math.PI * Math.pow(radiusKm, 3);
        
        // Convert to cubic miles
        double volumeMiles = volumeKm * Math.pow(conversionFactor, 3);
        
        // Display the results
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm + " and cubic miles is " + volumeMiles);
    }
}
