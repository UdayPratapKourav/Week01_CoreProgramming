import java.util.Scanner;

class TravelComputation {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Create variables for person name and cities
        System.out.print("Enter the name of the person traveling: ");
        String name = input.nextLine();

        System.out.print("Enter the starting city: ");
        String fromCity = input.nextLine();

        System.out.print("Enter the city you are traveling via: ");
        String viaCity = input.nextLine();

        System.out.print("Enter the destination city: ");
        String toCity = input.nextLine();

        // Create variables for distances and time
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in km: ");
        double distanceFromToVia = input.nextDouble();

        System.out.print("Enter the travel time from " + fromCity + " to " + viaCity + " in minutes: ");
        int timeFromToVia = input.nextInt();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in km: ");
        double distanceViaToFinalCity = input.nextDouble();

        System.out.print("Enter the travel time from " + viaCity + " to " + toCity + " in minutes: ");
        int timeViaToFinalCity = input.nextInt();

        // Calculate total distance and time
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        // Display travel details
        System.out.println("\nThe total distance traveled by " + name + " from " +
                           fromCity + " to " + toCity + " via " + viaCity +
                           " is " + totalDistance + " km and the total time taken is " + 
                           totalTime + " minutes");

        // Close the scanner
        input.close();
    }
}
