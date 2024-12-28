package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(3000); 
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		WebElement ele = driver.findElement(By.name("username"));
		
		ele.sendKeys("Admin");
		
        WebElement ele1 = driver.findElement(By.name("password"));
		
		ele1.sendKeys("admin123");
		
		Thread.sleep(4000);
		
		WebElement ele2 = driver.findElement(By.tagName("button"));
		
		ele2.click();
		
		
		Thread.sleep(4000);
		
        Navigation nav = driver.navigate();
		
		nav.back();
		Thread.sleep(3000);
		nav.forward();
		Thread.sleep(3000);
		nav.refresh();
		
		

	}

}
