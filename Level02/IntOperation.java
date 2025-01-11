import java.util.Scanner; 

// Program to perform integer operations and demonstrate operator precedence
public class IntOperation {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);
        
        // Declare variables for integers a, b, and c
        int a, b, c;
        
        // Prompt the user to enter values for a, b, and c
        System.out.print("Enter value for a: ");
        a = input.nextInt();
        System.out.print("Enter value for b: ");
        b = input.nextInt();
        System.out.print("Enter value for c: ");
        c = input.nextInt();
        
        // Perform integer operations
        int result1 = a + b * c;  // Multiplication (*) has higher precedence than addition (+)
        int result2 = a * b + c;  // Multiplication (*) before addition (+)
        int result3 = c + a / b;  // Division (/) has higher precedence than addition (+)
        int result4 = a % b + c;  // Modulus (%) has higher precedence than addition (+)
        
        // Display the results
        System.out.println("The results of integer operations are:" + result1+", "+result2+ ", "+result3+ ", "+result4);

        
        // Close the Scanner
        input.close();
    }
}
