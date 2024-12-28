package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHandling {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		WebElement ele = driver.findElement(By.linkText("Gmail"));
		
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("STAR");
		
		// RIGHT CLICK
		act.moveToElement(ele).contextClick().build().perform();
		
		//DOUBLE CLICK
		//act.moveToElement(searchBox).doubleClick().build().perform();
		act.doubleClick(searchBox).perform();
		

	}

}
