package section1;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.get("https://www.rapido.bike/");
		Thread.sleep(3000);
		driver.get("https://www.swiggy.com/");
		Thread.sleep(3000);
		driver.get("https://www.flipkart.com/");
		
		Navigation nav = driver.navigate();
		
		nav.back();
		Thread.sleep(3000);
		nav.forward();
		Thread.sleep(3000);
		nav.refresh();
		

	}

}
