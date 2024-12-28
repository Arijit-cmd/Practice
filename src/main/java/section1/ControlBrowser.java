package section1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ControlBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch Browser
				ChromeDriver driver = new ChromeDriver();
				//Launch WebApplication
				driver.get("https://www.flipkart.com/");
				
				//maximize
				driver.manage().window().maximize();
				//minimize
				//driver.manage().window().minimize();
				//after minimize can we maximize
				//Thread.sleep(3000);
				//driver.manage().window().maximize();
				
				//Resize Browser
				
				Dimension d = new Dimension(300, 500);
				
				driver.manage().window().setSize(d);
				
				//Change the starting point of Browser
				Thread.sleep(3000);
				//Point p = new Point(400, 0);
				driver.manage().window().setPosition(new Point(400, 0));
				
				//Thread.sleep(3000);
				//driver.manage().window().setSize(new Dimension(300, 400));

	}

}
