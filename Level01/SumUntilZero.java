import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Initializing the total to 0.0
        double total = 0.0;
        
 
        System.out.print("Enter a number (enter 0 to stop): ");
        double number = sc.nextDouble();
        
        // Using a while loop to add numbers until the user enters 0
        while (number != 0) {
            total += number;  // Add the entered number to total
            System.out.print("Enter another number (enter 0 to stop): ");
            number = sc.nextDouble();  // Asking the user to input another number
        }
        
        // Printing the final total after the loop ends
        System.out.println("The total sum is: " + total);
        
        // Closing the scanner to prevent resource leaks
        sc.close();
    }
}
