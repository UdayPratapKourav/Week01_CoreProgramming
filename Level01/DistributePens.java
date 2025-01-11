
class DistributePens{
    public static void main(String[] args) {
        // Declare pen and students  
        int pens = 14;
		int students = 3;
		//Calculating remaining pens and distributed pen per student 
		int remaining = pens%students;
		int penPerStudent = pens/students;
		//Printing details 
		System.out.println("The Pen Per Student is "+ penPerStudent + " and the remaining pen not distributed is " + remaining);
		
       
    }
}
