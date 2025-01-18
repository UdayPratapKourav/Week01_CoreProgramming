import java.util.*;

class RemoveDuplicates {

    // Method to remove duplicate characters from the string
    public static String removeDuplicateCharacters(String str) {
        String result = ""; 
        
        // Loop through each character of the input string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // If the character is not already in the result string, add it
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }
        
        return result; // Return the modified string without duplicates
    }

    // Main method to take input and display the result
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the value of String:");

        // Take input and remove leading/trailing spaces
        String str = sc.nextLine().trim();

        // Call removeDuplicateCharacters method and display the result
        System.out.println("String after removing duplicates: " + removeDuplicateCharacters(str));

        
        sc.close();
    }
}
