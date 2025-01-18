import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {

    public static void main(String[] args) {
        // Create a scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Define the date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Prompt the user to enter a date in the format yyyy-MM-dd
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();

        // Parse the input date
        LocalDate date = LocalDate.parse(inputDate, formatter);

        // Perform the date arithmetic
        LocalDate updatedDate = date.plusDays(7).plusMonths(1).plusYears(2);
        LocalDate finalDate = updatedDate.minusWeeks(3);

        // Display the results
        System.out.println("Initial Date: " + date);
        System.out.println("After adding 7 days, 1 month, and 2 years: " + updatedDate);
        System.out.println("After subtracting 3 weeks: " + finalDate);

        // Close the scanner
        scanner.close();


    }

}