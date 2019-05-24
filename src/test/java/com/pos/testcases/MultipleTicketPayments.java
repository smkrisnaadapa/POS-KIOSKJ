package com.pos.testcases;
//public class MultipleSignIn {

//package arclight;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MultipleTicketPayments extends BaseClass {
	
@Test
public void MultipleSignIn () 
{
	
	driver.findElement(By.xpath("//android.support.v7.widget.RecyclerView[@index='1']/android.widget.LinearLayout[@index='1']")).click();
	
	 
		//seat selected 
//	driver.findElementByClassName("android.widget.ImageView").click();
		driver.findElementById("co.za.consnet.pos.app:id/img_adult_plus").click();
		driver.findElementById("co.za.consnet.pos.app:id/img_senior_plus").click();
		driver.findElementById("co.za.consnet.pos.app:id/img_child_plus").click();
		 	
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

 
