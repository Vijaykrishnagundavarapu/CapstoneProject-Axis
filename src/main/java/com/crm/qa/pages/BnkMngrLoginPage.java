package com.crm.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.crm.qa.base.TestBase;

public class BnkMngrLoginPage extends TestBase {

	@FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement managerLoginBtn;
    
    
    

    public BnkMngrLoginPage() {
        PageFactory.initElements(driver, this);
    }

    public  BnkMngrLoginPage clickOnManagerLogin() {
    	managerLoginBtn.click();
		return new BnkMngrLoginPage() ;
    }
}
        