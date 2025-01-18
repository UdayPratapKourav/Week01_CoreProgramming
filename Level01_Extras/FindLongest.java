/*import java.util.*;
class FindLongest{
   public static String findLongesWord(String str){
    String resultstr="";
	String strDemo ="";
	
	String result ="";
	for(int i=0;i<str.length();i++){
	  if(i < str.length() && str.charAt(i) != ' '){
	    strDemo=strDemo+str.charAt(i);
	  }else{
	      if(strDemo.length()>resultstr.length()){
		     resultstr=strDemo;
		    
		  }
		  
		  strDemo="";
	     
		 
		 }
	}
     return resultstr;
   }

    
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter The String");
	String str = sc.nextLine().trim();
	System.out.println("Longest Word is : " +findLongesWord(str));
	sc.close();
	}

}


*/



import java.util.*;

class FindLongest {

    // Method to find the longest word in the string
    public static String findLongestWord(String str) {
        String resultstr = "";  // To store the longest word found
        String strDemo = "";    // To build each word

        // Loop through each character of the string
        for (int i = 0; i <= str.length(); i++) {
            if (i < str.length() && str.charAt(i) != ' ') {
                strDemo += str.charAt(i);  // Build the current word
            } else {
                // Check if the current word is the longest so far
                if (strDemo.length() > resultstr.length()) {
                    resultstr = strDemo;  // Update the longest word
                }
                strDemo = "";  // Reset word for next iteration
            }
        }
        return resultstr;  // Return the longest word
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input from the user
        System.out.println("Enter The String");
        String str = sc.nextLine().trim();

        // Display the longest word
        System.out.println("Longest Word is: " + findLongestWord(str));

        sc.close();  // Close the scanner resource
    }
}
