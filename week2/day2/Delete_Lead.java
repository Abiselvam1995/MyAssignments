package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delete_Lead {

	public static void main(String[] args) throws InterruptedException {
				ChromeDriver driver = new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/control/main");
				driver.manage().window().maximize();
				WebElement username = driver.findElement(By.id("username"));
				username.sendKeys("demosalesmanager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				driver.findElement(By.linkText("CRM/SFA")).click();
				Thread.sleep(2000);				
				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.linkText("Find Leads")).click();
				
				driver.findElement(By.xpath("//span[text()='Phone']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("123456789");
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/following::a")).click();
				
				String leadId = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
				 driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).click();			
				
				driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
				
		//	driver.findElement(By.linkText("Find Leads")).click();
			
			driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadId);
				
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			
			boolean displayed = driver.findElement(By.xpath("//div[text()='No records to display']")).isDisplayed();
			
			if(displayed ==true)
			{
				System.out.println("displayed");
			}
			else {
				System.out.println("Message not displayed");
			}
			
			
			
			
				//input[@name='id']
				
			//	String viewTitle = driver.
				//		if (viewTitle.contains(""))

	}

}
