import java.util.Scanner;  

// Class to check if a person is eligible to vote based on their age
class CheckPersonCanVote {
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompting the user to enter their age
        System.out.print("Enter the person's age: ");
        int age = sc.nextInt();  // Reading age as an integer input
        
        // Condition to check if the person is eligible to vote
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
        
        // Closing the Scanner to prevent resource leaks
        sc.close();
    }
}
