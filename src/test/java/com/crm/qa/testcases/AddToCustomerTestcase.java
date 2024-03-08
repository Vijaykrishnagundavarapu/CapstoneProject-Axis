package com.crm.qa.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.AddCustomerpage;
import com.crm.qa.pages.BnkMngrLoginPage;

public class AddToCustomerTestcase extends TestBase {

	 BnkMngrLoginPage managerLogin;
	 AddCustomerpage addcustomer;

    public AddToCustomerTestcase() {
        super(); // Constructor call to initialize WebDriver and load URL
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        managerLogin = new BnkMngrLoginPage();
        addcustomer = new AddCustomerpage();
    
    }
    @Test(priority = 1)
	public void addcustomer() {
		
	
		managerLogin = managerLogin.clickOnManagerLogin();
		addcustomer = addcustomer.clickOnAddCustomer();
		addcustomer = addcustomer.enterFirstName("vijay");
		addcustomer = addcustomer.enterLastName("krishna");
		addcustomer = addcustomer.enterZipCode("523105");
		addcustomer = addcustomer.clickOnAddCustomerBtn();
		Assert.assertTrue(addcustomer.isCustomerAddedSuccessfully(), "Customer was not added successfully.");
		
	}
    @AfterMethod
	public void tearDown(){
		driver.quit();
	}
 

    
    
}