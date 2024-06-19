package Keshav_Test_Java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firas {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.eroomrent.in/");
		
		String url=driver.getCurrentUrl();
		System.out.println("URL= "+url);
		
		String Title=driver.getTitle();
		System.out.println("Title ="+Title);
		
//		String Source=driver.getPageSource();
//		System.out.println(Source);
//		
    //Total Links 
		List<WebElement> TotalLink=driver.findElements(By.tagName("a"));
		System.out.println("TotalLink = "+TotalLink.size());
		
		WebElement ele=driver.findElement(By.tagName("nav"));
		int a=ele.findElements(By.tagName("a")).size();
		System.out.println("Total HaderLink="+a);
		
		WebElement ele2=driver.findElement(By.tagName("footer"));
		int b=ele2.findElements(By.tagName("a")).size();
		System.out.println("Total Footer Link= "+b);
		
		

			
		
		
		
		driver.findElement(By.className("img-fluid")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.partialLinkText("FAQ")).click();
		
		WebElement ele1=driver.findElement(By.partialLinkText("Contact Us"));
		ele1.click();
		
		
	}

}
