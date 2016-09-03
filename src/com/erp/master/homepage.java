package com.erp.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homepage 
{
	@FindBy(xpath=".//*[@id='mi_a_suppliers']/a")
    WebElement supplier;
	
	@FindBy(xpath=".//*[@id='mi_a_purchases']/a")
	WebElement purchase;
	
	
	public void sup()
	{
		supplier.click();
	}
	
	 public void pur()
	 {
	 
		 purchase.click();
	 }
	
	
}
