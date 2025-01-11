import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Prompting user for month and day input
        System.out.print("Enter the month (1 for January, 2 for February, etc.): ");
        int month = sc.nextInt();
        
        System.out.print("Enter the day: ");
        int day = sc.nextInt();
        
        // Checking if the date falls within the spring season
        boolean isSpring = (month == 3 && day >= 20 && day <= 31) ||
                           (month == 4 && day >= 1 && day <= 30) ||
                           (month == 5 && day >= 1 && day <= 31) ||
                           (month == 6 && day >= 1 && day <= 20);
        
        // Output based on the condition
        if (isSpring) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
        
        // Closing the Scanner object
        sc.close();
    }
}
