package TestNG_FrameWork;

import org.testng.annotations.*;
import org.testng.annotations.BeforeSuite;

public class First_Testng {
	@BeforeSuite
	public void beforesuite() {
		System.out.println("This is beforesuite");
	}

	@BeforeTest
	public void beforetest() {
		System.out.println("This is beforetest");
	}

	@BeforeClass
	public void beforeclass() {
		System.out.println("This is beforeclass");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is beforemethod");
	}

	@Test
	public void TestAnnotation1() {
		System.out.println("This is mainHero Test Annotation");
	}

	@AfterMethod
	public void aftermethod() {
		System.out.println("This is AfterMethod");
	}

	@AfterClass
	public void afterclass() {
		System.out.println("This is AfterClass");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("This is AfterTest");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("This is AfterSuite");
	}

}
