import java.util.Scanner;

class NumberCheck {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Define an array to store 5 numbers
        int[] numbers = new int[5];

        // Take user input for the 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Check each number for positivity, negativity, or zero
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            
            if (number > 0) {
                System.out.print("The number " + number + " is positive and ");
                if (number % 2 == 0) {
                    System.out.println("even.");
                } else {
                    System.out.println("odd.");
                }
            } else if (number < 0) {
                System.out.println("The number " + number + " is negative.");
            } else {
                System.out.println("The number " + number + " is zero.");
            }
        }

        // Compare the first and last elements of the array
        if (numbers[0] == numbers[4]) {
            System.out.println("The first and last elements are equal.");
        } else if (numbers[0] > numbers[4]) {
            System.out.println("The first element is greater than the last element.");
        } else {
            System.out.println("The first element is less than the last element.");
        }

        // Close the scanner
        sc.close();
    }
}
