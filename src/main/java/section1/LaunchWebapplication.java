package section1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchWebapplication {

	public static void main(String[] args) {
		//Launch Browser
		ChromeDriver driver = new ChromeDriver();
		//Launch WebApplication
		driver.get("https://www.flipkart.com/");
		
		//capture the title of webPage
		String title = driver.getTitle();
		System.out.println(title);
		
		//capture the URL of a WebPage
		String currentPageUrl = driver.getCurrentUrl();
		System.out.println(currentPageUrl);

	}

}
