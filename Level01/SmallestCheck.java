import java.util.Scanner;

public class SmallestCheck {
    public static void main(String[] args) {
        // Creating a Scanner object to take input
        Scanner sc = new Scanner(System.in);
        
        // Taking input for three numbers
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();
        
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();
        
        System.out.print("Enter the third number: ");
        int number3 = sc.nextInt();
        
        // Checking if the first number is the smallest
        boolean isFirstSmallest = (number1 < number2) && (number1 < number3);
        
        // Displaying the result
        System.out.println("Is the first number the smallest? " + isFirstSmallest);
        
        // Closing the scanner to prevent resource leaks
        sc.close();
    }
}
