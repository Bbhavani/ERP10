package com.erp.master;

import org.testng.annotations.Test;

import com.erp.master.masterlib;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

import org.testng.annotations.AfterSuite;

public class Basicng 
{  
	public static masterlib SL=new masterlib();
	
	
	
  @BeforeTest
  public void beforeTest()
  {
	  SL.Admlgn("admin","master");
	  		
  }
  @AfterTest
  public void afterTest()
  {
	 SL.logout(); 
  }

  @BeforeSuite
  public void beforeSuite() throws IOException 
  {
	  SL.openApp("http://webapp.qedgetech.com");
  }

  @AfterSuite
  public void afterSuite()
  {
	  SL.closeapp();
	  
	  
  }

}
