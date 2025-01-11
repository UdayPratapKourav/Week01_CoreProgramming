
class ComputeVolume{
    public static void main(String[] args) {
      
	  //Assign the value of radius 
	  double radius = 6378;
	  //calculating the volume Of Earth In Km
	  double volumeOfEarthInKm = (4.0/3.0)*Math.PI*Math.pow(radius,3);
	  //calculating the volume Of Earth In miles
	  
	  double volumeOfEarthInMiles = volumeOfEarthInKm * 0.239913;
	  
	  //printing the details 
	  System.out.println("The volume of earth in cubic kilometers is "+ volumeOfEarthInKm + " and cubic miles is " +volumeOfEarthInMiles);
		
       
    }
}
