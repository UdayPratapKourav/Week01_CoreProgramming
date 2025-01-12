public class UnitConverterMe {

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;  // Convert km to miles
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;  // Convert miles to km
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;  // Convert meters to feet
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;  // Convert feet to meters
    }

    public static void main(String args[]) {
        // Test the methods
        double km = 10.0;
        double miles = convertKmToMiles(km);
        System.out.println(km + " kilometers is equal to " + miles + " miles.");

        miles = 5.0;
        double kmValue = convertMilesToKm(miles);
        System.out.println(miles + " miles is equal to " + kmValue + " kilometers.");

        double meters = 50.0;
        double feet = convertMetersToFeet(meters);
        System.out.println(meters + " meters is equal to " + feet + " feet.");

        feet = 20.0;
        double metersValue = convertFeetToMeters(feet);
        System.out.println(feet + " feet is equal to " + metersValue + " meters.");
    }
}
