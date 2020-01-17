package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayBillsPage {
    WebDriver driver;
    public PayBillsPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(linkText="Pay Bills")
    public WebElement PayBillsModule;

    @FindBy(id="sp_amount")
    public WebElement amountBox;

    @FindBy(id="sp_date")
    public WebElement dateBox;

    @FindBy(id="sp_description")
    public WebElement descriptionBox;

    @FindBy(id="pay_saved_payees")
    public WebElement payButton;

    @FindBy(id="alert_content")
    public WebElement alertSuccessful;

}
