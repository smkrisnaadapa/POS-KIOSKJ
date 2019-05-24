package com.pos.testcases;



import org.testng.annotations.Test;

public class UpNext extends BaseClass {

	
@Test
public void Upnext()
{
	
	driver.findElementById("co.za.consnet.pos.app:id/up_next_lin").click();
}
}

