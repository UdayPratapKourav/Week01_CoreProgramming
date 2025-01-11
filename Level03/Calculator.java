import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Taking input for first number, operator, and second number
        System.out.print("Enter the first number: ");
        double first = sc.nextDouble();
        
        System.out.print("Enter the operator (+, -, *, /): ");
        String op = sc.next();
        
        System.out.print("Enter the second number: ");
        double second = sc.nextDouble();
        
        // Variable to store the result
        double result;
        
        // Using switch...case to perform the operation based on operator
        switch (op) {
            case "+":
                result = first + second;
                System.out.println("The result of " + first + " + " + second + " = " + result);
                break;
            case "-":
                result = first - second;
                System.out.println("The result of " + first + " - " + second + " = " + result);
                break;
            case "*":
                result = first * second;
                System.out.println("The result of " + first + " * " + second + " = " + result);
                break;
            case "/":
                // Checking if the second number is zero to avoid division by zero
                if (second != 0) {
                    result = first / second;
                    System.out.println("The result of " + first + " / " + second + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid Operator.");
                break;
        }
        
        // Closing the scanner
        sc.close();
    }
}
