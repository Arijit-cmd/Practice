package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import reusable.ReusableMethods;

public class AmazonPriceSlider {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); // Browser
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/"); // redirect url
		Thread.sleep(5000);

		// identifying and performing action on element
		ReusableMethods.locator(driver, By.xpath("//a[text()='Mobiles']")).click();

		ReusableMethods.locator(driver, By.cssSelector("input[placeholder='Search Amazon.in']"))
				.sendKeys("samsung s23e");

		ReusableMethods.locator(driver, By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)", "");
		Thread.sleep(5000);
		
		//WebElement ele1 = driver.findElement(By.xpath("//input[@id='p_36/range-slider_slider-item_lower-bound-slider']"));
		//WebElement ele2 = driver.findElement(By.xpath("//input[@id='p_36/range-slider_slider-item_upper-bound-slider']"));
		
		//WebElement ele = driver.findElement(By.xpath("//input[@id='p_36/range-slider_slider-item_lower-bound-slider']"));
		WebElement ele = driver.findElement(By.xpath("//div[@id='p_36/range-slider_slider-item']"));
		
		Actions act = new Actions(driver);
		//act.dragAndDropBy(ele1, 10, 0);
		//act.dragAndDropBy(ele2, -20, 0);
		
		act.dragAndDropBy(ele, 30, 0);
		
		

	}

}
