package com.pos.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_SellMultipleCombosWithCash extends BaseClass{
	
	@Test
	public void SellConcessions()
	{
		driver.findElementById("co.za.consnet.pos.app:id/concession_lin").click();
		driver.findElement(By.xpath("//android.support.v7.widget.RecyclerView[@index='0']/android.widget.LinearLayout[@index='0']")).click();
		
		
		
		driver.findElement(By.xpath("//android.support.v7.widget.RecyclerView[@index='2']/android.widget.LinearLayout[@index='1']")).click();
		driver.findElement(By.xpath("//android.support.v7.widget.RecyclerView[@index='3']/android.widget.LinearLayout[@index='3']")).click();
	driver.findElementById("co.za.consnet.pos.app:id/btn_payment").click();

	}

}
