import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateArrayIndexOutOfBoundsException(String[] names) {
       
            System.out.println("Accessing element outside the array bounds...");
            // Intentionally accessing an invalid index
            System.out.println("Element at index 5: " + names[5]);  // This may cause an exception
       
    }

    // Method to demonstrate handling runtime exception
    public static void handleRuntimeException(String[] names) {
        try {
            System.out.println("Accessing another element outside the array bounds...");
            // Accessing an invalid index again
            System.out.println("Element at index 10: " + names[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for an array of names
        System.out.print("Enter the number of names: ");
        int size = scanner.nextInt();
        scanner.nextLine();  // Consume the newline

        String[] names = new String[size];
        System.out.println("Enter the names:");
        for (int i = 0; i < size; i++) {
            names[i] = scanner.nextLine();
        }

        // Demonstrate exception generation and handling
       // generateArrayIndexOutOfBoundsException(names);
        handleRuntimeException(names);

        scanner.close();
    }
}
