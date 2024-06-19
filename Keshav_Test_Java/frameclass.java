package Keshav_Test_Java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameclass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://inwww.rediff.com/");
	
		List<WebElement> No_Of_iframe=driver.findElements(By.tagName("iframe"));
		System.out.println("Total iframe= "+No_Of_iframe.size());
		
		
		driver.switchTo().frame("moneyiframe");
	WebElement ele=	driver.findElement(By.id("nseindex"));
	   System.out.println(ele.getText());

	}

}
