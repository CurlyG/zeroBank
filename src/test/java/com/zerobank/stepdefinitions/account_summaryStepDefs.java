package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class account_summaryStepDefs {
    AccountSummaryPage accountSummaryPage=new AccountSummaryPage();



    @Then("user is logged in")
    public void user_is_logged_in() {

    }


    @When("user navigates to Account summary page")
    public void user_navigates_to_Account_summary_page() {
        accountSummaryPage.accountSummary.click();
    }

    @Then("page title should be Zero-Account summary")
    public void page_title_should_be_Zero_Account_summary() {
        String actualTitle=Driver.get().getTitle();
        Assert.assertEquals(actualTitle, "Zero - Account summary");
    }

    @Then("user verifies that account types are displayed")
    public void user_verifies_that_account_types_are_displayed(List<String> accountTypes) {

    }


    @Then("user verifies that columns are displayed in Credit Accounts table")
    public void user_verifies_that_columns_are_displayed_in_Credit_Accounts_table(io.cucumber.datatable.DataTable dataTable) {

    }


}
