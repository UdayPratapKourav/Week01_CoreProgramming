import java.util.*;

class MultiplicationTable {
    public static void main(String args[]) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter the number:");
        int number = sc.nextInt();

        // Create an array to store the multiplication results
        int[] arr = new int[11]; // Array of size 11 to store results from 1 to 10

        // Loop to calculate the multiplication table and store results in the array
        for (int i = 1; i <= 10; i++) {
            arr[i] = number * i; // Store the result of number * i in the array
        }

        // Loop to print the multiplication table
        for (int j = 1; j <= 10; j++) {
            // Print the multiplication result
            System.out.println(number + " * " + j + " = " + arr[j]);
        }

        // Close the Scanner object to prevent resource leakage
        sc.close();
    }
}
