class NullPointerExample {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null;  // Initializing variable to null
        // Attempting to call a method on a null reference to generate an exception
        System.out.println("Length of text: " + text.length());
    }

    // Method to handle NullPointerException using try-catch
    public static void handleException() {
        String text = null;  // Initializing variable to null
        try {
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Exception caught: Attempted to call a method on a null reference.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Generating NullPointerException:");
        try {
            generateException();  // Call method that generates the exception
        } catch (NullPointerException e) {
            System.out.println("Caught exception in main.");
        }

        System.out.println("\nHandling NullPointerException:");
        handleException();  // Call method that handles the exception
    }
}
