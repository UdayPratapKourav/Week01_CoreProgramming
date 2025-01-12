import java.util.Scanner; 


class AthleteRunsMe {

   
    public static int calculateRounds(int perimeter, int distance) {
        // Calculate and return the number of rounds
        return distance / perimeter;  
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);  

        // Prompt the user to enter the sides of the triangle
        System.out.println("Enter the lengths of the three sides of the triangular park (in meters):");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        // Calculate the perimeter of the triangular park
        int sumOfSides = side1 + side2 + side3;

        // Total distance to be covered (5 km) in meters
        int distanceToRun = 5000;  // Correct distance conversion (5 km = 5000 meters)

        // Calculate and display the number of rounds
        int rounds = distanceToRun / sumOfSides; 
        System.out.println("The athlete should complete " + rounds + " rounds to cover 5 km.");

       
        sc.close();
    }
}
