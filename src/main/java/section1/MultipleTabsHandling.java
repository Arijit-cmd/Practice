package section1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabsHandling {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		
		//open 2nd Tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.in/");
		
		//open 3rd Tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.zomato.com/");
		
		//open 4th Tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.co.in/");
		
		Set<String> allID = driver.getWindowHandles();
		
		for(String id:allID) {
			
			String title = driver.switchTo().window(id).getTitle();
			System.out.println(title);
			
			if(title.equals("Zomato")) {
				break;
			}
		}
		driver.close();

	}

}
