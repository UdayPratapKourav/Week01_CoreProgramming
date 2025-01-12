import java.util.Random;

public class FootballTeamHeightMet {

    // Method to generate random heights for players
    public static int[] generateHeights() {
        int[] heights = new int[11];
        Random random = new Random();
        for (int i = 0; i < heights.length; i++) {
            // Generate random heights between 150 and 250 cm
            heights[i] = 150 + random.nextInt(101);
        }
        return heights;
    }

    // Method to find the sum of all elements in the array
    public static int sumOfHeights(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to find the mean height
    public static double meanHeight(int[] heights) {
        int sum = sumOfHeights(heights);
        return (double) sum / heights.length;
    }

    // Method to find the shortest height
    public static int shortestHeight(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    // Method to find the tallest height
    public static int tallestHeight(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        // Generate random heights for 11 players
        int[] heights = generateHeights();

        // Find sum, mean, shortest, and tallest heights
        int sum = sumOfHeights(heights);
        double mean = meanHeight(heights);
        int shortest = shortestHeight(heights);
        int tallest = tallestHeight(heights);

        // Display results
        System.out.println("Heights of the players: ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();
        
        System.out.println("Sum of heights: " + sum);
        System.out.println("Mean height: " + mean);
        System.out.println("Shortest height: " + shortest);
        System.out.println("Tallest height: " + tallest);
    }
}
