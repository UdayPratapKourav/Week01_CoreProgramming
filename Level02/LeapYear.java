import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Taking the year as input from the user
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        
        // Check if the year is greater than or equal to 1582 (Gregorian calendar start)
        if (year < 1582) {
            System.out.println("The year must be greater than or equal to 1582.");
        } else {
            // Using a single if statement with multiple logical conditions for Leap Year
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }
        
        // Closing the scanner to prevent resource leaks
        sc.close();
    }
}
