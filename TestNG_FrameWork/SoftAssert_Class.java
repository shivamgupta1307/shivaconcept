package TestNG_FrameWork;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_Class {
	
	
	
	@Test
	public void softAseert()
	{   
		SoftAssert Object=new SoftAssert();
		
		int a=20;
		int b=30;
		System.out.println("sum= "+(a+b));
		//Object.assertTrue(true);
		
		Object.assertEquals(a, b);
	

		boolean b1=1<2;
		boolean b2=2>3;
		Object.assertEquals(b1, b2, "b2 is a wrong statment");
		
		Object.assertAll();
			
	}

}
