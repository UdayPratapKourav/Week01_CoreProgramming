import java.util.Scanner;

public class RocketLaunchCountdownFor {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Prompting user for the countdown start value
        System.out.print("Enter the countdown start value: ");
        int counter = sc.nextInt();
        
        // Countdown using a for loop
        for(int i=counter;i>0;i--) {
            System.out.println(i);  // Print the current value of counter
            
        }
        
        
 
      
        sc.close();
    }
}
