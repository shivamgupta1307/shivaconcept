package TestNG_FrameWork;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert_Class {
	
	
	@Test
	public void hardassert()
	{
		
		
		String ex="this is java";
		String a="this is python";
		Assert.assertEquals(a, ex);
		
	}
	@Test
	public void databoolean()
	{
	
		boolean a1=1<2;
		boolean b=2>3;
		Assert.assertTrue(a1!=b,"b ststment is wrong ");
	}
}
