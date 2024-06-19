package Keshav_Test_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragClass {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable");
		
		Actions act=new Actions(driver);
		WebElement draggable=driver.findElement(By.id("draggable"));
        WebElement	droppable=driver.findElement(By.id("droppable"));
        act.dragAndDrop(draggable, droppable).perform();

	}

}
