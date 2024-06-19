package Keshav_Test_Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_Tab_Window {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.eroomrent.in/");
		System.out.println("first tab= "+driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.WINDOW);//TAB
		driver.get("https://www.postman.com/downloads/");
			System.out.println("Second Tab= "+driver.getTitle());
			
			driver.switchTo().newWindow(WindowType.WINDOW);
			driver.get("https://www.postman.com/downloads/");
				System.out.println("Three Tab= "+driver.getTitle());
		
		Set<String> windowhandle=driver.getWindowHandles();
		
		List<String> Handle=new ArrayList<String>();
		Handle.addAll(windowhandle);
		//driver.close();
		
	}

}
