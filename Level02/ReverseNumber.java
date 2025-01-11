import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Take input for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Count the number of digits in the number
        int count = 0;
        int temp = number;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        // Create an array to store the digits of the number
        int[] digits = new int[count];

        // Store the digits in the array
        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Create an array to store the reversed digits
        int[] reversedDigits = new int[count];

        // Reverse the digits by copying them in reverse order
        for (int i = 0; i < count; i++) {
            reversedDigits[i] = digits[count - 1 - i];
        }

        // Display the reversed digits
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reversedDigits[i]);
        }

        // Close the scanner object
        sc.close();
    }
}
