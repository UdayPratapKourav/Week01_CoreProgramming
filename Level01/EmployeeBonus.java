import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Prompting the user to enter salary and years of service
        System.out.print("Enter the employee's salary: ");
        double salary = sc.nextDouble();
        
        System.out.print("Enter the number of years of service: ");
        int yearsOfService = sc.nextInt();
        
        // Variable to store the bonus
        double bonus = 0.0;
        
        // Check if the employee's years of service are greater than 5
        if (yearsOfService > 5) {
            // Calculate the bonus as 5% of the salary
            bonus = salary * 0.05;
        }
        
        // Display the bonus amount
        System.out.println("The bonus amount is: " + bonus);
        
        // Closing the scanner to prevent resource leaks
        sc.close();
    }
}
