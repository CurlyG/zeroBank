package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityNavigationPage;
import com.zerobank.pages.AccountActivityPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class account_activity_navigationStepDefs {

    AccountActivityNavigationPage accountActivityNavigationPage=new AccountActivityNavigationPage();
    AccountActivityPage accountActivityPage=new AccountActivityPage();

    @When("user clicks on Savings link")
    public void user_clicks_on_Savings_link() {
        accountActivityNavigationPage.savingLink.click();
    }

    @Then("Account Activity page should be displayed")
    public void account_Activity_page_should_be_displayed() {
        String actualTitle =  Driver.get().getTitle();
        Assert.assertEquals(actualTitle, "Zero - Account Activity");
    }

    @Then("Account dropdown option should have Savings selected")
    public void account_dropdown_option_should_have_Savings_selected() {
        String expected="Savings";

        Select select=new Select(accountActivityPage.dropdown);
        String actual=select.getFirstSelectedOption().getText();

        Assert.assertEquals(actual, expected);
    }

    @When("user clicks on Brokerage link")
    public void user_clicks_on_Brokerage_link() {
        accountActivityNavigationPage.brokerageLink.click();
    }

    @Then("Account dropdown option should have Brokerage selected")
    public void account_dropdown_option_should_have_Brokerage_selected() {
        String expected="Brokerage";

        Select select=new Select(accountActivityPage.dropdown);
        String actual=select.getFirstSelectedOption().getText();

        Assert.assertEquals(actual, expected);
     }

    @When("user clicks on Checking link")
    public void user_clicks_on_Checking_link() {
        accountActivityNavigationPage.checkingLink.click();
    }

    @Then("Account dropdown option should have Checking selected")
    public void account_dropdown_option_should_have_Checking_selected() {
        String expected="Checking";

        Select select=new Select(accountActivityPage.dropdown);
        String actual=select.getFirstSelectedOption().getText();

        Assert.assertEquals(actual, expected);
    }

    @When("user clicks on Credit card link")
    public void user_clicks_on_Credit_card_link() {
        accountActivityNavigationPage.creditCardLink.click();
    }

    @Then("Account dropdown option should have Credit Card selected")
    public void account_dropdown_option_should_have_Credit_Card_selected() {
        String expected="Credit Card";

        Select select=new Select(accountActivityPage.dropdown);
        String actual=select.getFirstSelectedOption().getText();

        Assert.assertEquals(actual, expected);
    }

    @When("user clicks on Loan link")
    public void user_clicks_on_Loan_link() {
        accountActivityNavigationPage.loanLink.click();
    }

    @Then("Account dropdown option should have Loan selected")
    public void account_dropdown_option_should_have_Loan_selected() {
        String expected="Loan";

        Select select=new Select(accountActivityPage.dropdown);
        String actual=select.getFirstSelectedOption().getText();

        Assert.assertEquals(actual, expected);
    }

}
