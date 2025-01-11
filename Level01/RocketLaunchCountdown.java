import java.util.Scanner;

public class RocketLaunchCountdown {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Prompting user for the countdown start value
        System.out.print("Enter the countdown start value: ");
        int counter = sc.nextInt();
        
        // Countdown using a while loop
        while (counter > 0) {
            System.out.println(counter);  // Print the current value of counter
            counter--;  // Decrement the counter
        }
        
        // Print the final message after countdown
 
      
        sc.close();
    }
}
