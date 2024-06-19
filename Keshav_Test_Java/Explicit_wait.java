package Keshav_Test_Java;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Stopwatch;

public class Explicit_wait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.eroomrent.in/");
		
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		Stopwatch watch=null;
		
		try {
			watch =Stopwatch.createStarted();
		WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated
				(By.linkText("FAQ")));
				
		ele.click();
	
		}
		catch(Exception e)
		{
			watch.stop();
			System.out.println(e);
			System.out.println(watch.elapsed(TimeUnit.SECONDS)+"seconds");
		}

	}

}
