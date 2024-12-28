package section1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import reusable.ReusableMethods;

public class Myntra {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.navigate().to("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement ele = ReusableMethods.locator(driver, By.xpath("//div[@class='desktop-navLink']/a[text()='Kids']"));

		Actions act = new Actions(driver);

		act.moveToElement(ele).perform();

		List<WebElement> options = driver.findElements(By.xpath("//div[@data-group='kids']/li/ul/li"));

		int count = 0;
		for (WebElement i : options) {
			count++;
			System.out.println(i.getText());
		}
		if (count == 72) {
			System.out.println("Dropdown is verified");
		} else {
			System.out.println("Dropdown is not verified");
		}

		for (WebElement i : options) {
			String visText = i.getText();

			if (visText.contains("Jeans")) {
				i.click();
				break;
			}
		}

		// ReusableMethods.locator(driver, By.xpath("//label[@class='common-customRadio
		// gender-label']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ReusableMethods.locator(driver, By.xpath("//input[@value='Tshirts']")).click();

	}

}
