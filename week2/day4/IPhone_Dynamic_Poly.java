package week2.day4;

public class IPhone_Dynamic_Poly extends Phone_Dynamic_Poly {
	
	public void makeCall() {
		System.out.println("Make a call through facetime");
	}

	public static void main(String[] args) {
		
		IPhone_Dynamic_Poly iphone = new IPhone_Dynamic_Poly();
		iphone.makeCall();
		iphone.sendMsg();
		iphone.torchOn();


	}

}
