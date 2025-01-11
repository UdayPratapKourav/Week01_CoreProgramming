import java.util.Scanner;

class FindMean {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Declare an array to store the heights of 11 players
        double[] height = new double[11];
        
        // Prompt the user to enter the heights of all players
        System.out.println("Enter the heights of 11 players:");
        for (int i = 0; i < height.length; i++) {
            height[i] = sc.nextDouble();  // Store user input in the array
        }
        
        // Initialize sum variable to calculate the total height
        double sum = 0;
        
        // Loop to calculate the sum of all heights
        for (int j = 0; j < height.length; j++) {
            sum += height[j];  // Add each height to the sum
        }
        
        // Calculate the mean height
        double meanHeight = sum / height.length;  // Use array length for flexibility
        
        // Display the mean height of the football team
        System.out.println("The mean height of the football team is: " + meanHeight);
        
        // Close the scanner object
        sc.close();
    }
}
