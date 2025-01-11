import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Prompting user to enter a natural number
        System.out.print("Enter a  number: ");
        int number = sc.nextInt();
        
        int factorialNumber =1;
		
		
		
		while(number>0){
		   factorialNumber = factorialNumber*number;
		   number--;
		   
		   }
            
            // Displaying the results
            System.out.println("Factorial is :" + factorialNumber);
           
       
        
        sc.close();
    }
}