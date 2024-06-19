package Keshav_Test_Java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_WebTable_Exa {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/shivam%20gupta/OneDrive/Desktop/Prectic.html");

		WebElement ele = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[1]"));
		System.out.println(ele.getText());

		List<WebElement> totalrow = driver.findElements(By.xpath("/html/body/table/tbody/tr"));

		System.out.println("TotalRow= " + totalrow.size());

		List<WebElement> totalcell = driver.findElements(By.xpath("/html/body/table/tbody/tr/th"));

		System.out.println("TotalCell= " + totalcell.size());

		for (int r = 2; r <= totalrow.size(); r++) {
			for (int c = 1; c <= totalcell.size(); c++) {
				WebElement ele1 = driver.findElement(By.xpath("/html/body/table/tbody/tr[" + r + "]/td[" + c + "]"));
				System.out.println(ele1.getText());
			}
		}

	}

}
