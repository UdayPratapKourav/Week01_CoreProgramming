import java.util.Scanner;

class LargestAndSecondLargest {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Take input for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Define the maxDigits variable and the array to store digits
        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        // Initialize variables to keep track of the index of the array
        int index = 0;

        // Loop to store the digits of the number in the array
        while (number != 0) {
            // Store the last digit of the number in the array
            digits[index] = number % 10;
            number /= 10;

            // Increment the index
            index++;

            // Break if we've reached the maximum allowed digits
            if (index == maxDigit) {
                break;
            }
        }

        // Find the largest and second largest digits in the array
        int largest = -1;
        int secondLargest = -1;

        // Loop through the digits array
        for (int i = 0; i < index; i++) {
            // Check for largest
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } 
            // Check for second largest
            else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display the results
        if (secondLargest == -1) {
            System.out.println("There is no second largest number.");
        } else {
            System.out.println("The largest digit is: " + largest);
            System.out.println("The second largest digit is: " + secondLargest);
        }

        // Close the scanner object
        sc.close();
    }
}
