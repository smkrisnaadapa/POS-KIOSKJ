package com.pos.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TC_Perform_Audit_POS extends BaseClass {
@Test
public void Audit_POS() {

	driver.findElementById("co.za.consnet.pos.app:id/dollar_lin").click();
	

	WebDriverWait wait = new WebDriverWait(driver,10);
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ListView[contains(@resource-id,'log_out_lst_view') and @index='1']/android.widget.LinearLayout[@index='3']")));
    
	driver.findElement(By.xpath("//android.widget.ListView[contains(@resource-id,'log_out_lst_view') and @index='1']/android.widget.LinearLayout[@index='3']")).click();
	
	driver.findElementById("co.za.consnet.pos.app:id/edt_emp_no_1_endshift").sendKeys("1");
	driver.findElementById("co.za.consnet.pos.app:id/edt_emp_no_2_endshift").sendKeys("4");
	driver.findElementById("co.za.consnet.pos.app:id/edt_emp_no_3_endshift").sendKeys("2");
	driver.findElementById("co.za.consnet.pos.app:id/edt_emp_no_4_endshift").sendKeys("6");
	driver.findElementById("co.za.consnet.pos.app:id/edt_emp_no_5_endshift").sendKeys("3");
	driver.findElementById("co.za.consnet.pos.app:id/edt_emp_no_6_endshift").sendKeys("7");
	
	driver.findElementById("co.za.consnet.pos.app:id/edt_emp_pin_1_endshift").sendKeys("1");
	driver.findElementById("co.za.consnet.pos.app:id/edt_emp_pin_2_endshift").sendKeys("2");
	driver.findElementById("co.za.consnet.pos.app:id/edt_emp_pin_3_endshift").sendKeys("3");
	driver.findElementById("co.za.consnet.pos.app:id/edt_emp_pin_4_endshift").sendKeys("4");
	
	driver.findElementById("co.za.consnet.pos.app:id/btn_login_endshift").click();
	
	
	
	
}

}
