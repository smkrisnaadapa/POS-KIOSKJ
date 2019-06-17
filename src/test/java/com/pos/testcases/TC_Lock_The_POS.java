package com.pos.testcases;

import org.testng.annotations.Test;

public class TC_Lock_The_POS extends BaseClass{
	
	@Test
	
	public void Lock_POS() {
	
		driver.findElementById("co.za.consnet.pos.app:id/img_lock_linearLayout").click();
		
	//	driver.findElementById("co.za.consnet.pos.app:id/img_lock").click();
		
		driver.findElementById("co.za.consnet.pos.app:id/edt_emp_pin_1").sendKeys("1");
		driver.findElementById("co.za.consnet.pos.app:id/edt_emp_pin_2").sendKeys("2");
		driver.findElementById("co.za.consnet.pos.app:id/edt_emp_pin_3").sendKeys("3");
		driver.findElementById("co.za.consnet.pos.app:id/edt_emp_pin_4").sendKeys("4");
		
	}
	

}
