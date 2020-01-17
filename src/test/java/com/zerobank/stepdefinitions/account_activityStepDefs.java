package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class account_activityStepDefs {
    AccountActivityPage accountActivityPage=new AccountActivityPage();

    @When("user navigates to Account Activity page")
    public void user_navigates_to_Account_Activity_page() {
        accountActivityPage.accountActivityModule.click();
        BrowserUtils.waitFor(2);
    }

    @Then("page title should be Zero-Account activity")
    public void page_title_should_be_Zero_Account_activity() {
      String actualTitle =  Driver.get().getTitle();
        Assert.assertEquals(actualTitle, "Zero - Account Activity");
    }

    @Then("Account dropdown default option should be Savings")
    public void account_dropdown_default_option_should_be_Savings() {
        String expected="Savings";

        Select select=new Select(accountActivityPage.dropdown);
        String actual=select.getFirstSelectedOption().getText();
        
        Assert.assertEquals(actual, expected);
    }

    @Then("user verifies that dropdown options are displayed")
    public void user_verifies_that_dropdown_options_are_displayed(List<String> dropdownOptions) {
       dropdownOptions=new ArrayList<>();


        Select select=new Select(accountActivityPage.dropdown);

        List<WebElement> dropDownElements=select.getOptions();

        for (WebElement dropDownOption:dropDownElements) {
          dropdownOptions.add(dropDownOption.getText());
        }

        System.out.println(dropdownOptions);
        Assert.assertEquals(dropdownOptions.toString(), "[Savings, Checking, Savings, Loan, Credit Card, Brokerage]");
    }

    @Then("user verifies that columns are displayed in Transaction table")
    public void user_verifies_that_columns_are_displayed_in_Transaction_table(List<String> accountActivityTableNames) {
        accountActivityTableNames=new ArrayList<>();

        for (WebElement accountActivityTableValue :  accountActivityPage.accountActivityTable) {
            accountActivityTableNames.add(accountActivityTableValue.getText());
        }

        Assert.assertEquals(accountActivityTableNames.toString(), "[Date, Description, Deposit, Withdrawal]");


    }









}
