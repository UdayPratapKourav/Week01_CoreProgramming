import java.util.Scanner;

public class StoreAndSumNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Define an array to store up to 10 numbers and a variable for the total
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;
        
        // Infinite loop to take user input until a 0 or negative number is entered or the array is full
        while (true) {
            System.out.println("Enter a number (enter 0 or negative number to stop):");
            double num = sc.nextDouble();
            
            // Check if the number is 0 or negative, or if the array has reached its limit
            if (num <= 0 || index == 10) {
                break;
            }
            
            // Store the number in the array and increment the index
            numbers[index] = num;
            index++;
        }
        
        // Display the numbers entered
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i]; // Add the number to the total
        }
        
        // Display the sum of the numbers
        System.out.println("\nTotal sum: " + total);
        
        // Close the scanner object
        sc.close();
    }
}
