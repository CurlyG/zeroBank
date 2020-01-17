package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FindTransactions extends BasePage{

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

    @FindBy(id="aa_description")
    public WebElement descreptionBox;

    @FindBy(xpath="//div[@id='filtered_transactions_for_account']//tr/td[2]")
    public List<WebElement> descriptionTable;

    @FindBy(xpath="//div[@id='filtered_transactions_for_account']//tr/td[3]")
    public List<WebElement> depositColumn;

    @FindBy(xpath="//div[@id='filtered_transactions_for_account']//tr/td[4]")
    public List<WebElement> withdrawalColumn;

    @FindBy(id="aa_type")
    public WebElement selectType;













}
