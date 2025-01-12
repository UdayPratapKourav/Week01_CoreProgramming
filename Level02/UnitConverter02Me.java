public class UnitConverter02Me {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;  // Convert yards to feet
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;  // Convert feet to yards
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;  // Convert meters to inches
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;  // Convert inches to meters
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCm(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;  // Convert inches to centimeters
    }

    public static void main(String args[]) {
        // Test the methods
        double yards = 10.0;
        double feet = convertYardsToFeet(yards);
        System.out.println(yards + " yards is equal to " + feet + " feet.");

        feet = 30.0;
        double yardsValue = convertFeetToYards(feet);
        System.out.println(feet + " feet is equal to " + yardsValue + " yards.");

        double meters = 5.0;
        double inches = convertMetersToInches(meters);
        System.out.println(meters + " meters is equal to " + inches + " inches.");

        double inchesValue = 40.0;
        double metersValue = convertInchesToMeters(inchesValue);
        System.out.println(inchesValue + " inches is equal to " + metersValue + " meters.");

        double inchesForCm = 10.0;
        double cm = convertInchesToCm(inchesForCm);
        System.out.println(inchesForCm + " inches is equal to " + cm + " centimeters.");
    }
}
