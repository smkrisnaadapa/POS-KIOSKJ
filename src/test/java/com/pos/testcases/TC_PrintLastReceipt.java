package com.pos.testcases;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
//import org.openqa.selenium.interactions.touch.TouchActions;
//import org.openqa.selenium.interactions.internal.TouchAction;
import org.openqa.selenium.By;


import org.testng.annotations.Test;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import org.openqa.selenium.Dimension;
 
import java.time.Duration;
 
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;
import static java.time.Duration.ofSeconds;

//public static Logger logger;


public class TC_PrintLastReceipt extends BaseClass {
//	public static Logger logger;

//	private static final String PerformsTouchactions = null;
//	RightSwipe11();
	
   
	@Test
/*	
	public void PrintLastReceipt() {
		
		RightSwipe11();
	//	 driver.findElement(By.xpath("//android.widget.LinearLayout[index='0']")).click();
		
	}
	*/
	
	public void RightSwipe11() throws Exception  {
		Thread.sleep(1000);
		Dimension size = driver.manage().window().getSize();
        System.out.println(size.height+"height");
        System.out.println(size.width+"width");
         System.out.println(size);
         int startPoint = (int) (size.width * 0.99);
         int endPoint = (int) (size.width * 0.15);
         int ScreenPlace =(int) (size.height*0.40);          
         int y=(int)size.height*20;

        TouchAction ts = new TouchAction(driver);
        //for(int i=0;i<=3;i++) {
        ts.press(PointOption.point(startPoint,ScreenPlace ))
       .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
       .moveTo(PointOption.point(endPoint,ScreenPlace )).release().perform();
        
        Thread.sleep(1000);
	}
	
	@Test
	
	private void lastprint() {
	//	driver.findElement(By.xpath("//android.widget.LinearLayout[index='0']")).click();	
//	driver.findElement(By.xpath("//android.widget.ListView[contains(@resource-id,'nav_view') and @index='1']/android.widget.LinearLayout[@index = '0']")).click();
	driver.findElement(By.xpath("//android.widget.ListView[@index='1']/android.widget.LinearLayout[@index = '0']")).click();
	
	}   
}
     
        
    //    driver.findElement(By.xpath("//android.widget.LinearLayout[index='0']")).click();
        
        /*
         *      ts.press(PointOption.point(startPoint,ScreenPlace ))
       .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
       .moveTo(PointOption.point(endPoint,ScreenPlace )).release().perform();
         */
        
        
  // driver.findElement(By.xpath("//android.widget.ListView[contains(resource-id,'nav_view') and @index='1']/android.widget.LinearLayout[@index='0']")).click();
//	}

// private void PrintLastReceipt1() {
	// TODO Auto-generated method stub
//	driver.findElement(By.xpath("//android.widget.LinearLayout[index='0']")).click();	
	
// }
//}
    /*	  Dimension dim = driver.manage().window().getSize();
    	  int height = dim.getHeight();
    	  int width = dim.getWidth();
    	  int x =width/99;
    	  int Left_y=(int)(width*.99);
    	  int right_y = (int)(width*.20);
    	  
    	//  System.out.println("coordinates:" + x +""+ Left_y +"" + right_y); 
    	  
    	  driver.findElementById("co.za.consnet.pos.app:id/action_bar_root").click();
    	  
    	  
    	  
    	  TouchAction ts= new TouchAction(driver);
    	  //ts.press(point(x, Left_y).moveTo(x, right_y).release().perform();
    	  new TouchAction(driver)
          .press(point(2560, 1504))
          .waitAction(waitOptions(ofMillis(1000)))
          .moveTo(point(2160, 0))
          .release().perform();
    	  
    }
}
 */   

  /*  	    }
    //Horizontal Swipe by percentage
    
    public void horizontalSwipeByPercentage (double startPercentage, double endPercentage, double anchorPercentage) {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.height * anchorPercentage);
        int startPoint = (int) (size.width * startPercentage);
        int endPoint = (int) (size.width * endPercentage);
 
        new TouchAction(driver)
                .press(point(startPoint, anchor))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(endPoint, anchor))
                .release().perform();
    }
    
    /*
	@Test
        public void leftRightSwipe(int timeduration) {
        	  // duration should be in milliseconds
        	  Dimension size = driver.manage().window().getSize();
        	  System.out.println(size);
        	  int startx = (int) (size.width * 0.90);
        	  int endx = (int) (size.width * 0.30);
        	  int starty = size.height / 2;
        	  System.out.println("Start swipe operation");
      //  	  driver.swipe(endx, starty, startx, starty, timeduration);
        	  
        	  new TouchAction(driver)
              .press(point(startx, starty))
              .waitAction(waitOptions(ofMillis(1000)))
              .moveTo(point(starty, starty))
              .release().perform();
	}  */
