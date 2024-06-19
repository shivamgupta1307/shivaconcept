package TestNG_FrameWork;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Second_Testng {

	

	@Test(priority=2)
	public void aestcase1() {
		System.out.println("This is testcase1");

	}

	@Test(priority=1)
	public void bestcase2() {
		System.out.println("this is testcase2");

	}

	@Test
	public void cestcase3() {
		System.out.println("this is testcase3");

	}
	
	@Test
	public void destcase4() {
		System.out.println("This is testcase4");

	}
	@Test
	public void estcase5() {
		System.out.println("This is testcase5");

	}



	

}
