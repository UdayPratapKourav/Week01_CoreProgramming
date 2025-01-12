import java.util.Scanner;

public class CollinearPointsCheckerMet {

    // Method to check collinearity using the slope formula
    public static boolean arePointsCollinearUsingSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Check if the slopes of AB, BC, and AC are equal
        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
    }

    // Method to check collinearity using the area of a triangle formula
    public static boolean arePointsCollinearUsingArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coordinates of point A (x1, y1): ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.println("Enter coordinates of point B (x2, y2): ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        System.out.println("Enter coordinates of point C (x3, y3): ");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        boolean collinearBySlope = arePointsCollinearUsingSlope(x1, y1, x2, y2, x3, y3);
        boolean collinearByArea = arePointsCollinearUsingArea(x1, y1, x2, y2, x3, y3);

        System.out.println("\nChecking collinearity using the slope method:");
        System.out.println(collinearBySlope ? "The points are collinear." : "The points are not collinear.");

        System.out.println("\nChecking collinearity using the area method:");
        System.out.println(collinearByArea ? "The points are collinear." : "The points are not collinear.");
    }
}
