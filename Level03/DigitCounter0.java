import java.util.Scanner;

public class DigitCounter0 {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter an integer to count its digits: ");
        int number = sc.nextInt();
        
        // Initializing count variable
        int count = 0;
        
        // Loop to count the number of digits
        while (number != 0) {
            number /= 10;  // Removing the last digit
            count++;       // Incrementing the digit count
        }
        
        // Displaying the count of digits
        System.out.println("The number of digits is: " + count);
        
        // Closing the scanner
        sc.close();
    }
}
