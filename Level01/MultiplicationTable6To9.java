import java.util.Scanner;

class MultiplicationTable6To9 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        // Declare an array to store multiplication results from 6 to 9
        int[] arr = new int[4];
        int multiplier = 6; // Start multiplier from 6

        // Populate the array with multiplication results for 6 to 9
        for (int i = 0; i < arr.length; i++) {
            if (multiplier > 9) break; // Exit the loop if multiplier exceeds 9
            arr[i] = number * multiplier; // Store result in the array
            multiplier++; // Increment the multiplier for next iteration
        }

        // Reset multiplier for displaying the results
        multiplier = 6;
        
        // Display the multiplication table from 6 to 9
        for (int j = 0; j < arr.length; j++) {
            System.out.println(number + " * " + multiplier + " = " + arr[j]);
            multiplier++; // Increment multiplier for each display
        }

        // Close the scanner
        sc.close();
    }
}
