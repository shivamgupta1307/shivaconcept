package TestNG_FrameWork;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EroomRent1 {
	public WebDriver driver;
	@BeforeClass
	public void accessUrl()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testing.eroomrent.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Actions act=new Actions(driver);
		WebElement ele=driver.findElement(By.partialLinkText("Owner-G"));
		act.moveToElement(ele).perform();
		WebElement ele1=driver.findElement(By.partialLinkText("Register Here"));
		ele1.click();
		
	}
	/*@Test(priority=1,enabled=true)
	public void Register() throws InterruptedException
	{
		driver.findElement(By.name("txtfname")).sendKeys("shivamgupta");
		driver.findElement(By.name("txtmobile1")).sendKeys("7566818809");
		driver.findElement(By.name("txtPassword")).sendKeys("Shiva$789");
		driver.findElement(By.name("txtConfirmPassword")).sendKeys("Shiva$789");
		driver.findElement(By.name("txtEmail")).sendKeys("shivamgupta1307@gmail.com");
		driver.findElement(By.name("btnsubmit")).click();
		Thread.sleep(2000);
	}
	
*/
	@Test(priority=2)
	public void LoginClick() throws InterruptedException
	{
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		WebElement ele=driver.findElement(By.partialLinkText("Owner-G"));
		act.moveToElement(ele).perform();
		WebElement ele1=driver.findElement(By.partialLinkText("Login Here"));
		ele1.click();
		Thread.sleep(2000);
	}
	@Test(priority=3,enabled=true)
	public void Loginpage() throws InterruptedException
	{Thread.sleep(2000);
		driver.findElement(By.name("txtEmail")).sendKeys("shivamgupta1307@gmail.com");
		driver.findElement(By.name("txtPassword")).sendKeys("Shiva$789");
		driver.findElement(By.name("btnsubmit")).click();;
	}
	
	@AfterClass
	public void Logoutpage() throws InterruptedException
	{
		Thread.sleep(6000);
		driver.quit();
	}
	
	
	

}
