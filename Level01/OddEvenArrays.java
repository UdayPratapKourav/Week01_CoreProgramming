import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        // Check if the input is a natural number
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number greater than 0.");
            System.exit(0);  // Exit the program if the input is invalid
        }

        // Declare arrays for even and odd numbers
        int[] evenNumbers = new int[number / 2 + 1];
        int[] oddNumbers = new int[number / 2 + 1];

        // Initialize indices for even and odd arrays
        int evenIndex = 0;
        int oddIndex = 0;

        // Loop through numbers from 1 to the entered number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i;  // Save even number
            } else {
                oddNumbers[oddIndex++] = i;  // Save odd number
            }
        }

        // Display the odd numbers array
        System.out.print("Odd Numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();

        // Display the even numbers array
        System.out.print("Even Numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();

        // Close the scanner
        sc.close();
    }
}
