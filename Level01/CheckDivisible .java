// Importing the Scanner class to take input from the user
import java.util.*;

class CheckDivisible {
    public static void main(String[] args) {
        // Creating a Scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        
        // Reading an integer input from the user
        int number = sc.nextInt();
        
        // Declaring a boolean variable to store the result
        boolean result;
        
        // Checking if the number is divisible by 5
        if (number % 5 == 0) {
            result = true;  // Assign true if divisible
        } else {
            result = false; // Assign false if not divisible
        }
        
        // Printing the result with a corrected syntax for concatenation
        System.out.println("Is the number " + number + " divisible by 5? " + result);
    }
}
