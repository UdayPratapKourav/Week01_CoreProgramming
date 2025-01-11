import java.util.Scanner;

public class FizzBuzzWhileLoop {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        
        // Check if the number is positive
        if (number > 0) {
            int i = 1;  // Initialize loop counter
            while (i <= number) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                i++;  // Increment the loop counter
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }
        
        // Closing the scanner to prevent resource leaks
        sc.close();
    }
}
