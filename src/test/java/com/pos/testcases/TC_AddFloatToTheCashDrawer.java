package com.pos.testcases;

import org.testng.annotations.Test;

public class TC_AddFloatToTheCashDrawer extends BaseClass {

	@Test
	
	public void addfloat() {

			driver.findElementById("co.za.consnet.pos.app:id/add_float_to_cash_drawer").click();
			
			
			//Pre-Positions Floats
			//driver.findElementById("co.za.consnet.pos.app:id/Pre_Position").click();
			
			driver.findElementById("co.za.consnet.pos.app:id/btn_yes").click();
	}
}
