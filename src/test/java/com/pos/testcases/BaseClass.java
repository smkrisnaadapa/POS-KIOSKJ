package com.pos.testcases;

import java.io.File;
import java.io.IOException;
//import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
// import org.apache.log4j.helpers.Loader;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BaseClass {
	
public AndroidDriver driver;
public static Logger logger;

@BeforeClass
public void setup()  throws Exception {

	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability("platformName", "Android");
	cap.setCapability("platformVersion", "7.0");
	cap.setCapability("deviceName", "emulator-5554");
	cap.setCapability("udid", "emulator-5554");
	cap.setCapability("appPackage","co.za.consnet.pos.app");
	cap.setCapability("appActivity", "info.consnet.arclight.activity.LoginActivity");

	driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	logger = Logger.getLogger("POS");
	PropertyConfigurator.configure("Log4j.properties"); 
	
	logger.info("connected the POS Emulator");
}
	





@ Test
public void EmpID()
{
	driver.findElementById("co.za.consnet.pos.app:id/edt_emp_no_1").sendKeys("6");
	driver.findElementById("co.za.consnet.pos.app:id/edt_emp_no_2").sendKeys("3");
	driver.findElementById("co.za.consnet.pos.app:id/edt_emp_no_3").sendKeys("2");
	driver.findElementById("co.za.consnet.pos.app:id/edt_emp_no_4").sendKeys("1");
	driver.findElementById("co.za.consnet.pos.app:id/edt_emp_no_5").sendKeys("4");
	driver.findElementById("co.za.consnet.pos.app:id/edt_emp_no_6").sendKeys("5");
//	Thread.sleep(1000);
	driver.findElementById("co.za.consnet.pos.app:id/edt_emp_pin_1").sendKeys("1");
	driver.findElementById("co.za.consnet.pos.app:id/edt_emp_pin_2").sendKeys("2");
	driver.findElementById("co.za.consnet.pos.app:id/edt_emp_pin_3").sendKeys("3");
	driver.findElementById("co.za.consnet.pos.app:id/edt_emp_pin_4").sendKeys("4");
	driver.findElementById("co.za.consnet.pos.app:id/btn_login").click();
	logger.info("Emp logined the POS successfully" );
}

	
	
/*
@AfterClass
public void afterClass() {
driver.quit();
logger.info("quit the App");

}
*/

public void captureScreen(WebDriver driver, String tname) throws IOException {
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
	FileUtils.copyFile(source, target);
	System.out.println("Screenshot taken");
}

}



