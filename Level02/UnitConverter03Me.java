public class UnitConverter03Me {

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9;
        return fahrenheit2celsius;  // Convert Fahrenheit to Celsius
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsius2fahrenheit = (celsius * 9 / 5) + 32;
        return celsius2fahrenheit;  // Convert Celsius to Fahrenheit
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;  // Convert pounds to kilograms
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;  // Convert kilograms to pounds
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;  // Convert gallons to liters
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;  // Convert liters to gallons
    }

    public static void main(String args[]) {
        // Test the methods
        double fahrenheit = 100.0;
        double celsius = convertFahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " Fahrenheit is equal to " + celsius + " Celsius.");

        celsius = 37.0;
        double fahrenheitValue = convertCelsiusToFahrenheit(celsius);
        System.out.println(celsius + " Celsius is equal to " + fahrenheitValue + " Fahrenheit.");

        double pounds = 150.0;
        double kilograms = convertPoundsToKilograms(pounds);
        System.out.println(pounds + " pounds is equal to " + kilograms + " kilograms.");

        kilograms = 68.0;
        double poundsValue = convertKilogramsToPounds(kilograms);
        System.out.println(kilograms + " kilograms is equal to " + poundsValue + " pounds.");

        double gallons = 5.0;
        double liters = convertGallonsToLiters(gallons);
        System.out.println(gallons + " gallons is equal to " + liters + " liters.");

        liters = 20.0;
        double gallonsValue = convertLitersToGallons(liters);
        System.out.println(liters + " liters is equal to " + gallonsValue + " gallons.");
    }
}
