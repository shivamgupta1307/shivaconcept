package TestNG_FrameWork;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssert_Vs_SoftAssert {
	
	
	@Test
	public void hardassert()
	{
		System.out.println("this is HardAssert testcase1");
		Assert.assertTrue(true);
		
		System.out.println("this is HardAssert testcase2");
		
		Assert.assertTrue(false);
		
		System.out.println("this is HardAssert testcase3");
		Assert.assertTrue(true);
	}
	
	
	@Test
	public void softassert()
	
	
	{
	    SoftAssert Object=new SoftAssert();
		
		System.out.println("This is SoftAssert testcase1");
		Object.assertTrue(true);
		
		System.out.println("This is SoftAssert testcase2");
		Object.assertTrue(false);
		
		System.out.println("This is SoftAssert testcase3");
		Object.assertTrue(true);
		
		Object.assertAll();
		
	}
	
	
	

}
