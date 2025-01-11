import java.util.Scanner;  // Importing Scanner class for user input

// Program to swap two numbers
public class SwapNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);
        
        // Declare variables for two numbers
        int number1, number2, temp;
        
        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        number1 = input.nextInt();
        
        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        number2 = input.nextInt();
        
        // Swapping the numbers using a temporary variable
        temp = number1;
        number1 = number2;
        number2 = temp;
        
        // Display the swapped numbers
        System.out.println("The swapped numbers are " + number1 + " and " + number2);
        
        // Close the Scanner
        input.close();
    }
}
