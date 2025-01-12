import java.util.Scanner;

public class SmallestAndLargestMe {

    // Method to find the smallest and largest of three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest, largest;

        // Logic to determine smallest and largest
        if (number1 <= number2 && number1 <= number3) {
            smallest = number1;
        } else if (number2 <= number1 && number2 <= number3) {
            smallest = number2;
        } else {
            smallest = number3;
        }

        if (number1 >= number2 && number1 >= number3) {
            largest = number1;
        } else if (number2 >= number1 && number2 >= number3) {
            largest = number2;
        } else {
            largest = number3;
        }

        // Return an array with both smallest and largest values
        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner for user input

        // Take user input for the three numbers
        System.out.println("Enter the first number:");
        int number1 = sc.nextInt();
        
        System.out.println("Enter the second number:");
        int number2 = sc.nextInt();

        System.out.println("Enter the third number:");
        int number3 = sc.nextInt();

        // Call the method to find smallest and largest
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // Output the results
        System.out.println("The smallest number is: " + result[0]);
        System.out.println("The largest number is: " + result[1]);

        sc.close();  // Close the scanner
    }
}
