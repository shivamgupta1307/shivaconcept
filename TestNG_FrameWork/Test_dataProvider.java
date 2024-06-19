package TestNG_FrameWork;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test_dataProvider {

	@Test(dataProvider = "getdata")
	public void catchData(String email, String password) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testing.eroomrent.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.partialLinkText("Owner-G"));
		act.moveToElement(ele).perform();
		WebElement ele1 = driver.findElement(By.partialLinkText("Login Here"));
		ele1.click();

		driver.findElement(By.name("txtEmail")).sendKeys(email);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.name("btnsubmit")).click();

	}

	@DataProvider
	public Object getdata() {
		Object data[][] = { { "shivamgupta1307@gmail.com", "Shiva$789" },
				{ "shivamgupta1307@gmail.com", "Shiva$789" },
				{ "shivamgupta1307@gmail.com", "Shiva$789" },
				{ "shivamgupta1307@gmail.com", "Shiva$789" } };
		return data;

	}

}
