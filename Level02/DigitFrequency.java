import java.util.Scanner;

class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Array to store frequency of each digit (0 to 9)
        int[] frequency = new int[10];

        // Find and store each digit's frequency
        while (number > 0) {
            int digit = number % 10;  // Extract the last digit
            frequency[digit]++;       // Increment the frequency of the digit
            number = number / 10;     // Remove the last digit
        }

        // Display the frequency of each digit
        
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("  " + i + "  =  " + frequency[i]);
            }
        }

        sc.close();
    }
}
