package reusable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReusableMethods {

	public static WebElement locator(WebDriver driver, By locatorName) {

		return driver.findElement(locatorName);

	}
}
