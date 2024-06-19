package Keshav_Test_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavegatComond {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.eroomrent.in/");
		
		driver.findElement(By.partialLinkText("FAQ")).click();
      driver.navigate().back();
      driver.navigate().refresh();
      
      driver.findElement(By.partialLinkText("Contact Us")).click();
      driver.navigate().back();
      driver.navigate().refresh();
      
      WebElement ele=driver.findElement(By.partialLinkText("About Us"));
      ele.click();
      driver.navigate().back();
      driver.navigate().refresh();
      
      driver.navigate().to("https://www.shivatutorials.com/");
		

	}

}
