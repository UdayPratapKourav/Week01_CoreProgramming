import java.util.*;

class FindFactorsMe {
    
    // Method to find the factors of a given number
    public static int[] findFactorsOfNumberz(int number) {
        // Temporary variable to count the number of factors
        int index = 0;
        
        // Loop to find factors of the number
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {  // Check if i is a factor
                index++;  // Increment the index for each factor found
            }
        }
        
        // Create an array to store the factors
        int arr[] = new int[index];
        int index2 = 0;  // Variable to track the index for the array
        
        // Populate the array with factors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                arr[index2] = i;  // Store the factor in the array
                index2++;  // Increment the index
            }
        }
        
        // Return the array containing the factors
        return arr;
    }
    
    // Method to find the sum of the factors
    public static int sumOfFactors(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];  // Add each factor to the sum
        }
        return sum;  // Return the sum
    }

    // Method to find the product of the factors
    public static int findProductOfFactors(int arr[]) {
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];  // Multiply each factor to get the product
        }
        return product;  // Return the product
    }

    // Method to find the sum of the squares of the factors
    public static long findSumOfSquareOfFactors(int arr[]) {
        long sumOfSquare = 0;
        for (int i = 0; i < arr.length; i++) {
            sumOfSquare += (long) Math.pow(arr[i], 2);  // Square each factor and add to the sum
        }
        return sumOfSquare;  // Return the sum of squares
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Take input for the number
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        
        // Get the factors of the number
        int arr[] = findFactorsOfNumberz(number);
        
        // Print the factors
        System.out.println("Factors of the number are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");  // Print each factor
        }
        System.out.println();  // Print a new line after listing factors
        
        // Calculate and print the sum of factors
        System.out.println("Sum of all factors is: " + sumOfFactors(arr));
        
        // Calculate and print the product of factors
        System.out.println("Product of the factors is: " + findProductOfFactors(arr));
        
        // Calculate and print the sum of squares of the factors
        System.out.println("Sum of squares of the factors is: " + findSumOfSquareOfFactors(arr));
        
        sc.close();  // Close the scanner to prevent resource leaks
    }
}
