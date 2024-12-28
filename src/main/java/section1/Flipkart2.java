package section1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import reusable.ReusableMethods;

public class Flipkart2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//span[text()='Mobiles']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		ReusableMethods.locator(driver, By.xpath("//div[text()='Apple iPhone 15 (Blue, 128 GB)']")).click();

		String mainID = driver.getWindowHandle();
		Set<String> allID = driver.getWindowHandles();
		System.out.println(mainID);

		for (String id : allID) {
			// 10 == 11
			if (!mainID.equals(id)) {
				driver.switchTo().window(id);
			}
		}
		
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
	}

}
