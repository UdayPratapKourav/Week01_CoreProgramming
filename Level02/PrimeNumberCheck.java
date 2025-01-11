import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Taking the number as input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // A prime number is greater than 1
        boolean isPrime = true;
        
        // Prime check logic
        if (number <= 1) {
            isPrime = false;  // Numbers less than or equal to 1 are not prime
        } else {
            // Loop through numbers from 2 to the square root of the number
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;  // If the number is divisible by i, it's not a prime
                    break;  // No need to check further, break the loop
                }
            }
        }
        
        // Output the result
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }
        
        // Closing the scanner to prevent resource leaks
        sc.close();
    }
}
