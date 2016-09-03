package com.erp.master;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class masterlib 	
	{
	private static final CharSequence Uname = null;
	public static Properties Pr;
	public static FileInputStream Fis;
	public static WebDriver driver;
	public static String Expval,Actval;

	public String openApp(String Url) throws IOException
	{
		Pr=new Properties();
		Fis=new FileInputStream("D:\\bhavani\\erp\\src\\com\\erp\\properties\\rep.properties");
		
		Pr.load(Fis);
		Expval="Login";
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get(Url);
		Actval=driver.findElement(By.id(Pr.getProperty("Login"))).getText();
	    if (Expval.equalsIgnoreCase(Actval))
	    {
		//System.out.println("pass");
		  return "Pass";
	    }
	    else
	    {
	    	//System.out.println("Fail");
	       return "Fail";
	    }
	}
	
	

	public String Admlgn(String Un,String Pwd)
	{
		Expval="Administrator";
		driver.findElement(By.id(Pr.getProperty("Reset"))).click();
		driver.findElement(By.id(Pr.getProperty("Uname"))).sendKeys(Un);
		driver.findElement(By.id(Pr.getProperty("pwd"))).sendKeys(Pwd);
		driver.findElement(By.id(Pr.getProperty("Login"))).click();
		 Actval=driver.findElement(By.xpath(".//*[@id='msUserName']/font/strong")).getText();
	 	    if(Expval.equalsIgnoreCase(Actval))
	 	       {
	 			//System.out.println("Stock accounting home page displayed");
	 	      return "pass";
	 	       }
	 	       else
	 	       {
	 	    	//System.out.println("Stock accounting home page not displayed");
	 	       return "Fail";
	 	       }
	}  
	 			
	
	
	
	 	    public String suplierscreation(String sno,String sn,String add,String city,String cntry,String cperson,String pno,String email,String mno,String notes)
	 	    {
	 	    	Expval ="Add succeeded";
            driver.findElement(By.xpath(".//*[@id='mi_a_suppliers']/a")).click();
            driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")).click();
            driver.findElement(By.id(Pr.getProperty("supno"))).sendKeys(sno);
            driver.findElement(By.id(Pr.getProperty("supname"))).sendKeys(sn);
            driver.findElement(By.id(Pr.getProperty("address"))).sendKeys(add);
            driver.findElement(By.id(Pr.getProperty("city"))).sendKeys(city);
            driver.findElement(By.id(Pr.getProperty("country"))).sendKeys(cntry);
            driver.findElement(By.id(Pr.getProperty("cperson"))).sendKeys(cperson);
            driver.findElement(By.id(Pr.getProperty("phoneno"))).sendKeys(pno);
            driver.findElement(By.id(Pr.getProperty("email"))).sendKeys(email);
            driver.findElement(By.id(Pr.getProperty("mnumber"))).sendKeys(mno);
            driver.findElement(By.id(Pr.getProperty("notes"))).sendKeys(notes);
            driver.findElement(By.id(Pr.getProperty("btnaction"))).click();
            driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
			Sleeper.sleepTightInSeconds(5);
			driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button")).click();
			
          //System.out.println("Stock accounting home page displayed");
            Actval=driver.findElement(By.xpath(".//*[@id='msUserName']/font/strong")).getText();
	 	    if(Expval.equalsIgnoreCase(Actval))
            {
            	return "pass";
	 	       }
	 	       else
	 	       {
	 	    	//System.out.println("Stock accounting home page not displayed");
	 	       return "Fail";
	 	    
	 	       }
	 	    }  
	 	  
	 		public String stockitems(String catname)
	 		
	 		{
	 			Expval ="Add succeeded";
	 			
	 			Actions act1 = new Actions(driver);
			    act1.moveToElement(driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"))).build().perform();
			     Sleeper.sleepTightInSeconds(5);
				driver.findElement(By.xpath(".//*[@id='mi_a_stock_categories']/a")).click();
		        driver.findElement(By.xpath(Pr.getProperty("catadd"))).click();
			    driver.findElement(By.xpath(".//*[@id='x_Category_Name']")).sendKeys(catname);
		        driver.findElement(By.xpath(".//*[@id='btnAction']")).click();
	           
		        driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")).click();
			    //System.out.println("Stock accounting home page displayed");
	            Actval=driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[3]/div/div")).getText();
	            driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button")).click();
		 	    if(Expval.equalsIgnoreCase(Actval))
	            {
	            	return "pass";
		 	       }
		 	       else
		 	       {
		 	    	//System.out.println("Stock accounting home page not displayed");
		 	       return "Fail";
		 	    
		 	       }
	 		}
			   
			   
	 		public String uom(String Uid,String Udes)
	 		{
	 			Expval ="Add succeeded";
	
	 			Actions act1 = new Actions(driver);
			    act1.moveToElement(driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"))).build().perform();
			   Sleeper.sleepTightInSeconds(5);
			   driver.findElement(By.xpath(Pr.getProperty("uom"))).click();
			   driver.findElement(By.xpath(Pr.getProperty("uomadd"))).click();
			   driver.findElement(By.id(Pr.getProperty("uomid"))).sendKeys(Uid);
			   driver.findElement(By.id(Pr.getProperty("uomdesc"))).sendKeys(Udes);
			   driver.findElement(By.id(Pr.getProperty("uomcreate"))).click();
			  
			   
			   driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")).click();
			   
			  
			//System.out.println("Stock accounting home page displayed");
	            Actval=driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[3]/div/div")).getText();
	            driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button")).click();
		 	    if(Expval.equalsIgnoreCase(Actval))
	            {
	            	return "pass";
		 	       }
		 	       else
		 	       {
		 	    	//System.out.println("Stock accounting home page not displayed");
		 	       return "Fail";
		 	    
		 	       }
	 		
	          }	
	        public void logout()
	        {
	        	driver.findElement(By.linkText("Logout")).click();
	        	
	        }
	          public void closeapp()
	          {
	           driver.close();
	          }
	
	
	}

