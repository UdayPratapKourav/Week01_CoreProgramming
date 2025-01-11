import java.util.Scanner;  // Importing Scanner class for user input

// Program to calculate the quotient and remainder of two numbers
public class QuotientRemainderCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);
        
        
        int number1, number2;
        
        
        System.out.print("Enter the first number: ");
        number1 = input.nextInt();  
        
        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        number2 = input.nextInt(); 
        
        // Calculate the quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;
        
        // Display the result
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two numbers " + number1 + " and " + number2);
        
        // Close the Scanner
        input.close();
    }
}
