package com.pos.testcases;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_CheckAbililtytoRefundAlreadyRefundedTicketsAbove extends BaseClass{
//	driver.manage
	
	@Test
	private void RefundAlreafundedTicket() {
		driver.findElement(By.xpath("//android.support.v7.widget.RecyclerView[@index='1']/android.widget.LinearLayout[@index='1']")).click();
		
		 
		//seat selected 
//	driver.findElementByClassName("android.widget.ImageView").click();
		driver.findElementById("co.za.consnet.pos.app:id/img_adult_plus").click();
		driver.findElementById("co.za.consnet.pos.app:id/img_senior_plus").click();
		driver.findElementById("co.za.consnet.pos.app:id/img_child_plus").click();
		 	
	//payment
		driver.findElementById("co.za.consnet.pos.app:id/btn_payment").click();
			
//cash exact 
		driver.findElementById("co.za.consnet.pos.app:id/button_exact").click();
//
		
	//	driver.findElementById("android:id/button1").click();
		

		//final payment
		
		driver.findElementById("co.za.consnet.pos.app:id/btn_payment_2").click();
		
	//	public void ConcessionFull_Refund() {

    		driver.findElementById("co.za.consnet.pos.app:id/search_lin").click();
		//	driver.findElement(By.xpath("//android.widget.LinearLayout[contains(@resource-id, 'search_lin') and @index='2']")).click();

			Scanner Concession = new Scanner(System.in);

			System.out.print("Enter the Partial Ticket Refund Transaction ID: ");
//			 	int number = input.nextInt();
			String Concession_TransactionID = Concession.nextLine();

			System.out.println("You entered " + Concession_TransactionID);
			driver.findElementById("co.za.consnet.pos.app:id/edt_search_transaction").sendKeys(Concession_TransactionID);
			driver.findElementById("co.za.consnet.pos.app:id/btn_search_transaction").click();
			driver.findElementById("co.za.consnet.pos.app:id/performance_location").click();
			driver.findElementById("co.za.consnet.pos.app:id/btn_yes").click();
			
			}
		
		
	}


