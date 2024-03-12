package week2.day4;

public class Chrome_C extends BrowserP{
	
	public void clearCache() {		
		System.out.println("clearing the cache");		
	}
	public void openIncongnito() {	
	System.out.println("opening incognito Window");
	
}

	public static void main(String[] args) {
		Chrome_C chrome = new Chrome_C();
		System.out.println(chrome.browserName);
		chrome.clearCache();
		chrome.closeBrowser();
		chrome.openIncongnito();
		chrome.openURL();

	}

}
