import java.util.*;
class CountVowelsAndConsonants{
	public static int [] countVowelsAndConsonants(String str){
	  int vowels=0;
	  int consonants=0;
	  int []arr = new int[2];
	  
	  for(int i=0;i<str.length();i++){
	    if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
		  vowels++;
		}else{
		  consonants++;
		}
	  }
	  arr[0]=vowels;
	  arr[1]=consonants;
	  return arr;
	}
	


	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string :");
	String str = sc.next();
	int [] counter = countVowelsAndConsonants(str);
	
	System.out.println(counter[0]+" -Vowals present in string ");
	System.out.println(counter[1]+" -consonants present in string ");
	
	
	
	sc.close();
	
	}

}