import java.util.Scanner;

public class HandshakeCalculatorMe02 {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of students
        System.out.println("Enter the number of students:");
        int numberOfStudents = scanner.nextInt();

        // Calculate the maximum number of handshakes
        int maximumHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

       
        System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is: " + maximumHandshakes);

        // Close the scanner
        scanner.close();
    }
}
