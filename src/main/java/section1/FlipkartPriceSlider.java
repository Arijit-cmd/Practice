package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import reusable.ReusableMethods;

public class FlipkartPriceSlider {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//span[text()='Mobiles & Tablets']")).click();
		ReusableMethods.locator(driver, By.xpath("//span[text()='Mobiles & Tablets']")).click();
		
		ReusableMethods.locator(driver, By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("iphone");
		
		ReusableMethods.locator(driver, By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		
		WebElement ele1 = ReusableMethods.locator(driver, By.xpath("//div[@class='iToJ4v Kaqq1s']"));
		WebElement ele2 = ReusableMethods.locator(driver, By.xpath("//div[@class='iToJ4v Kaqq1s']/div[@class='PYKUdo']"));
		
		Actions act = new Actions(driver);
		act.dragAndDropBy(ele2, 40, 0).perform();
		

	}

}
