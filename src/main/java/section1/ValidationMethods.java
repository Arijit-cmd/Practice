package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationMethods {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://online.actitime.com/tcs3/login.do");
		Thread.sleep(5000);
		
		WebElement ele = driver.findElement(By.xpath("//input[contains(@title,'Do not select if')]"));
		
	}

}
