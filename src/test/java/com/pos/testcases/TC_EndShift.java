package com.pos.testcases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;

public class TC_EndShift extends BaseClass {
	
	@Test
	
public void EndShift() {
	
	// driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	driver.findElementById("co.za.consnet.pos.app:id/dollar_lin").click();
//	Actions action = new Actions(driver);
	
//	WebDriverWait wait = new WebDriverWait(driver,10);
//   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ListView[contains(@resource-id,'log_out_lst_view') and @index='1']/android.widget.LinearLayout[@index='5']")));
    
	driver.findElement(By.xpath("//android.widget.ListView[contains(@resource-id,'log_out_lst_view') and @index='1']/android.widget.LinearLayout[@index='5']")).click();
	
	Actions action = new Actions(driver);
	WebElement Enter = driver.findElementById("co.za.consnet.pos.app:id/btn_enter_");
	// To click on the element
	action.moveToElement(Enter);
	Enter.click();
	
	//driver.findElementById("co.za.consnet.pos.app:id/btn_enter_").click();
	
	
	driver.findElementById("co.za.consnet.pos.app:id/btn_yes").click();
	
	// driver.findElement(By.xpath("//android.widget.Button[contains(resouce-id, 'btn_enter_') and @text = 'ENTER']")).click();
	
	Enter.click();
	// driver.findElementById("co.za.consnet.pos.app:id/btn_enter_").click();
	
	/*
	Actions action1 = new Actions(driver);
    WebElement Enter1 = driver.findElementById("co.za.consnet.pos.app:id/btn_enter_");
	// To click on the element
	action1.moveToElement(Enter1);
	action1.perform();
	Enter1.click();
	*/ 
	// driver.findElementById("co.za.consnet.pos.app:id/btn_enter_").click();
	Enter.click();
	
	driver.findElementById("co.za.consnet.pos.app:id/btn_yes").click();
	/*
	Actions action2 = new Actions(driver);
	WebElement Enter2 = driver.findElementById("co.za.consnet.pos.app:id/btn_enter_");
	// To click on the element
	action2.moveToElement(Enter2);
	action2.perform();
	Enter2.click();
	*/
	// driver.findElementById("co.za.consnet.pos.app:id/btn_enter_").click();
	
	driver.findElementById("co.za.consnet.pos.app:id/btn_yes").click();
	
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
	
	driver.findElementById("co.za.consnet.pos.app:id/btn_enter_").click();
	
	driver.findElementById("co.za.consnet.pos.app:id/edt_emp_pin_1_endshift").sendKeys("1");
	driver.findElementById("co.za.consnet.pos.app:id/edt_emp_pin_2_endshift").sendKeys("2");
	driver.findElementById("co.za.consnet.pos.app:id/edt_emp_pin_3_endshift").sendKeys("3");
	driver.findElementById("co.za.consnet.pos.app:id/edt_emp_pin_4_endshift").sendKeys("4");
	
	driver.findElementById("co.za.consnet.pos.app:id/btn_login_endshift").click();
	
	driver.findElementById("android:id/button1").click();
	
	
	
	
	
	
}

}
