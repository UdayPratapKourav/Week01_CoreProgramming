import java.util.Scanner;

public class CompareTwoStrings {

    public static String compareString(String str1, String str2) {
        String string1 = str1.toLowerCase();
        String string2 = str2.toLowerCase();
        int length = Math.min(string1.length(), string2.length());

        for (int i = 0; i < length; i++) {
            if (string1.charAt(i) != string2.charAt(i)) {
                if (string1.charAt(i) > string2.charAt(i)) {
                    return str2;  // Return the original string to preserve case
                } else {
                    return str1;
                }
            }
        }

        // If one string is a prefix of the other, return the shorter one
        if (string1.length() < string2.length()) {
            return str1;
        } else if (string2.length() < string1.length()) {
            return str2;
        }

        // If both strings are equal
        return "Both strings are lexicographically equal";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String:");
        String str1 = sc.nextLine();
        System.out.println("Enter another String:");
        String str2 = sc.nextLine();
        if(compareString(str1, str2) ==str1){
            System.out.println(compareString(str1, str2) +" comes before "+ str2+" in lexicographical order");
        } else if (compareString(str1, str2) ==str2) {
            System.out.println(compareString(str1, str2) +" comes before "+ str1+" in lexicographical order");

        } else{
            System.out.println(compareString(str1, str2));
        }


    }
}
