import java.util.Scanner;

public class FriendComparisonMe {

    // Method to find the youngest friend among the 3
    public String findYoungest(int[] ages) {
        int youngestAge = ages[0];
        int youngestIndex = 0;

        // Compare ages to find the youngest
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestIndex = i;
            }
        }

        // Return the name of the youngest friend
        if (youngestIndex == 0) return "Amar";
        else if (youngestIndex == 1) return "Akbar";
        else return "Anthony";
    }

    // Method to find the tallest friend among the 3
    public String findTallest(double[] heights) {
        double tallestHeight = heights[0];
        int tallestIndex = 0;

        // Compare heights to find the tallest
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestIndex = i;
            }
        }

        // Return the name of the tallest friend
        if (tallestIndex == 0) return "Amar";
        else if (tallestIndex == 1) return "Akbar";
        else return "Anthony";
    }

    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Create an instance of FriendComparison to call methods
        FriendComparisonMe comparison = new FriendComparisonMe();

        // Arrays to store ages and heights of the 3 friends
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Taking input for ages
        System.out.println("Enter the age of Amar: ");
        ages[0] = sc.nextInt();
        System.out.println("Enter the age of Akbar: ");
        ages[1] = sc.nextInt();
        System.out.println("Enter the age of Anthony: ");
        ages[2] = sc.nextInt();

        // Taking input for heights
        System.out.println("Enter the height of Amar in meters: ");
        heights[0] = sc.nextDouble();
        System.out.println("Enter the height of Akbar in meters: ");
        heights[1] = sc.nextDouble();
        System.out.println("Enter the height of Anthony in meters: ");
        heights[2] = sc.nextDouble();

        // Find and display the youngest friend
        String youngest = comparison.findYoungest(ages);
        System.out.println("The youngest friend is: " + youngest);

        // Find and display the tallest friend
        String tallest = comparison.findTallest(heights);
        System.out.println("The tallest friend is: " + tallest);

        // Close the scanner
        sc.close();
    }
}
