package week1.day3;

public class Mobile {
	public void makeCall(String mobileModel, float mobileWeight) {
		System.out.println("make a call");
		
	}
	public void sendMsg(boolean isFullcharged, int mobileCost) {
		System.out.println("Send an message");
		
	}

	public static void main(String[] args) {
		Mobile mc = new Mobile();
		mc.makeCall("D3", 50.55f);
		mc.sendMsg( true, 15000);
		System.out.println("This is my mobile");
		

	}

}
