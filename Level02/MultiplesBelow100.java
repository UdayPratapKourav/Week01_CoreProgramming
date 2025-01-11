import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter a number to find its multiples below 100: ");
        int number = sc.nextInt();
        
        // Checking if the input is valid
        if (number > 0) {
            System.out.println("Multiples of " + number + " below 100 are:");
            
            // Looping backward from 100 to 1
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Please enter a positive number.");
        }
        
        // Closing the scanner to prevent resource leaks
        sc.close();
    }
}
