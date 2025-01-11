import java.util.Scanner;

public class FactorsFinder {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter a number to find its factors: ");
        int number = sc.nextInt();
        
        // Checking if the input is positive
        if (number > 0) {
            System.out.println("Factors of " + number + " are:");
            
            // Looping to find factors
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);  // Printing each factor
                }
            }
        } else {
            System.out.println("Please enter a positive number.");
        }
        
        // Closing the scanner to prevent resource leaks
        sc.close();
    }
}
