package week2.day4;


public class Edge_C extends BrowserP {
	
	public void takesnap() {
		
		System.out.println("taking the snapshot");
		
	}
	
	public void clearCookies() {
		System.out.println("Clearing the cookies");
		
	}
	
	public static void main(String[] args) {
		Edge_C edge = new Edge_C();
		System.out.println(edge.browserName);
		edge.takesnap();
		edge.clearCookies();

	}

}
