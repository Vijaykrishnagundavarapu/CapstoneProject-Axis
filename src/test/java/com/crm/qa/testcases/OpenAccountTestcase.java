package com.crm.qa.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.BnkMngrLoginPage;
import com.crm.qa.pages.OpenAccountPage;

public class OpenAccountTestcase extends TestBase {

	 BnkMngrLoginPage managerLogin;
	 OpenAccountPage openaccount;

    public OpenAccountTestcase() {
        super(); // Constructor call to initialize WebDriver and load URL
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        managerLogin = new BnkMngrLoginPage();
        openaccount = new OpenAccountPage();
    
    }
    
    @Test(priority = 1)
	public void openaccount() {
		
	
		managerLogin = managerLogin.clickOnManagerLogin();
		openaccount = openaccount.clickOnOpenAccount();
		openaccount = openaccount.ClickonCustomerDropdown();
		openaccount = openaccount.ClickonCurrencyDropdown();
		openaccount = openaccount.Processbutton();
		Assert.assertTrue(openaccount.isAccountOpenedSuccessfully(), "Account was not opened successfully.");
    }
    @AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
