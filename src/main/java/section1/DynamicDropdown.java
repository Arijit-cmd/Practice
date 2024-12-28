package section1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		int count = 0;

		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Salman");

		Thread.sleep(3000);

		List<WebElement> mulEle = driver.findElements(By.xpath("//div[@class='erkvQe']/div/ul/li"));

		for (WebElement i : mulEle) {
			count++;
			System.out.println(i.getText());
		}
		if (count == 10) {
			System.out.println("Dropdown is verified");
		} else {
			System.out.println("Dropdown is not verified");
		}

		// In DropDown If I want to click any Element
		for (WebElement i : mulEle) {
			String visText = i.getText();

			if (visText.contains(" khan movies")) {
				i.click();
			}
		}

	}

}
