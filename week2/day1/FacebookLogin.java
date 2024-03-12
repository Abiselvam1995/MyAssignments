package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Tuna@321");
		driver.findElement(By.name("login")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Find your account and log in.")).click();
		 String titleWebPage = driver.getTitle();
		if (titleWebPage.contains("Find Your Account"))
				{
			System.out.println("Title Verifed successfully");
		}
		else {
			System.out.println("Title not available");
		}
		driver.close();
	}

}
