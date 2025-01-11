import java.util.Scanner;  // Importing Scanner class for user input

class CheckNatural {
    public static void main(String args[]) {
        // Creating a Scanner object for taking input
        Scanner sc = new Scanner(System.in);
        
        // Prompting the user to enter a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();  // Reading input
        
        // Variable to store the result
        int result;
        
        // Checking if the input is a natural number (greater than 0)
        if (number > 0) {
            // Calculating the sum of first 'number' natural numbers using formula
            result = number * (number + 1) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + result);
        } else {
            // Displaying a message if the number is not a natural number
            System.out.println("The number " + number + " is not a natural number.");
        }
        
        // Closing the Scanner object to prevent resource leaks
        sc.close();
    }
}
