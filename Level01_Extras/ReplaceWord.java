import java.util.Scanner;
//method for replace the word
public class ReplaceWord {
    public static String replace(String str , String word,String wordo){
        return str.replace(word,wordo);
    }
    //the main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the strign :");
        String str = sc.nextLine();
        System.out.println("Enter the word in sentence you want to replace ");
        String word = sc.next();
        System.out.println("Enter you want to put on that word ");
        String wordo=sc.next();
        System.out.println("Updated string is :"+replace(str,word,wordo));
    }
}
