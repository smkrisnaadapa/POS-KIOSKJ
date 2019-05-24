package com.pos.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_PrintLastReceipt extends BaseClass {
	
	@Test
	
public void PrintLastReceipt()
{
	driver.findElement(By.xpath("//android.widget.ListView[@index='0']/android.widget.LinearLayout[@index='5']")).click();
	driver.findElementById("co.za.consnet.pos.app:id/lin_combo_6_coll_1_sub_1_1").click();
	driver.findElementById("co.za.consnet.pos.app:id/lin_combo_6_coll_2_sub_3_2").click();
	driver.findElementById("co.za.consnet.pos.app:id/lin_combo_6_coll_3_sub_4_2").click();
	driver.findElementById("co.za.consnet.pos.app:id/btn_done_combo_6").click();
	driver.findElementById("co.za.consnet.pos.app:id/btn_payment").click();
	driver.findElementById("co.za.consnet.pos.app:id/button_exact").click();
	driver.findElementById("co.za.consnet.pos.app:id/btn_payment_2").click();
	
}
}