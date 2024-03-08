package com.crm.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.qa.base.TestBase;

public class SearchCustomersPage extends TestBase {

	@FindBy(xpath = "//button[@ng-class='btnClass3']")
    WebElement CustomerBtn;
	//@FindBy(xpath = "//button[@ng-class='btnClass3']")
    //WebElement customerBtn;
    @FindBy(xpath = "//input[@placeholder='Search Customer']")
    WebElement customeNameBtn;
    
    
    

    public SearchCustomersPage() {
        PageFactory.initElements(driver, this);
    }
    
  //customerBtn.click();

    public  SearchCustomersPage clickOnCustomerLogin() {
    	CustomerBtn.click();
    	
		return new SearchCustomersPage();
       
        
    }
    
    
    public  SearchCustomersPage searchCustomer(String customerName) {
    	
    	customeNameBtn.sendKeys(customerName);

		return new SearchCustomersPage();
    }
    	
}
 
    	
		

    
