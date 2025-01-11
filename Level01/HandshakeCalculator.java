import java.util.Scanner;  

// Program to calculate the maximum number of handshakes among students
public class HandshakeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);
        
        // Declare a variable for the number of students
        int numberOfStudents;
        
        
        System.out.print("Enter the number of students: ");
        numberOfStudents = input.nextInt(); 
        
        // Calculate the maximum number of handshakes using the combination formula
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        
        // Display the result
        System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is " + maxHandshakes);
        
        
        input.close();
    }
}
