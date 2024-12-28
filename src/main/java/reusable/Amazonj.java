package reusable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonj {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		driver.findElement(By.xpath("//span[text()='All']")).click();
		driver.findElement(By.xpath("//div[@id='hmenu-content']/"));

	}

}
