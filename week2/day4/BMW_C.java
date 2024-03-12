package week2.day4;

public class BMW_C extends CarP{
	
	int noOfAirBags = 4;
	

	public void reverseCamera()
	{
		System.out.println("Reversing the camera");
	}
	
	public static void main (String[] args)		{
		
		BMW_C x5 = new BMW_C();
		x5.reverseCamera();
	}	

	}

