import java.util.Scanner;

public class WindChillMe {

    // Method to calculate wind chill temperature using the given formula
    public double calculateWindChill(double temperature, double windSpeed) {
        // Formula to calculate the wind chill
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;  // Return the calculated wind chill temperature
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  

        // Take user input for temperature and wind speed
        System.out.println("Enter the temperature in Fahrenheit:");
        double temperature = sc.nextDouble();

        System.out.println("Enter the wind speed in miles per hour:");
        double windSpeed = sc.nextDouble();

        // Create an object of WindChill to call the non-static method
        WindChillMe windChillCalculator = new WindChillMe();

        // Call the method to calculate the wind chill temperature
        double windChill = windChillCalculator.calculateWindChill(temperature, windSpeed);

        // Output the result
        System.out.println("The wind chill temperature is: "+ windChill);

        sc.close();  
    }
}
