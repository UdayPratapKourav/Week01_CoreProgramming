import java.util.Scanner;

public class QuadraticMe {

    // Method to find the roots of the quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        // Calculate discriminant
        double delta = Math.pow(b, 2) - 4 * a * c;

        // If delta is positive, two real roots exist
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[] { root1, root2 };
        } 
        // If delta is zero, only one real root exists
        else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[] { root };
        } 
        // If delta is negative, no real roots exist
        else {
            return new double[0]; // Empty array for no real roots
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for coefficients a, b, and c
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Find the roots
        double[] roots = findRoots(a, b, c);

        // Display the roots
        if (roots.length == 0) {
            System.out.println("There are no real roots.");
        } else if (roots.length == 1) {
            System.out.println("There is one root: " + roots[0]);
        } else {
            System.out.println("The roots are: " + roots[0] + " and " + roots[1]);
        }

        scanner.close();
    }
}
