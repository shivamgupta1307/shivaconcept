package Keshav_Test_Java;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotClass {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://commons.apache.org/io/download_io.cgi");
		
		//TakesScreenshot screen=((TakesScreenshot)driver);
		
		WebElement ele1=driver.findElement(By.tagName("img"));
		
		File handle=ele1.getScreenshotAs(OutputType.FILE);
		
		File des=new File("D:\\AbhiSectionshot1.jpg");
		
		FileUtils.copyFile(handle, des);
		
		
		if(des.createNewFile())
	       {
	        System.out.println("File Created:-"+des.getName());

	       }
	        else
	         {
	          System.out.println("File alrady Exixts.");
	         }

		
		
		

	}

}
