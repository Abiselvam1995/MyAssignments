package week2.day4;

public class Safari_C extends BrowserP {
	
	public void readerMode() {		
		System.out.println("Opening in the readerMode");		
	}
	public void fullScreenMode() {	
	System.out.println("Opening in the fullScreenMode");
	
}

	public static void main(String[] args) {
		Safari_C safari = new Safari_C();
		System.out.println(safari.browserName);
		safari.closeBrowser();
		safari.readerMode();
		safari.navigateBack();
		


	}

}
