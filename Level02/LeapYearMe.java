import java.util.*;

class LeapYearMe {
    
    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Check if year is greater than or equal to 1582 (Gregorian calendar)
        if (year < 1582) {
            System.out.println("The year must be greater than or equal to 1582.");
            return false; // Not a valid year for leap year check
        }

        
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true; // It's a leap year
        }
        
        return false; // Not a leap year
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Take the year as input from the user
        System.out.println("Enter a year: ");
        int year = sc.nextInt();
        
        // Check if the year is a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
        
        sc.close(); // Close the scanner
    }
}
