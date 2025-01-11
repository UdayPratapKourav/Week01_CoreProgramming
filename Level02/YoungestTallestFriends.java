import java.util.Scanner;

class YoungestTallestFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Defining arrays to store the ages and heights of 3 friends
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Taking input for ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + friends[i] + " (in meters): ");
            heights[i] = sc.nextDouble();
        }

        // Initializing variables to find the youngest and tallest
        int youngestAge = ages[0];
        double tallestHeight = heights[0];
        String youngestFriend = friends[0];
        String tallestFriend = friends[0];

        // Loop to find the youngest friend and tallest friend
        for (int i = 1; i < 3; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestFriend = friends[i];
            }
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestFriend = friends[i];
            }
        }

        // Displaying the results
        System.out.println("The youngest friend is: " + youngestFriend + " with age " + youngestAge);
        System.out.println("The tallest friend is: " + tallestFriend + " with height " + tallestHeight + " meters");

        // Closing the scanner object to avoid memory leaks
        sc.close();
    }
}
