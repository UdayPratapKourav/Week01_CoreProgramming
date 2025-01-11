import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Prompting the user to enter a number
        System.out.print("Enter a number to display its multiplication table from 6 to 9: ");
        int number = sc.nextInt();  // Reading the user input
        
        // Using a for loop to generate the multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            // Printing the multiplication result in the format: number * i = result
            System.out.println(number + " * " + i + " = " + (number * i));
        }
        
        // Closing the scanner to prevent resource leaks
        sc.close();
    }
}
