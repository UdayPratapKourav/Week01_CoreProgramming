import java.util.*;

public class RandomNumberStatsMe {

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        
        // Generate random 4-digit numbers
        for (int i = 0; i < size; i++) {
            // Generate a random number between 1000 and 9999 (inclusive)
            numbers[i] = (int) (Math.random() * 9000) + 1000;
        }
        
        return numbers;
    }

    // Method to find the average, min, and max of the numbers in an array
    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        
        // Iterate through the array to calculate sum, min, and max
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
        // Calculate average
        double average = sum / numbers.length;
        
        // Return the average, min, and max in a double array
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        // Generate 5 random 4-digit numbers
        int size = 5;
        int[] randomNumbers = generate4DigitRandomArray(size);

        // Display the generated numbers
        System.out.println("Generated 4-digit random numbers:");
        for (int num : randomNumbers) {
            System.out.println(num);
        }

        // Find the average, min, and max values
        double[] results = findAverageMinMax(randomNumbers);
        
        // Display the results
        System.out.println("\nAverage: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
    }
}
