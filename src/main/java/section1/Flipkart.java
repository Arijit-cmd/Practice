package section1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import reusable.ReusableMethods;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		Thread.sleep(3000);

		driver.get("https://www.flipkart.com/");
		
		WebElement ele = ReusableMethods.locator(driver, By.name("q"));

		ele.sendKeys("Iphone");
		ele.submit();
		
		//List<WebElement> allPhoneName = driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone ')]"));
		
		List<WebElement> allPhoneName = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		
		List<WebElement> allPhonePrice = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
		
		FileInputStream fis = new FileInputStream("./Book1.xlsx");

		Workbook book = WorkbookFactory.create(fis);
		
		Sheet sh = book.getSheet("Sheet3");
		
		int lastRowValue = sh.getLastRowNum(); // To fetch the row number

		for (int i = 0; i < lastRowValue; i++) {

			

			for (int j = 0; j < ; j++) {

				
			}
			System.out.println();
		}
	}

} 
