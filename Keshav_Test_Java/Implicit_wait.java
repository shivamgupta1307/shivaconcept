package Keshav_Test_Java;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Stopwatch;

public class Implicit_wait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.eroomrent.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		Stopwatch watch=null;
		
		try {
			watch =Stopwatch.createStarted();
			driver.findElement(By.linkText("FAQ")).click();
			driver.findElement(By.linkText("Contact Us")).click();
			
		}
		catch(Exception e)
		{
			watch.stop();
			System.out.println(e);
			System.out.println(watch.elapsed(TimeUnit.SECONDS)+"seconds");
		}
		
		

	}

}
