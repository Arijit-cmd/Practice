package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import reusable.ReusableMethods;

public class CoronaOp {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.worldometers.info/coronavirus/");
		
		String cases = ReusableMethods.locator(driver, By.xpath("//h1[text()='Coronavirus Cases:']/following-sibling::div/span")).getText();
		
		System.out.println("Total Corona Cases :- "+cases);

	}

}
