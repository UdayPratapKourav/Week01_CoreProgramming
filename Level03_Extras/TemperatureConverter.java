import java.util.Scanner;

public class TemperatureConverter {

    // Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Main function to handle input and output
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Temperature Converter");
        System.out.print("Enter temperature: ");
        double temperature = scanner.nextDouble();

        System.out.print("Convert to (C)elsius or (F)ahrenheit? ");
        char choice = scanner.next().toUpperCase().charAt(0);

        if (choice == 'C') {
            System.out.printf("Temperature in Celsius: %.2f\n", fahrenheitToCelsius(temperature));
        } else if (choice == 'F') {
            System.out.printf("Temperature in Fahrenheit: %.2f\n", celsiusToFahrenheit(temperature));
        } else {
            System.out.println("Invalid choice! Please enter 'C' or 'F'.");
        }
        scanner.close();
    }
}
