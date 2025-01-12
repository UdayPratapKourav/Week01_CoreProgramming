import java.util.Scanner;

public class LineEquationAndDistanceMet {

    // Method to calculate the Euclidean distance between two points
    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to find the slope and y-intercept of the line
    public static double[] findLineEquation(int x1, int y1, int x2, int y2) {
        double slope = (double) (y2 - y1) / (x2 - x1);  // Compute slope
        double yIntercept = y1 - slope * x1;            // Compute y-intercept
        return new double[]{slope, yIntercept};         // Return both as an array
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coordinates of point A (x1, y1): ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.println("Enter coordinates of point B (x2, y2): ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        double distance = calculateDistance(x1, y1, x2, y2);
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);

        System.out.printf("\nThe Euclidean distance between the points is: %.2f\n", distance);
        System.out.printf("The equation of the line is: y = %.2fx + %.2f\n", lineEquation[0], lineEquation[1]);
    }
}
