package TestNG_Convert_XML;

import org.testng.annotations.Test;

@Test(groups="TestData")
public class Groups_Class {

	@Test(groups = "smock")
	public void testcase1()
	{
		System.out.println("this is Testcase1");
	}

	@Test(groups = { "smock", "sanity" })
	public void testcase2()
	{
		System.out.println("this is TestCase2");
	}

	@Test(groups = { "smock", "sanity", "regression" })
	public void testcase3() 
	{
		System.out.println("this is TestCase3");
	}

	@Test(groups = "sanity")
	public void testcase4() 
	{
		System.out.println("this is TestCase4");
	}

	@Test(groups = "window.regression")
	public void testcase5() 
	{
		System.out.println("this is TestCase5");
	}

}
