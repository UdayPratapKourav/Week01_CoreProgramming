import java.util.Scanner;

class LargestAndSecondLargestArray {
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
            // Check if the index has reached the maxDigit value
            if (index == maxDigit) {
                // Increase the size of the array by 10
                maxDigit += 10;

                // Create a new temp array with the increased size
                int[] temp = new int[maxDigit];

                // Copy elements from the old digits array to the temp array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                // Update the reference of digits to the new temp array
                digits = temp;
            }

            // Store the last digit of the number in the array
            digits[index] = number % 10;
            number /= 10;

            // Increment the index
            index++;
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
