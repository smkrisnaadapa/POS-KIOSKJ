package com.pos.testcases;

import java.time.Duration;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class TC_Partial_Refund_Cash_Concessions extends BaseClass{
	
	
	//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	
	//private static final int Anchor = 0;

	@Test
	
	public void PartialRefundConcession() throws InterruptedException  {
	//	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		driver.findElementById("co.za.consnet.pos.app:id/search_lin").click();

		Scanner Concession = new Scanner(System.in);

		System.out.print("Enter PartialRefundConcession: ");
//		 	int number = input.nextInt();
		String Concession_TransactionID = Concession.nextLine();

		System.out.println("You entered " + Concession_TransactionID);
		driver.findElementById("co.za.consnet.pos.app:id/edt_search_transaction").sendKeys(Concession_TransactionID);
		driver.findElementById("co.za.consnet.pos.app:id/btn_search_transaction").click();
		driver.findElementById("co.za.consnet.pos.app:id/performance_location").click();
		driver.findElementById("co.za.consnet.pos.app:id/btn_yes").click();
		Thread.sleep(10000);
	}
	
	
	
@Test
	
	public void PartialRefund() {
driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

//new TouchAction(driver).press(350, 390).waitAction(5000).moveTo(250, 0).release().perform();

//Element Swipping for refund the concession


//driver.findElement(By.xpath("//android.widget.FrameLayout[contain(@resource-id, 'sub_item_swipe_layout') and @index='2']")).isDisplayed();

//driver.findElement(By.xpath("//android.widget.LinearLayout[@index= '0']/android.widget.FrameLayout[@index='1']")).isEnabled();





   //    driver.findElement(By.xpath("//android.widget.FrameLayout[contains(@resource-id,'sub_item_swipe_layout') and @index='1']")).isDisplayed();
       
		
	    // Get location of element you want to swipe
	 //  WebElement banner = driver.findElement(By.xpath("//android.support.v7.widget.RecyclerView[contains(@resource-id, 'andinner_order_item_rv') and @index='1']/[contains(@resource-id, 'sub_item_swipe_layout') and index='0']"));
 

      //  WebElement banner = driver.findElement(By.xpath("//android.widget.FrameLayout[contains(@resource-id, 'sub_item_swipe_layout') and @index='1']"));
        
    //    banner.isSelected();
 //       banner.click();
        
 //       driver.findElement(By.xpath("//android.widget.FrameLayout[contains(@resource-id, 'sub_item_swipe_layout') and @index='1']")).isDisplayed();
	
	

	
	//	WebElement banner = driver.findElement(By.xpath("//android.support.v7.widget.RecyclerView[contains(@resource-id, 'sub_item_swipe_layout') and @index='1']/android.widget.LinearLayout[index='0']"));
		
		
		// WebElement banner = driver.findElement(By.id("co.za.consnet.pos.app:id/sub_item_swipe_layout"));
		
		
		
		
	//WebElement banner = driver.findElement(By.id("co.za.consnet.pos.app:id/inner_order_item_rv"));
	
	//banner.isDisplayed();
	
	
	 //	WebElement banner = driver.findElement(By.id("co.za.consnet.pos.app:id/txt_combo_name"));





//the element swipe
	
		
		
WebElement banner = driver.findElement(By.xpath("//android.widget.LinearLayout[@index= '0']/android.widget.FrameLayout[@index='0']"));
		
		
		Point bannerPoint = banner.getLocation();
	    // Get size of device screen
	    Dimension screenSize = driver.manage().window().getSize();
	    // Get start and end coordinates for horizontal swipe
 
	    int startX = Math.toIntExact(Math.round(screenSize.getWidth()*0.50));
	   
	   
	    int endX = 0;

	    TouchAction action = new TouchAction(driver);
	    action
	            .press(PointOption.point(startX, bannerPoint.getY()))
	            .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
	            .moveTo(PointOption.point(endX, bannerPoint.getY()))
	            .release();
	         driver.performTouchAction(action);
	    
	    driver.findElement(By.id("co.za.consnet.pos.app:id/btn_payment")).click();
	    
	   
	    
	   

/*
Dimension size = driver.manage().window().getSize();
System.out.println(size.height +"height");
System.out.println(size.width + "width");
System.out.println(size);
int startPoint = (int) (size.width * 0.25);
int endPoint = (int) (size.width * 0.01);
int ScreenPlace =(int) (size.height*0.40);	
int y=(int)size.height*20;

       TouchAction ts = new TouchAction(driver);
       for(int i=0;i<=3;i++) {
       ts.press(PointOption.point(startPoint,ScreenPlace ))
  	  .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
  	  .moveTo(PointOption.point(endPoint,ScreenPlace )).release().perform();
  	  
		/*
		

new TouchAction((PerformsTouchActions) driver)
			.press(PointOption.point(0, 350))
			.waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
			.moveTo(PointOption.point(390, 450))
			.release().perform();

public static void swipeHorizontal(AppiumDriver driver, double startPercentage, double finalPercentage, double anchorPercentage, int duration) throws Exception {
    Dimension size = driver.manage().window().getSize();
    int anchor = (int) (size.height * anchorPercentage);
    int startPoint = (int) (size.width * startPercentage);
    int endPoint = (int) (size.width * finalPercentage);
    new TouchAction(driver).press(startPoint, anchor).waitAction(Duration.ofMillis(duration)).moveTo(endPoint, anchor).release().perform();
}

/*
new TouchAction(driver).press(390, 450)
.waitAction(Duration.ofSeconds(2))
.moveTo(0, 350)
.release().perform();
*/
		
	
		new TouchAction(driver)
	    .press(PointOption.point(390, 530))
	    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
	    .perform()
	    .moveTo(PointOption.point(10, 395))
	    .release()
	    .perform();
		
		new TouchAction(driver)
	    .press(PointOption.point(0, 450))
	    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
	    .perform()
	    .moveTo(PointOption.point(390, 550))
	    .release()
	    .perform();
	    


		
		}


		}
	
