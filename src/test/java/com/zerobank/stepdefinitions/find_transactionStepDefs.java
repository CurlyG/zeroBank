package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.FindTransactions;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.OtherUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Collections;
import java.util.List;

public class find_transactionStepDefs {
    AccountActivityPage accountActivityPage=new AccountActivityPage();
    FindTransactions findTransactions=new FindTransactions();

    @Given("user accesses the Find Transaction tab")
    public void user_accesses_the_Find_Transaction_tab() {
        accountActivityPage.accountActivityModule.click();
        BrowserUtils.waitFor(2);
        findTransactions.findTransactionsTab.click();
    }

    @When("user enters date range from {string} to {string}")
    public void user_enters_date_range_from_to(String startDate, String endDate) {
        startDate="2012-09-01";
        endDate = "2012-09-06";
        findTransactions.startDataBox.sendKeys(startDate);
        findTransactions.endDataBox.sendKeys(endDate);
    }



    @Then("results table should only show transactions between {string} to {string}")
    public void results_table_should_only_show_transactions_between_to(String startDate, String endDate) {
        int fromDate = Integer.parseInt(startDate.replace("-", ""));
        int toDate = Integer.parseInt(endDate.replace("-", ""));
        List<Integer> dateList= OtherUtils.convertListWEtoInteger(findTransactions.dateTable);
        Collections.sort(dateList);
        Assert.assertTrue(dateList.get(0) >= fromDate && dateList.get(dateList.size() - 1) <= toDate);

    }

    @Then("results should be sorted by most recent date")
    public void results_should_be_sorted_by_most_recent_date() {
        List<Integer> actualOrder = OtherUtils.convertListWEtoInteger(findTransactions.dateTable);
        List<Integer> expectedOrder = OtherUtils.sortListDescending(actualOrder);
        Assert.assertEquals(expectedOrder, actualOrder);

    }

    @Then("results table should only not contain transactions dated {string}")
    public void results_table_should_only_not_contain_transactions_dated(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("user enters description ONLINE")
    public void user_enters_description_ONLINE() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("results table should only show description containing ONLINE")
    public void results_table_should_only_show_description_containing_ONLINE() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("user enters description OFFICE")
    public void user_enters_description_OFFICE() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("results table should only show description containing OFFICE")
    public void results_table_should_only_show_description_containing_OFFICE() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("results table should not show description containing ONLINE")
    public void results_table_should_not_show_description_containing_ONLINE() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("user enters description online")
    public void user_enters_description_online() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @And("clicks search")
    public void clicks_search() {
        findTransactions.findButton.click();
    }

    @Then("result table should show at least one result under Deposit")
    public void result_table_should_show_at_least_one_result_under_Deposit() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("result table should show at least one result under Withdrawal")
    public void result_table_should_show_at_least_one_result_under_Withdrawal() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("user selects type Deposit")
    public void user_selects_type_Deposit() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("results table should show no results under Withdrawal")
    public void results_table_should_show_no_results_under_Withdrawal() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("user selects type Withdrawal")
    public void user_selects_type_Withdrawal() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("results table should show no results under Deposit")
    public void results_table_should_show_no_results_under_Deposit() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

}
