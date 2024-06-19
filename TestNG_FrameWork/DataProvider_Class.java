package TestNG_FrameWork;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Class {

	@Test(dataProvider="getdata")
	public void catchData(String name,int number,String email,int id)
	{
		
	}
	
	@Test(dataProvider="getdata")
	public void catchData1(String name,int number,String email,int id)
	{
		
	}
	@Test(dataProvider="getdata")
	public void catchData2(String name,int number,String email,int id)
	{
		
	}
	
	@DataProvider
	public Object getdata()
	{
		Object [][]data=new Object[3][4];
		
		data[0][0]="Shivam";
		data[0][1]=75668188;
		data[0][2]="shivam@12gmail.com";
		data[0][3]=101;
		
		data[1][0]="Pavas";
		data[1][1]=99985233;
		data[1][2]="pavas@456gmail.com";
		data[1][3]=102;
		
		data[2][0]="Neha";
		data[2][1]=94251680;
		data[2][2]="neha@987gmail.com";
		data[2][3]=103;
		
		
		return data;
		
		
	}
	
	
	
}
