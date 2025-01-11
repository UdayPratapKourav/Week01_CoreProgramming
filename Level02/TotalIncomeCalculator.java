import java.util.Scanner;  // Importing Scanner class for user input

// Program to find the total income of a person
public class TotalIncomeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);
        
        // Declare variables for salary and bonus
        double salary, bonus;
        
        // Prompt the user to enter the salary
        System.out.print("Enter your salary (INR): ");
        salary = input.nextDouble();
        
        // Prompt the user to enter the bonus
        System.out.print("Enter your bonus (INR): ");
        bonus = input.nextDouble();
        
        // Calculate the total income
        double totalIncome = salary + bonus;
        
        // Display the result
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ".");
        System.out.println("Hence, Total Income is INR " + totalIncome + ".");
        
        // Close the Scanner
        input.close();
    }
}
