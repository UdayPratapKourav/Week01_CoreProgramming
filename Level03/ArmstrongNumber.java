import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int number = sc.nextInt();
        
        // Initializing variables
        int originalNumber = number;
        int sum = 0;

        // Loop to find the sum of cubes of each digit
        while (originalNumber != 0) {
            int digit = originalNumber % 10;  // Extracting the last digit
            sum += digit * digit * digit;     // Adding the cube of the digit to sum
            originalNumber /= 10;             // Removing the last digit
        }

        // Checking if the number is an Armstrong number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
        
        // Closing the scanner
        sc.close();
    }
}
