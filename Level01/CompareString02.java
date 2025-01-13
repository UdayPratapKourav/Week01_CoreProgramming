import java.util.*;

class CompareString02 {

    // Returns an array of characters from the string without using toCharArray()
    public static char[] getCharactersWithoutToCharArray(String str) {
        char[] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }
        return result;
    }

    // Compares two character arrays and returns true if they are equal
    public static boolean compareCharacters(char[] str1, char[] str2) {
        if (str1.length != str2.length) {
            return false;
        }
        for (int i = 0; i < str1.length; i++) {
            if (str1[i] != str2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.next();

        char[] str1 = getCharactersWithoutToCharArray(str);
        char[] str2 = str.toCharArray();

        System.out.println("Characters without using toCharArray method:");
        for (int i = 0; i < str1.length; i++) {
            System.out.print(" " + str1[i]);
        }
        System.out.println();

        System.out.println("Characters using toCharArray method:");
        for (int i = 0; i < str2.length; i++) {
            System.out.print(" " + str2[i]);
        }
        System.out.println();

        System.out.println("Both are same: " + compareCharacters(str1, str2));

        sc.close();
    }
}
