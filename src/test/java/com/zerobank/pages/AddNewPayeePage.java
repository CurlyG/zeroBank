package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewPayeePage extends BasePage{
    public AddNewPayeePage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(linkText = "Add New Payee")
    public WebElement addNewPayeeTab;

    @FindBy(id = "np_new_payee_name")
    public WebElement payeeNameBox;

    @FindBy(id = "np_new_payee_address")
    public WebElement payeeAddressBox;

    @FindBy(id = "np_new_payee_account")
    public WebElement accountBox;

    @FindBy(id = "np_new_payee_details")
    public WebElement payeeDetailes;

    @FindBy(id = "add_new_payee")
    public WebElement addButton;

    @FindBy(id = "alert_content")
    public WebElement alertMessage;



}
