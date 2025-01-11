import java.util.Scanner;  

// Program to divide chocolates among children
public class ChocolateDistribution {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Declare variables for number of chocolates and children
        int numberOfChocolates, numberOfChildren;
        
        // Prompt the user to enter the number of chocolates
        System.out.print("Enter the number of chocolates: ");
        numberOfChocolates = input.nextInt();
        
        // Prompt the user to enter the number of children
        System.out.print("Enter the number of children: ");
        numberOfChildren = input.nextInt();
        
        // Calculate chocolates per child and remaining chocolates
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;
        
        // Display the results
        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + " and the number of remaining chocolates are "+remainingChocolates);
       
        
        // Close the Scanner
        input.close();
    }
}
