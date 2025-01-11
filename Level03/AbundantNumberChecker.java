import java.util.Scanner;

public class AbundantNumberChecker {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Taking input for the number
        System.out.print("Enter a number to check if it's an Abundant Number: ");
        int number = sc.nextInt();
        
        // Variable to store the sum of divisors
        int sum = 0;
        
        // Loop to find all divisors of the number
        for (int i = 1; i < number; i++) {
            if (number % i == 0) { // Check if i is a divisor
                sum += i; // Add i to sum if it is a divisor
            }
        }
        
        // Check if the sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }
        
        // Closing the scanner
        sc.close();
    }
}
