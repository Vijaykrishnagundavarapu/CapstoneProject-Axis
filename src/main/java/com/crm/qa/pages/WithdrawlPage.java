package com.crm.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class WithdrawlPage extends TestBase {

    @FindBy(xpath = "//button[@ng-class='btnClass3']")
    WebElement withdrawSectionButton;

    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement amountInput;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement withdrawButton;
    
    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement withdrawlSuccessful;

    public WithdrawlPage() {
        PageFactory.initElements(driver, this);
    }

    //actions
    public WithdrawlPage clickOnWithdrawSection() {
        withdrawSectionButton.click();
		return new WithdrawlPage();
    }

    public WithdrawlPage enterAmount(String amount) {
        amountInput.sendKeys("300");
		return  new WithdrawlPage();
    }

    public WithdrawlPage clickOnWithdrawlButton() {
    	withdrawButton.click();
		return new WithdrawlPage();
        
    }

	public String getWithdrawSuccessMessage() {
		return withdrawlSuccessful.getText();
	}

	public boolean isTransactionSuccessful() {
		// TODO Auto-generated method stub
		return true;
	}
}