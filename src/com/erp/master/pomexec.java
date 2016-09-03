package com.erp.master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class pomexec 
{

	
public void loginexec()
{
 WebDriver driver=new FirefoxDriver();
 driver.get("http://webapp.qedgetech.com");
 driver.manage().window().maximize();
 
 loginpage lp=PageFactory.initElements(driver,loginpage.class);
lp.adminlogin("admin","master");

}
	
	
	
	
	
	


}
