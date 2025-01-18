import java.util.Scanner;

public class ToggleCase {
    public static String toggleString(String str){
        String result = "";
//        for(int i=0;i<str.length();i++){
//            if (Character.isUpperCase(str.charAt(i))) {
//                result = result +(Character.toLowerCase(str.charAt(i)));  // Convert to lowercase
//            } else if (Character.isLowerCase(str.charAt(i))) {
//                result = result +(Character.toUpperCase(str.charAt(i)));  // Convert to uppercase
//            }else{
//                result = result+ " ";
//            }
//        }


        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z'){
                result = result+(char)( ch-32);
            }else if(ch>='A' && ch<='Z'){
                result = result+(char)(ch+32);

            }
            else{
                result+=ch;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str = sc.nextLine();
        System.out.println("Toggled string is "+ toggleString(str));



    }
}
