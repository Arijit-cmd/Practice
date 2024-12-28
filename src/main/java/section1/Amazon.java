package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import reusable.ReusableMethods;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver(); // Browser
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/"); // redirect url
		Thread.sleep(5000);

		// identifying and performing action on element
		ReusableMethods.locator(driver, By.xpath("//a[text()='Mobiles']")).click();

		ReusableMethods.locator(driver, By.cssSelector("input[placeholder='Search Amazon.in']"))
				.sendKeys("samsung s23e");

		ReusableMethods.locator(driver, By.xpath("//input[@id='nav-search-submit-button']")).click();

		String phoneName = ReusableMethods.locator(driver,By.xpath(
				"//span[text()='SAMSUNG Galaxy S23 FE 5G (Graphite 128 GB Storage) (8 GB RAM)']"))
				.getText();

		String price = ReusableMethods.locator(driver, By.xpath(
				"//span[text()='SAMSUNG Galaxy S23 FE 5G (Graphite 128 GB Storage) (8 GB RAM)']/../../../following-sibling::div/following-sibling::div/div/div/div/div/div/a/span/span[2]/span[2]"))
				.getText();

		System.out.println(phoneName + " price " + price);
	}

} // scroll problem
