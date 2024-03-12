package week2.day4;

public class Phone_Dynamic_Poly {
	
	public void makeCall() {
		System.out.println("make a call");
		
	}
	public void sendMsg() {
		System.out.println("Send a message");		
	}
	
	public void torchOn() {
		System.out.println("Switch on the torch");		
	}

	public static void main(String[] args) {
		
		Phone_Dynamic_Poly iphone = new Phone_Dynamic_Poly();
		iphone.makeCall();
		iphone.sendMsg();
		

	}

}
