package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://online.actitime.com/tcs3/login.do");
		Thread.sleep(3000);

		//driver.findElement(By.id("username")).sendKeys("singhqsp1@gmail.com");
		driver.findElement(By.name("username")).sendKeys("singhqsp1@gmail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Singh@1234");
		
		//driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		
	}

}
