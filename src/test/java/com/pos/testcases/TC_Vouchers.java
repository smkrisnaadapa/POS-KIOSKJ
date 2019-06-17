package com.pos.testcases;

import java.time.Duration;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EmptyFileException;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class TC_Vouchers extends BaseClass {
	
		@Test
/*	
	public void PrintLastReceipt() {
		
		RightSwipe11();
	//	 driver.findElement(By.xpath("//android.widget.LinearLayout[index='0']")).click();
		
	}
	*/
		
	public void RightSwipe13() throws Exception  {
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	//	Thread.sleep(1000);
		Dimension size = driver.manage().window().getSize();
        System.out.println(size.height+"height");
        System.out.println(size.width+"width");
         System.out.println(size);
         int startPoint = (int) (size.width * 0.99);
         int endPoint = (int) (size.width * 0.15);
         int ScreenPlace =(int) (size.height*0.40);          
         int y=(int) (size.height*20);

        TouchAction ts = new TouchAction(driver);
        //for(int i=0;i<=3;i++) {
        ts.press(PointOption.point(startPoint,ScreenPlace ))
       .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
       .moveTo(PointOption.point(endPoint,ScreenPlace )).release().perform();
        
   //     Thread.sleep(1000);
        
	}
	
	@Test
	
	private void Vouchers_SingleTicket_bkng() throws  Exception   {
	//	Thread.sleep(1000);
	//	WebDriverWait wait = new WebDriverWait(driver,10);
	//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ListView[@index='1']/android.widget.LinearLayout[@index = '4']")));
			
	//	driver.findElement(By.xpath("//android.widget.LinearLayout[index='0']")).click();	
//	driver.findElement(By.xpath("//android.widget.ListView[contains(@resource-id,'nav_view') and @index='1']/android.widget.LinearLayout[@index = '0']")).click();
	driver.findElement(By.xpath("//android.widget.ListView[@index='1']/android.widget.LinearLayout[@index = '4']")).click();
//	Thread.sleep(1000);
	
	//	   public static void main(String[] args) {
		    	
		    	Scanner input = new Scanner(System.in);
		    	
		    	System.out.print("Enter the voucher: ");
		   // 	int number = input.nextInt();
		    	String voucher = input.nextLine();
		    	
		    	System.out.println("You entered " + voucher);
		   driver.findElementById("co.za.consnet.pos.app:id/et_voucher_code").sendKeys(voucher);
		   driver.findElementById("co.za.consnet.pos.app:id/btn_validate").click();
		   driver.findElementById("co.za.consnet.pos.app:id/btnHome").click();
		   driver.findElement(By.xpath("//android.support.v7.widget.RecyclerView[@index='1']/android.widget.LinearLayout[@index='1']")).click();
			
			 
			//seat selected 
//		driver.findElementByClassName("android.widget.ImageView").click();
			driver.findElementById("co.za.consnet.pos.app:id/img_adult_plus").click();
			 	
		//payment
			driver.findElementById("co.za.consnet.pos.app:id/btn_payment").click();
			
			driver.findElementById("co.za.consnet.pos.app:id/btn_payment_2").click();
					 	  
	}
}
