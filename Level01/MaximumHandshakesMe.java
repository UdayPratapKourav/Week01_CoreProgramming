import java.util.Scanner;

// Class to calculate maximum handshakes
class MaximumHandshakesMe {

    // Method to calculate the maximum number of handshakes
    // Formula used: (n * (n - 1)) / 2
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  

        // Prompt the user for the number of students
        System.out.println("Enter the number of students:");
        int numberOfStudents = sc.nextInt();

        // Calculate and display the maximum number of handshakes
        int handshakes = calculateHandshakes(numberOfStudents);
        System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is: " + handshakes);

        sc.close(); 
    }
}
