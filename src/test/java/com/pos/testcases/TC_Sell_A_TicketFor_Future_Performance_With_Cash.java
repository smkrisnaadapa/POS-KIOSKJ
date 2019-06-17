package com.pos.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_Sell_A_TicketFor_Future_Performance_With_Cash extends BaseClass {
	
	@Test
	public void Future_Performance_With_Cash() 
	{
		
		// driver.findElement(By.xpath("//android.widget.LinearLayout[@index='0']/android.widget.TextView[@index='0']")).click();
		
		driver.findElementById("co.za.consnet.pos.app:id/time_block").click();
		driver.findElement(By.xpath("//android.view.View[@text='3' and @index='2']")).click();
		
		driver.findElement(By.xpath("//android.support.v7.widget.RecyclerView[@index='1']/android.widget.LinearLayout[@index='1']")).click();
				 
			//seat selected 
//		driver.findElementByClassName("android.widget.ImageView").click();
			driver.findElementById("co.za.consnet.pos.app:id/img_adult_plus").click();
			 	
		//payment
			driver.findElementById("co.za.consnet.pos.app:id/btn_payment").click();
				
	//cash exact 
			driver.findElementById("co.za.consnet.pos.app:id/button_exact").click();
	//
			
		//	driver.findElementById("android:id/button1").click();
			

			//final payment
			
			driver.findElementById("co.za.consnet.pos.app:id/btn_payment_2").click();
	}


}
