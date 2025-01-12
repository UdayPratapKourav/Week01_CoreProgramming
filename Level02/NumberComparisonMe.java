import java.util.Scanner;

public class NumberComparisonMe {

    // Method to check if the number is positive or negative
    public static String isPositive(int number) {
        if (number < 0) {
            return "Negative";
        } else {
            return "Positive";
        }
    }

    // Method to check if the number is even or odd
    public static String isEven(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    // Method to compare two numbers and return 1, 0, or -1
    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1; // num1 is greater than num2
        } else if (num1 == num2) {
            return 0; // num1 is equal to num2
        } else {
            return -1; // num1 is less than num2
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Create an array to store 5 numbers
        int[] numbers = new int[5];

        // Input 5 numbers from the user
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        // Loop through the array and check whether the number is positive or negative
        for (int i = 0; i < numbers.length; i++) {
            String positivity = isPositive(numbers[i]);
            System.out.println("Number " + (i + 1) + " (" + numbers[i] + ") is: " + positivity);

            // If positive, check whether it's even or odd
            if (positivity.equals("Positive")) {
                String evenOdd = isEven(numbers[i]);
                System.out.println("Number " + (i + 1) + " (" + numbers[i] + ") is: " + evenOdd);
            }
        }

        // Compare the first and last elements of the array
        int result = compare(numbers[0], numbers[4]);
        if (result == 1) {
            System.out.println("The first number is greater than the last number.");
        } else if (result == 0) {
            System.out.println("The first and last numbers are equal.");
        } else {
            System.out.println("The first number is less than the last number.");
        }

        sc.close();
    }
}
