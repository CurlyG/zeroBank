package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class loginStepDefs {
    LoginPage loginPage=new LoginPage();

    //Opening the login page
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() throws InterruptedException {
        String url= ConfigurationReader.get("url");
        Driver.get().get(url);
        BrowserUtils.waitForClickablility(By.id("signin_button"), 5);
       loginPage.signIn.click();
        BrowserUtils.waitFor(5);

        String actualTitle=Driver.get().getTitle();
        Assert.assertEquals(actualTitle,"Zero - Log in");
    }


    @When("user logs with valid credentials")
    public void user_logs_with_valid_credentials() throws InterruptedException {

        String username=ConfigurationReader.get("username");
        String password=ConfigurationReader.get("password");


        BrowserUtils.waitForPresenceOfElement(By.id("user_login"), 5);
        loginPage.login(username, password);
    }

    @Then("Account summary page should be displayed")
    public void account_summary_page_should_be_displayed() {
        String actualTitle=Driver.get().getTitle();
        Assert.assertEquals(actualTitle, "Zero - Account Summary");

        //loginPage.usernameQuit.click();
        //loginPage.logout.click();
    }

    @When("user logs with invalid credentials")
    public void user_logs_with_invalid_credentials() {
        String invalidUsername=ConfigurationReader.get("invalidUsername");
        String invalidPassword=ConfigurationReader.get("invalidPassword");

        loginPage.login(invalidUsername, invalidPassword);
    }

    @Then("Error message {string} should be displayed")
    public void error_message_should_be_displayed(String errorMessage) {
        errorMessage="Login and/or password are wrong.";

        String actualErrorMessage = loginPage.errorMessage.getText();
        System.out.println(actualErrorMessage);

        Assert.assertEquals(errorMessage, actualErrorMessage);

    }

}
