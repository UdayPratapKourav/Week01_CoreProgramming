import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first date
        System.out.print("Enter the first date (yyyy-MM-dd): ");
        LocalDate firstDate = LocalDate.parse(scanner.nextLine());

        // Input for the second date
        System.out.print("Enter the second date (yyyy-MM-dd): ");
        LocalDate secondDate = LocalDate.parse(scanner.nextLine());

        // Comparing the dates
        if (firstDate.isBefore(secondDate)) {
            System.out.println("The first date is before the second date.");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("The first date is after the second date.");
        } else {
            System.out.println("Both dates are the same.");
        }

        scanner.close();
    }


}
