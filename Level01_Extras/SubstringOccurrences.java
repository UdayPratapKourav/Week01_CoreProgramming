import java.util.Scanner;

public class SubstringOccurrences {

    public static int checkSubString(String str,String subStr){
        if(subStr.isEmpty()){
            return 0;
        }
        int index =0;
        int count =0;
        while ((index=str.indexOf(subStr,index))!=-1){
            count++;
            index=index+subStr.length();

        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str = sc.nextLine();
        System.out.println("Enter the subString :");
        String subStr=sc.nextLine();
        int occurrence=checkSubString(str,subStr);
        System.out.println("The subString '"+subStr+"' occurs "+occurrence+" times");


    }
}
