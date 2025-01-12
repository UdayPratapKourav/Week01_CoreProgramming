import java.util.*; 


class CalculateSimpleInterestMe {

    
    public int countSimpleInterest(int principal, int rate, int time) {
        // Formula to calculate simple interest
        int simpleInterest = (principal * rate * time) / 100;
        return simpleInterest; 
    }

  
    public static void main(String args[]) {
        // Creating a Scanner object for taking input from the user
        Scanner sc = new Scanner(System.in);

       
        System.out.println("Enter the Principal, Rate, and Time:");

        // Reading input values for principal, rate, and time
        int principal = sc.nextInt();
        int rate = sc.nextInt();
        int time = sc.nextInt();

        // Creating an object of CalculateSimpleInterestMe to call the instance method
        CalculateSimpleInterestMe obj = new CalculateSimpleInterestMe();

        // Calculating and displaying the simple interest
        System.out.println("The simple interest is " + obj.countSimpleInterest(principal, rate, time) + 
                " for principal " + principal + ", rate " + rate + " and time " + time);
        
        
        sc.close();
    }
}
