import java.util.Scanner;

public class GreatestFactorFinder {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter a number to find its greatest factor (besides itself): ");
        int number = sc.nextInt();
        
        // Initializing the greatestFactor variable
        int greatestFactor = 1;
        
        // Loop to find the greatest factor
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;  // Assigning the greatest factor
                break;               // Exiting the loop
            }
        }
        
        // Displaying the greatest factor
        System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
        
        // Closing the scanner
        sc.close();
    }
}
