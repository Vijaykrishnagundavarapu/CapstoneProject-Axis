package com.crm.qa.testcases;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.BnkMngrLoginPage;
import com.crm.qa.pages.SearchCustomersPage;

public class SearchCustomersTestcase extends TestBase {

	BnkMngrLoginPage managerLogin;
	SearchCustomersPage searchcustomerPage;

    public SearchCustomersTestcase() {
        super(); // Constructor call to initialize WebDriver and load URL
    }

    @BeforeMethod
    public void setup() {
    	 initialization();
        managerLogin = new BnkMngrLoginPage();
        searchcustomerPage= new SearchCustomersPage();
    }
    
    @Test(priority = 1)
   	public void searchcustomers() {
   		
   	
   		managerLogin = managerLogin.clickOnManagerLogin();
   		searchcustomerPage = searchcustomerPage.clickOnCustomerLogin();
   		searchcustomerPage = searchcustomerPage.searchCustomer("Harry");
    }
    @AfterMethod
	public void tearDown(){
		driver.quit();
	}
    
}
