
class CalProfitLosPercentage{
    public static void main(String[] args) {
        // Declare cost and selling price 
        int cost = 129;
		int sell = 191;
		//calculating the profit and percentage 
		int profit = sell - cost;
		double percentage = (double)profit/cost*100;
		
       //printing details
        System.out.println("The cost price is INR " + cost + " and Selling Price is INR " + sell + "\nThe Profit is INR " + profit + " and the Profit Percentage is " + percentage );
    }
}
