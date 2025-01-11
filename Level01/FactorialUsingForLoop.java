import java.util.Scanner;

public class FactorialUsingForLoop {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Prompting the user to enter a natural number
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();
        
        // Checking if the entered number is a natural number
        if (number < 0) {
            System.out.println("Please enter a valid natural number (greater than or equal to 0).");
        } else {
            // Variable to store the factorial result, starting from 1
            long factorial = 1;
            
            // Using a for loop to calculate the factorial
            for (int i = 1; i <= number; i++) {
                factorial *= i;  // Multiply current factorial with the current number
            }
            
            // Printing the result
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
        
        // Closing the scanner to prevent resource leaks
        sc.close();
    }
}
