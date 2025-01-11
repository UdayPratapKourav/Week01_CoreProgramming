
class CalculatingDiscount{
    public static void main(String[] args) {
        // Declare the fee for the course 
        int fee = 125000;
		int discountPercent = 10;
		// Calculating the discount and final fee
		int discount = (fee*10)/100;
		int finalFee = fee - discount;
		//Printing the details 
		System.out.println("The discount amount is INR " + discount +" and the final discounted fee is INR " + finalFee );
		
		
       
    }
}
