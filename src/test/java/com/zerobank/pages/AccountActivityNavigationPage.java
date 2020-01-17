package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountActivityNavigationPage {

    public AccountActivityNavigationPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(linkText = "Savings")
    public WebElement savingLink;

    @FindBy(linkText = "Brokerage")
    public WebElement brokerageLink;

    @FindBy(linkText = "Checking")
    public WebElement checkingLink;

    @FindBy(linkText = "Credit Card")
    public WebElement creditCardLink;

    @FindBy(linkText = "Loan")
    public WebElement loanLink;






}
