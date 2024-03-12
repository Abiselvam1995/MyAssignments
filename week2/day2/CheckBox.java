package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
	//To verify checkbox is selected or not
	/*	WebElement basicCheckbox = driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']"));
		basicCheckbox.click();
		boolean beforeclick = basicCheckbox.isSelected();
		System.out.println("beforeclick : "+ beforeclick );
		basicCheckbox.click(); */
		boolean beforeClick = driver.findElement(By.xpath("//input[@aria-label='Basic']")).isEnabled();
		System.out.println("beforeClick :"+ beforeClick);
				//steps to click checkbox
 // step-2 using javascript, for Element not interaactble error
		// store as Webelement
		WebElement basicCheckbox = driver.findElement(By.xpath("//input[@aria-label='Basic']"));
		
		//click using java
		basicCheckbox.click();
		
		// Click using jscript	
		driver.executeScript("argument[0].click();", basicCheckbox);
		
		boolean afterClick = driver.findElement(By.xpath("//input[@aria-label='Basic']")).isEnabled();
				System.out.println("afterClick: " + afterClick);
		
	
		
		
		
		
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[3]")).click();
		
		driver.findElement(By.xpath("(//div[@class ='ui-chkbox ui-widget']/div[@class ='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[5]")).click();
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		
		// to verify disabled button
		
		boolean clickWE = driver.findElement(By.xpath("//input[@aria-label='Basic']")).isEnabled();
		System.out.println("beforeClick :"+ clickWE);
		
		
		boolean disableBtn = driver.findElement(By.name("//input[@aria-label='Basic']")).isEnabled();
		System.out.println("beforeClick :"+ disableBtn);
		
		Point submitButtonLocation = driver.findElement(By.name("//input[@aria-label='Basic']")).getLocation();
		System.out.println("submitButtonLocation:" + submitButtonLocation);
		
		//org.openqa.selenium.Point submitButtonLocation = driver.findElement(By.name("//input[@aria-label='Basic']")).getLocation();
		
		boolean displayed = driver.findElement(By.name("abi")).isEnabled();
		System.out.println("displayed :" + displayed);
		
	//	Dimension size = driver.findElement(By.name("abi")).getSize();
	//	System.out.println("size :" + size);
	//	
		
		
		
		
		
	   // driver.findElement(By.xpath("(//div[@class =''.click();
	//	Select multipleDD = new Select (multipleWE);
	//	multipleDD.selectByValue("London");
	//	
		//checkbox.click();
	//	driver.findElement(By.xpath("ui-chkbox-box ui-widget ui-corner-all ui-state-default")).click();
		
		
	}

}
