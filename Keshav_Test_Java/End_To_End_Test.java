package Keshav_Test_Java;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class End_To_End_Test {

	public static void main(String[] args) throws AWTException {
System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.eroomrent.in/ownerlogin.php");
		
		driver.findElement(By.name("txtEmail")).sendKeys("chaudadeeksha@gmail.com");
		driver.findElement(By.name("txtPassword")).sendKeys("dc14116209");
		driver.findElement(By.name("btnsubmit")).click();
		driver.findElement(By.linkText("Add Room")).click();
		
		WebElement drop=driver.findElement(By.tagName("select"));
		Select dropdown=new Select(drop);
		dropdown.selectByIndex(5);
		
		List<WebElement> ele1=dropdown.getOptions();
		//total Location
		System.out.println("Total="+ele1.size());
		 //Created to PtintLocation
		for(WebElement e1:ele1)
		{
			System.out.println(e1.getText());
			
		}
		
	Actions act=new Actions(driver);	
	WebElement File=driver.findElement(By.cssSelector("input[name='file']"));
	//File.sendKeys("C:\\Users\\shivam gupta\\OneDrive\\Desktop\\testing image\\shivalogo.jpg");
	act.click(File).build().perform();
	
	Robot Rb=new Robot();
	Rb.delay(2000);
	
	StringSelection sa=new StringSelection
("C:\\Users\\shivam gupta\\OneDrive\\Desktop\\testing image\\shivalogo.jpg");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sa,null);
	
	Rb.keyPress(KeyEvent.VK_CONTROL);
	Rb.keyPress(KeyEvent.VK_V);
	
	Rb.keyRelease(KeyEvent.VK_CONTROL);
	Rb.keyRelease(KeyEvent.VK_V);
	
	Rb.keyPress(KeyEvent.VK_ENTER);
	Rb.keyPress(KeyEvent.VK_ENTER);
	
	
	
	
	
	
	//	driver.quit();
		
		
		
		
		
		
		
		
     
//		WebElement drop=driver.findElement(By.id("location"));
//		Select se=new Select(drop);
//	//	se.selectByIndex(1);
//	//	se.selectByValue("10");
//		se.selectByVisibleText("Saket Square");

	}

}
