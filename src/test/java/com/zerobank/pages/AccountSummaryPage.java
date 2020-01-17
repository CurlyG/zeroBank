package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccountSummaryPage extends BasePage{

    public AccountSummaryPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(linkText = "Account Summary")
    public WebElement accountSummary;

    @FindBy(xpath = "//div[@class='offset2 span8']/h2")
    public List<WebElement> AccountTypes;

    @FindBy(xpath = "//h2[text()='Credit Accounts']/following-sibling::div[@class='board'][1]/div/table/thead/tr/th")
    public List<WebElement> AccountColumn;










}
