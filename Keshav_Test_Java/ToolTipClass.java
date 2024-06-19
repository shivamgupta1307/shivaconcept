package Keshav_Test_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ToolTipClass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		String Tooltip=driver.findElement(By.partialLinkText("Sign Up"))
				.getAttribute("title");
		
		System.out.println(Tooltip);
		
		String Actual="Sign up for Facebook";
        
		Assert.assertEquals(Tooltip, Actual,"pass");
		
		
		
		
		/*if(Tooltip.equals(Actual))
		{
			System.out.println("Pass");
		}
		else 
		{
			System.out.println("Fail");
		}
		*/
	}

}
