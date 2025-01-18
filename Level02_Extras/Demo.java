import java.util.*;

public class Demo {
    public static void main(String[] args) {
        System.out.println("hvh");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string  ");
        String str = sc.nextLine();
        String result = "";

        int i = 0;
        while (i < str.length()) {
            char ch = str.charAt(i);
            if (ch == '&') {
                result += " ";
                while (str.charAt(i) == '&') {
                    i++;
                }
            } else if( i==0 || str.charAt(i-1) == '&'){
                result += Character.toUpperCase(ch);
                i++;
            } else {
                result += ch;
                i++;
            }
        }

        System.out.println("Transformed string: " + result);
        sc.close();
    }
}
