import java.util.Scanner; 

// Program to perform double operations and demonstrate operator precedence
public class DoubleOpt {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        // Declare variables for double a, b, and c
        double a, b, c;
        
        // Prompt the user to enter values for a, b, and c
        System.out.print("Enter value for a: ");
        a = input.nextDouble();
        System.out.print("Enter value for b: ");
        b = input.nextDouble();
        System.out.print("Enter value for c: ");
        c = input.nextDouble();
        
        // Perform double operations
        double result1 = a + b * c;  // Multiplication (*) has higher precedence than addition (+)
        double result2 = a * b + c;  // Multiplication (*) before addition (+)
        double result3 = c + a / b;  // Division (/) has higher precedence than addition (+)
        double result4 = a % b + c;  // Modulus (%) has higher precedence than addition (+)
        
        // Display the results
         System.out.println("The results of integer operations are:" + result1+", "+result2+ ", "+result3+ ", "+result4);
        
        // Close the Scanner
        input.close();
    }
}
