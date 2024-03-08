package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.CustomerLoginPage;
import com.crm.qa.util.TestUtil;

public class CustomerLoginPageTest extends TestBase {
	CustomerLoginPage customerloginpage;
	TestUtil testutil;
	

	public CustomerLoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		customerloginpage = new CustomerLoginPage();
	}
//Test
	@Test(priority = 1)
	public void customerloginpagetest() {
		
	
		customerloginpage = customerloginpage.navigatetocustomerselection();
		Assert.assertTrue(customerloginpage.navigatetocustomerhomepage());

	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	

}
