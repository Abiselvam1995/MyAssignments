package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxHW {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		Thread.sleep(1000);	
		
	//selecting Basic checkbox		
		WebElement basicCheckBox = driver.findElement(By.xpath("//input[@name='j_idt87:j_idt89_input']/following::div"));
		basicCheckBox.click();
	//	driver.executeScript("argument[0].click();", basicCheckBox);
    //selecting notification
		driver.findElement(By.xpath("//input[@name='j_idt87:j_idt91_input']/following::div")).click();	
	//selecting language
		driver.findElement(By.xpath("//label[text()='Javascript']/preceding-sibling::div")).click();
	//selecting tri state button
		driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']/following::div[5]")).click();
	// selecting toggle
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();		
		
	//Verifying button is disables or not
		boolean enabled = driver.findElement(By.xpath("//h5[text()='Verify if check box is disabled']/following::input")).isEnabled();
		if (driver.findElement(By.xpath("//h5[text()='Verify if check box is disabled']/following::div[5]")).isEnabled()) {
		System.out.println("button is" + enabled );}
		else {
			System.out.println("button is disabled" );
		}
		 Thread.sleep(1000);
	//Selecting cities
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();			
		Thread.sleep(1000);
		WebElement citiesWE = driver.findElement(By.xpath("//li[@data-item-value='Berlin']//div"));
		citiesWE.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@aria-label='Close']")).click();		
	}
}