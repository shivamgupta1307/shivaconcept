package Keshav_Test_Java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTableClass 
{

	public static void main(String[] args) 
	{
	WebDriver driver;
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
	WebElement ele=	driver.findElement
			(By.xpath("//table[@name='BookTable']/tbody/tr[2]/td[3]"));
		System.out.println(ele.getText());
			
	List<WebElement> TotalRow=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
		System.out.println("TotalRow= "+TotalRow.size());
		
		List<WebElement> TotalCell=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/th"));
		System.out.println("TotalCell= "+TotalCell.size());
		
		for(int r=2;r<=TotalRow.size();r++)
		{
			for(int c=1;c<=TotalCell.size();c++)
			{
				WebElement PrintCellText=	driver.findElement
				(By.xpath("//table[@name='BookTable']/tbody/tr["+r+"]/td["+c+"]"));
					System.out.println(PrintCellText.getText());
			
		}
		
		
		
		
	
		}
		}	
	
		
}
