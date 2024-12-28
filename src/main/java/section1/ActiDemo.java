package section1;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiDemo {

	public static void main(String[] args) throws InterruptedException {
		
		// Handle dynamic values
        Random r = new Random();
		
		int rnd = r.nextInt(100000);
		
		//System.out.println(rnd);
		
		String str = "Arijit"+rnd;
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Thread.sleep(3000);
		
		driver.get("https://online.actitime.com/tcs3/login.do");
		//Thread.sleep(5000);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("singhqsp1@gmail.com");
		//driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("singhqsp1@gmail.com");
		
		//driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("Singh@1234");
		driver.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys("Singh@1234");
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]")).sendKeys("Singh@1234");
		
		driver.findElement(By.xpath("//input[contains(@title,'Do not select if')]")).click();
		//driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']")).click();
		
		//driver.findElement(By.xpath("//div[text()='Login ']")).click(); //1 of 1
		//driver.findElement(By.xpath("//div[contains(text(),'Login ')]")).click(); //1 of 2
		driver.findElement(By.xpath("//a[contains(@id,'loginButton')]")).click();
		//driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		//Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[text()='Tasks']")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[text()='New Customer']")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys(str);
		//driver.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder.newNameField.inputNameField']")).sendKeys("Arijit");//error with dot
		
		driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys("NYC");
		//Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
	}

}
