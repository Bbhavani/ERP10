package com.erp.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

      public class demoscript
      {

		public static void main(String[] args)
		{
			WebDriver driver=new FirefoxDriver();
			String Expval="Login";
			driver.get("http://webapp.qedgetech.com");
			driver.manage().window().maximize();
			String Actval=driver.findElement(By.id("btnsubmit")).getText();
			if (Expval.equalsIgnoreCase(Actval)) 
			{
			System.out.println("Application launched");	
			}
			else
			{
				System.out.println("Application does not launched");
			}
			driver.findElement(By.id("btnreset")).click();
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.id("password")).sendKeys("master");
			driver.findElement(By.id("btnsubmit")).click();
			
			driver.findElement(By.linkText("Logout")).click();
		}
			/*//supplier creation
			
			driver.findElement(By.linkText("Suppliers")).click();
			Sleeper.sleepTightInSeconds(5);
			driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")).click();
			Sleeper.sleepTightInSeconds(5);
			driver.findElement(By.id("x_Supplier_Name")).sendKeys("abc");
			driver.findElement(By.id("x_Address")).sendKeys("1234");
			driver.findElement(By.id("x_City")).sendKeys("hyd");
			driver.findElement(By.id("x_Country")).sendKeys("india");
			driver.findElement(By.id("x_Contact_Person")).sendKeys("abcd");
			driver.findElement(By.id("x_Phone_Number")).sendKeys("040123");
			driver.findElement(By.id("x__Email")).sendKeys("bha@123");		
			driver.findElement(By.id("x_Mobile_Number")).sendKeys("900000012");	
			driver.findElement(By.id("x_Notes")).sendKeys("null");	
			driver.findElement(By.id("btnAction")).click();
			driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
			Sleeper.sleepTightInSeconds(5);
			driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button")).click();
			
			//stock iteams
			 Actions act = new Actions(driver);
		       act.moveToElement(driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"))).build().perform();
			   driver.findElement(By.xpath(".//*[@id='mi_a_stock_categories']/a")).click();
			   Sleeper.sleepTightInSeconds(5);
			   driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")).click();
			   Sleeper.sleepTightInSeconds(5);
			   driver.findElement(By.xpath(".//*[@id='x_Category_Name']")).sendKeys("hth");
			   Sleeper.sleepTightInSeconds(5);
			   driver.findElement(By.id("btnAction")).click();
			
			   driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")).click();
			   Sleeper.sleepTightInSeconds(5);
		    driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button")).click();
			   
			   //uom
			   
			   Actions act1 = new Actions(driver);
		       act1.moveToElement(driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"))).build().perform();
			   Sleeper.sleepTightInSeconds(5);
			   driver.findElement(By.xpath(".//*[@id='mi_a_unit_of_measurement']/a")).click();
			   driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")).click();
			   driver.findElement(By.id("x_UOM_ID")).sendKeys("abcd");
			   driver.findElement(By.id("x_UOM_Description")).sendKeys("00000");
			   driver.findElement(By.id("btnAction")).click();
			   driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")).click();
			   Sleeper.sleepTightInSeconds(5);
			   driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button")).click();
			 
			  //suppliers

			   Actions act2 = new Actions(driver);
		       act2.moveToElement(driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"))).build().perform();
			   Sleeper.sleepTightInSeconds(5);
			   driver.findElement(By.xpath(".//*[@id='mi_a_suppliers']/a")).clear();
			   
	
			   
			
			
			
		}
		*/

       
		
			 
			 
			 
			 
			 
			 
			 
	}


