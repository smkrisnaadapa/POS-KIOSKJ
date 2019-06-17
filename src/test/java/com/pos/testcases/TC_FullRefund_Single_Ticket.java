package com.pos.testcases;

import java.util.Scanner;

import org.testng.annotations.Test;

public class TC_FullRefund_Single_Ticket extends BaseClass {
	
	@Test

	public void ConcessionFull_Refund() {

	driver.findElementById("co.za.consnet.pos.app:id/search_lin").click();

	Scanner Concession = new Scanner(System.in);

	System.out.print("Enter the voucher: ");
//	 	int number = input.nextInt();
	String Concession_TransactionID = Concession.nextLine();

	System.out.println("You entered " + Concession_TransactionID);
	driver.findElementById("co.za.consnet.pos.app:id/edt_search_transaction").sendKeys(Concession_TransactionID);
	driver.findElementById("co.za.consnet.pos.app:id/btn_search_transaction").click();
	driver.findElementById("co.za.consnet.pos.app:id/performance_location").click();
	driver.findElementById("co.za.consnet.pos.app:id/btn_yes").click();
	
	}
}
