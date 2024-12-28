package section1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import reusable.ReusableMethods;

public class ExcelDemo {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		Thread.sleep(3000);

		driver.get("https://www.flipkart.com/");

		// driver.findElement(By.name("q")).sendKeys("Iphone");
		WebElement ele = ReusableMethods.locator(driver, By.name("q"));

		ele.sendKeys("Iphone");
		ele.submit();

		List<WebElement> allPhoneName = driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone ')]"));

		FileInputStream fis = new FileInputStream("./Book1.xlsx");

		Workbook book = WorkbookFactory.create(fis);

		Sheet sh = book.getSheet("Sheet2");

		for (int i = 0; i < allPhoneName.size(); i++) {

			Row ro = sh.createRow(i);

			Cell ce = ro.createCell(1);

			ce.setCellValue(allPhoneName.get(i).getText());

			FileOutputStream fos = new FileOutputStream("./Book1.xlsx");

			book.write(fos);

			fos.flush();

		}
		System.out.println("pass");

	}

}
