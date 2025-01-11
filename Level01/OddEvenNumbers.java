import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Prompting the user to enter a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Check if the number is a natural number (greater than 0)
        if (number <= 0) {
            System.out.println("Please enter a valid natural number greater than 0.");
        } else {
            // Using a for loop to iterate through numbers from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number.");
                } else {
                    System.out.println(i + " is an odd number.");
                }
            }
        }
        
        // Closing the scanner to prevent resource leaks
        sc.close();
    }
}
