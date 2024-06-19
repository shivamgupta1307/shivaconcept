package Keshav_Test_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shivaconceptsolution.com/backupmain/test3.html");
		
		driver.findElement(By.cssSelector("input[value='alert']")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[value='confirm']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[value='prompt']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("java");
		driver.switchTo().alert().accept();
		

	}

}
