package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{
    WebDriver driver;
    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(name="user_login")
    public WebElement userName;

    @FindBy(id="user_password")
    public WebElement password;

    @FindBy(name="submit")
    public WebElement submit;

    @FindBy(xpath = "//*[@id='login_form']/div[1]")
    public WebElement errorMessage;

    @FindBy(id="signin_button")
    public WebElement signIn;

    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
    }





}
