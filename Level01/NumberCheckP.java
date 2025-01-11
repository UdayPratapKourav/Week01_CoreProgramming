import java.util.Scanner;

public class NumberCheckP {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Prompting the user to enter a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();  // Reading integer input
        
        // Checking if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
        
        // Closing the Scanner object to avoid resource leaks
        sc.close();
    }
}
