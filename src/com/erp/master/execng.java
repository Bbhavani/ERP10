package com.erp.master;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class execng extends Basicng
{
	@Test(dataProvider="udata")
	
 public void uom(String Uid,String Udesc)
 
 {
	 SL.uom(Uid,Udesc);
 }
	
	@DataProvider

	public Object[][] udata()
	{
	
		Object[][] obj=new Object[3][2];
		
		obj[0][0]="U890";
		obj[0][1]="abcd";
		obj[1][0]="1234";
		obj[1][1]="abcdo";
		obj[2][0]="U89011";
		obj[2][1]="abcdhhh";
		
		return obj;
		 
 }

}
