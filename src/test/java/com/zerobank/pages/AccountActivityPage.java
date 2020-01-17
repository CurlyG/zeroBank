package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccountActivityPage {

    public AccountActivityPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(linkText = "Account Activity")
    public WebElement accountActivityModule;

    @FindBy(id = "aa_accountId")
    public WebElement dropdown;

    @FindBy(xpath = "//thead/tr/th")
    public List<WebElement> accountActivityTable;




}
