import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();
        System.out.print("Enter the power: ");
        int power = sc.nextInt();
        
        // Initializing result to 1
        int result = 1;
        
        // Loop to calculate power
        for (int i = 1; i <= power; i++) {
            result *= number;  // Multiplying result by the number
        }
        
        // Displaying the result
        System.out.println(number + " raised to the power of " + power + " is: " + result);
        
        // Closing the scanner
        sc.close();
    }
}
