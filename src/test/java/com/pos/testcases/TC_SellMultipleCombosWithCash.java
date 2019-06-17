package com.pos.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_SellMultipleCombosWithCash extends BaseClass{
	
	@Test
	public void SellConcessions()
	{
		driver.findElementById("co.za.consnet.pos.app:id/concession_lin").click();
		driver.findElement(By.xpath("//android.support.v7.widget.RecyclerView[@index='0']/android.widget.LinearLayout[@index='4']")).click();
		driver.findElement(By.xpath("//android.support.v7.widget.RecyclerView[@index='2']/android.widget.LinearLayout[@index='1']")).click();
		driver.findElement(By.xpath("//android.support.v7.widget.RecyclerView[@index='2']/android.widget.LinearLayout[@index='3']")).click();
//	driver.findElementById("co.za.consnet.pos.app:id/btn_payment").click();
	
	//driver.findElementById("co.za.consnet.pos.app:id/concession_lin").click();
	driver.findElement(By.xpath("//android.support.v7.widget.RecyclerView[@index='0']/android.widget.LinearLayout[@index='5']")).click();
	driver.findElementById("co.za.consnet.pos.app:id/lin_combo_6_coll_1_sub_1_2").click();
	driver.findElementById("co.za.consnet.pos.app:id/lin_combo_6_coll_2_sub_3_2").click();
	driver.findElementById("co.za.consnet.pos.app:id/lin_combo_6_coll_2_sub_1_6").click();
	driver.findElementById("co.za.consnet.pos.app:id/combo_6_btn_up_sale_left").click();
	driver.findElementById("co.za.consnet.pos.app:id/lin_combo_6_coll_3_sub_4_2").click();
	driver.findElementById("co.za.consnet.pos.app:id/btn_done_combo_6").click();
	driver.findElementById("co.za.consnet.pos.app:id/btn_payment").click();
	//payment
	//		driver.findElementById("co.za.consnet.pos.app:id/btn_payment").click();
				
	//cash exact 
			driver.findElementById("co.za.consnet.pos.app:id/button_exact").click();
	//
			
		//	driver.findElementById("android:id/button1").click();
			

			//final payment
			
			driver.findElementById("co.za.consnet.pos.app:id/btn_payment_2").click();

	}

}
