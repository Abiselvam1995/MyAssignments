package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbAccountCreation {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("Abinaya");
		driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("P");
		driver.findElement(By.name("reg_email__")).sendKeys("Abiselvam1995@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Abiselvam1995@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Athraabi@777");
		driver.findElement(By.name("")).sendKeys("Athraabi@777");
		driver.findElement(By.name("")).sendKeys("Athraabi@777");
		driver.findElement(By.name("")).sendKeys("Athraabi@777");
		

	}

}
