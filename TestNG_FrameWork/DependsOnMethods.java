package TestNG_FrameWork;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DependsOnMethods {

	public WebDriver driver;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
	}

	@Test(priority = 1)
	public void clickButton() {
		driver.findElement(By.cssSelector("a[title=\"My Account\"]")).click();
		driver.findElement(By.partialLinkText("Register")).click();

	}

	@Test(priority = 2)
	public void fillRegisterPage() throws InterruptedException {
		driver.findElement(By.name("firstname")).sendKeys("shivam");
		driver.findElement(By.name("lastname")).sendKeys("gupta");
		driver.findElement(By.name("email")).sendKeys("shivamgupta1307@gmail.com");
		driver.findElement(By.name("telephone")).sendKeys("7566818809");
		driver.findElement(By.name("password")).sendKeys("shivam@987");
		driver.findElement(By.name("confirm")).sendKeys("shivam@987");
		driver.findElement(By.name("newsletter")).click();
		driver.findElement(By.name("agree")).click();
		//driver.findElement(By.cssSelector("input[value=\"Continue\"]")).click();
	Thread.sleep(9000);
	}

	@Test(priority = 3)
	public void loginPage() {
		
		
		
		driver.findElement(By.cssSelector("a[title=\"My Account\"]")).click();
		driver.findElement(By.partialLinkText("Login")).click();

		driver.findElement(By.id("input-email")).sendKeys("shivamgupta1307@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("shivam@987");
		driver.findElement(By.cssSelector("input[value=\"Login\"]")).click();
	}

	@AfterClass
	public void logoutTab() {

	}
}
