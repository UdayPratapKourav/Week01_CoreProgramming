import java.util.*;
public class SpringSeasonMe {

    // Method to check if the date falls in the Spring season
    public boolean isSpringSeason(int month, int day) {
        // Check if the month is between March (3) and June (6), with special conditions for the days
        if (month == 3 && day >= 20 || month == 6 && day <= 20 || (month > 3 && month < 6)) {
            return true;  // It's Spring season
        }
        return false;  // It's not Spring season
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		
		System.out.println("Enter month and day :");
        int month = sc.nextInt();
        int day = sc.nextInt();

        // Create an object of SpringSeason
        SpringSeasonMe season = new SpringSeasonMe();

        // Check if it's Spring season and display the appropriate message
        if (season.isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
		sc.close();
    }
}
