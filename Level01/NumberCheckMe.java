import java.util.Scanner;

public class NumberCheckMe {

    // Method to check the number and return appropriate values
    public static int checkNumber(int num) {
        if (num > 0) {
            return 1;  // Positive number
        } else if (num < 0) {
            return -1;  // Negative number
        } else {
            return 0;  // Zero
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter an integer:");
        int number = sc.nextInt();

        // Get result from checkNumber and display
        int result = checkNumber(number);
        if (result == 1) {
            System.out.println("The number is positive.");
        } else if (result == -1) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
        
        sc.close();  
    }
}
