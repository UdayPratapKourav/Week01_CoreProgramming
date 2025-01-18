import java.util.Scanner;

public class RemoveCharacter {
    public static String removeCharacter(String str,char ch){
        return str.replace(Character.toString(ch),"");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str = sc.nextLine();
        System.out.println("Enter character to remove :");
        char ch = sc.next().charAt(0);
        String result=removeCharacter(str,ch);
        System.out.println("Modified String: "+ result);
        sc.close();

    }
}
