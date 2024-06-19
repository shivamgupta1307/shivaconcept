package Keshav_Test_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.eroomrent.in/");
		
		Actions act=new Actions(driver);
		WebElement ele=driver.findElement(By.partialLinkText("Owner-G"));
		act.moveToElement(ele).build().perform();
		
		Actions act1 =new Actions(driver);
		WebElement ele1=driver.findElement(By.partialLinkText("Broker-G"));
		act1.moveToElement(ele1).perform();
		
		Actions act2=new Actions(driver);
		WebElement ele2=driver.findElement(By.partialLinkText("Rent"));
		act2.moveToElement(ele2).perform();
		
		Actions act3=new Actions(driver);
		WebElement ele3=driver.findElement(By.partialLinkText("Register for rent"));
		act3.click(ele3).perform();
		
		
		
		
		
	}

}
