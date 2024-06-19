package TestNG_Convert_XML;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Parameter_Class {
	public WebDriver driver;
	
	@Test
	@Parameters({"url","email","password"})
	public void eroomrent(String url,String email,String password)
	
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
	
		
		driver.findElement(By.cssSelector("a[title=\"My Account\"]")).click();
		driver.findElement(By.partialLinkText("Login")).click();

		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input[value=\"Login\"]")).click();
	}
	//shivamgupta1307@gmail.com //"shivam@987"
//https://tutorialsninja.com/demo/index.php?route=common/home
}
