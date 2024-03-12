package week2.day4;

public class BrowserP {
	
	String browserName = "Chrome";
	double browerVersion = 4.13;

	public void openURL() {
		System.out.println("Opening the URL");
	}
	public void closeBrowser() {
		System.out.println("Closing the Browser");
	}
	public void navigateBack() {
		System.out.println("navigating back");
	}
	public static void main(String[] args) {
		
		BrowserP browser = new BrowserP();
	    browser.closeBrowser();
	    browser.navigateBack();
	    System.out.println(browser.browerVersion);
	    System.out.println(browser.browserName);
	    
		
		

	}

}
