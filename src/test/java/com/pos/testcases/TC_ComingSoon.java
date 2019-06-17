package com.pos.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class TC_ComingSoon extends BaseClass {
//	AndroidDriver driver;
	
	@Test
			
	public void RightSwipe12() throws Exception  {
		//	Thread.sleep(00);
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
	
	private void ZComingSoon() {
//	WebDriverWait wait = new WebDriverWait(driver,10);
// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ListView[@index='1']/android.widget.LinearLayout[@index = '2']")));
	
driver.findElement(By.xpath("//android.widget.ListView[@index='1']/android.widget.LinearLayout[@index = '2']")).click();
// driver.findElement(By.xpath("//android.widget.ListView[@index='1']/android.widget.LinearLayout[@index = '0']")).click();

}
}
