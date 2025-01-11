import java.util.*; 

class FizzBuzzArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); 

        //  enter a number
        System.out.println("Enter the number :");
        int number = sc.nextInt();  // Reading an integer input
        String[] arr = new String[number];  // Initializing a string array of size 'number'

        // Check if the number is positive
        if (number > 0) {
            // Loop through numbers from 0 to number - 1
            for (int i = 0; i < number; i++) {
                
                if (i % 3 == 0 && i % 5 == 0) {
                    arr[i] = "FizzBuzz";  // Assign "FizzBuzz" if divisible by both 3 and 5
                } else if (i % 3 == 0) {
                    arr[i] = "Fizz";  // Assign "Fizz" if divisible by 3
                } else if (i % 5 == 0) {
                    arr[i] = "Buzz";  // Assign "Buzz" if divisible by 5
                } else {
                    arr[i] = String.valueOf(i);  // Assign the number as a string if no condition matches
                }
            }
        }

        // Print the FizzBuzz results
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); 
        }

        sc.close();  
    }
}
