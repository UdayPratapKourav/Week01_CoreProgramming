import java.util.Scanner;  // Importing Scanner class for user input

// Program to convert temperature from Fahrenheit to Celsius
public class FahrenheitToCelsiusConverter {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);
        
        // Declare a variable for temperature in Fahrenheit
        double fahrenheit;
        
        // Prompt the user to enter the temperature in Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");
        fahrenheit = input.nextDouble();
        
        // Convert Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;
        
        // Display the result
        System.out.println("The temperature " + fahrenheit + " Fahrenheit is " + celsius + " Celsius.");
        
        // Close the Scanner
        input.close();
    }
}
