import java.util.Scanner;

public class MostFrequentCharacter {
    public static char frequent(String str){
        int[] arr = new int[256];
        int maxCount=0;
        char mostFrequent=' ';
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            arr[ch]++;
            if(arr[ch]>maxCount){
                maxCount=arr[ch];
                mostFrequent=ch;
            }
        }
        return mostFrequent;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str= sc.nextLine();
        System.out.println("Most Frequent Character: "+frequent(str));


    }
}
