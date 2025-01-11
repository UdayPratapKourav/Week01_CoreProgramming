import java.util.Scanner;  

public class BasicCalculator {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Declare variables to store two floating-point numbers
        double number1, number2;

        
        System.out.print("Enter the first number: ");
        number1 = input.nextDouble();  // Reading the first number

        System.out.print("Enter the second number: ");
        number2 = input.nextDouble();  // Reading the second number

        // Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division =number1/number2;

        // Display results in the required format
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " + addition + ", " + subtraction + ", " + multiplication + ", and " + (number2 != 0 ? division : "undefined (division by zero)"));
        
        // Close the Scanner
        input.close();
    }
}
