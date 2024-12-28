package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Slider.html");

		WebElement ele = driver
				.findElement(By.xpath("//a[@class = 'ui-slider-handle ui-state-default ui-corner-all']"));
		
		Actions act = new Actions(driver);
		act.dragAndDropBy(ele, 50, 0).perform();

	}

}
