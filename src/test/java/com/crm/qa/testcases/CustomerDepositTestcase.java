package com.crm.qa.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.CustomerLoginPage;
import com.crm.qa.pages.DepositPage;
import com.crm.qa.util.TestUtil;

public class CustomerDepositTestcase extends TestBase {
	CustomerLoginPage customerloginpage;
	TestUtil testutil;
	DepositPage depositpage;
	

	public CustomerDepositTestcase() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		customerloginpage = new CustomerLoginPage();
		depositpage = new DepositPage();
	}
//Test
	@Test(priority = 1)
	public void customerdeposit() {
		
	
		customerloginpage = customerloginpage.navigatetocustomerselection();
		depositpage = depositpage.navigatetodeposit();
		depositpage = depositpage.enteramount();
		depositpage = depositpage.btn();
		Assert.assertTrue(depositpage.isDepositSuccessful(), "Amount was not deposited successfully.");
		}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

        

	}
	
	

