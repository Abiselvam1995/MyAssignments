package week1.day3;

public class Browser {

	public static void main(String[] args) {
		Browser chrome = new Browser();
		chrome.loadurl("www.abc.com");		
		chrome.launchBrowser("Chrome");
		
	}
	public String launchBrowser(String browserName){
		System.out.println("Browser Launched Successfully");
	    return browserName;

	}
	public void loadurl(String url) {
		System.out.println("Application url loaded successfully");

	}

}
