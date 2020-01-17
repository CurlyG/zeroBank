package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FindTransactions {

    WebDriver driver;
    public FindTransactions(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(linkText="Find Transactions")
    public WebElement findTransactionsTab;

    @FindBy(id="aa_fromDate")
    public WebElement startDataBox;

    @FindBy(id="aa_toDate")
    public WebElement endDataBox;

    @FindBy(css=".btn.btn-primary")
    public WebElement findButton;

    @FindBy(xpath="//div[@id='filtered_transactions_for_account']//tr/td[1]")
    public List<WebElement> dateTable;







}
