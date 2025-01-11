import java.util.Scanner;  

// Program to convert temperature from Celsius to Fahrenheit
public class TemperatureConverterCtoF {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);
        
        // Declare a variable for temperature in Celsius
        double celsius;
        
        // Prompt the user to enter the temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        celsius = input.nextDouble();
        
        // Convert Celsius to Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;
        
        // Display the result
        System.out.println("The temperature " + celsius + " Celsius is " + fahrenheit + " Fahrenheit.");
        
        // Close the Scanner
        input.close();
    }
}
