package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		// to launch browser
				ChromeDriver driver = new ChromeDriver();
				
			    // to load url
				driver.get("http://leafground.com/input.xhtml");
				
				//to maximize window
				driver.manage().window().maximize();
				
				// to find username field
				WebElement tagyourName = driver.findElement(By.name("j_idt88:name"));
				String placeholder = tagyourName.getAttribute("placeholder");
				System.out.println("placeholder :" + placeholder);
				
				tagyourName.sendKeys("Abi");
				System.out.println("tagyourName :" + tagyourName);
				
				
				

	}

}
