package com.crm.qa.testcases;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.CustomerLoginPage;
import com.crm.qa.pages.TransactionPage;
import com.crm.qa.util.TestUtil;

public class CustomerTransactionTestcase extends TestBase{
	CustomerLoginPage customerloginpage;
	TestUtil testutil;
	TransactionPage transactionpage;
	public CustomerTransactionTestcase() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		customerloginpage = new CustomerLoginPage();
		transactionpage= new TransactionPage();
	}
	//Test
			@Test(priority = 1)
			public void customertransaction() {
				
			
				customerloginpage = customerloginpage.navigatetocustomerselection();
				transactionpage = transactionpage.clickOnTransactionSection();
			}
			@AfterMethod
			public void tearDown(){
				driver.quit();
			}
	
}
	