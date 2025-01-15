import java.util.*;

class StringLength {

    public static int lengthOfString(String str) {
        int result = 0;
        try {
            while (true) {
                str.charAt(result);  // Increment result until an exception occurs
                result++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return result;  // Return the length of the string
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine().trim();  // Read the input and remove extra spaces
        System.out.println("The length of \"" + str + "\" is: " + lengthOfString(str));
        sc.close();
    }
}
