import java.util.Scanner;

public class HarshadNumberChecker {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter a number to check if it's a Harshad number: ");
        int number = sc.nextInt();
        
        // Initializing the sum variable to store the sum of digits
        int sum = 0;
        int originalNumber = number; // Storing the original number for later comparison
        
        // Loop to sum the digits of the number
        while (number != 0) {
            sum += number % 10;  // Adding the last digit to sum
            number /= 10;         // Removing the last digit
        }

        // Checking if the number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad number.");
        }
        
        // Closing the scanner
        sc.close();
    }
}
