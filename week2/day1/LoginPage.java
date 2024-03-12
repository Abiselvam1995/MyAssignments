package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		
		// to launch browser
		ChromeDriver driver = new ChromeDriver();
		
	    // to load url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//to maximize window
		driver.manage().window().maximize();
		
		// to find username field
		WebElement username = driver.findElement(By.id("username"));
		
		// sending values to username field
		username.sendKeys("demosalesmanager");
		
		//  to find password and sending values
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		// clicking  submit button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// clicking on huyperlink text
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		// to stop our execution for 2seconds (or) 2000 millisec
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		//driver.findElement(By.linkText("Comp Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Abinaya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Panneerselvam");
		
		//handling Dropdown by using Select class
		//Step-1 Locate Source dropdown WebElement
		WebElement sourceWE = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		//Step-2 Create obj for select class and pass the dropdown
		Select sourceDD = new Select (sourceWE);
		System.out.println(sourceWE);
		
		//Step-3 Choose by value by using selectByIndex
		sourceDD.selectByIndex(4);
		
	//Locate the marketing Campaingn WebElement selectByvalue
		WebElement OwnershipWE = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select OwnershipDD = new Select (OwnershipWE);
		OwnershipDD.selectByValue("OWN_CCORP");
		
		//Locate the marketing Campaingn WebElement selectByVisibleText
		WebElement marketCampWE = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select marketCampDD = new Select (marketCampWE);
		marketCampDD.selectByVisibleText("Automobile");
	
		driver.findElement(By.className("smallSubmit")).click();
		
		Thread.sleep(2000);
		
		// getting text of LeadID
		WebElement leadIDWE = driver.findElement(By.id("viewLead_companyName_sp"));
		String cNameLeadID = leadIDWE.getText();
		System.out.println(cNameLeadID);
		
		String leadID = cNameLeadID.replaceAll("[^0-9]", "");
		String cnameID = cNameLeadID.replaceAll("[^a-zA-Z]", "");
		System.out.println("leadID :" + leadID);
		System.out.println("cnameID :" + cnameID);
		
		//To get title of the webpage
		
		String viewLeadTitle = driver.getTitle();
		if (viewLeadTitle.contains("View Lead")) {		
		System.out.println("Lead Title Created successfully");
		}
		else{
			System.out.println("failed to create view lead title");
		}
		
		//to close the window
		//driver.close();
		
	}

}
