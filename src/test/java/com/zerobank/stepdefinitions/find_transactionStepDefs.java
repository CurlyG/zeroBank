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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
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

        Assert.assertTrue((dateList.get(0) >= fromDate) && (dateList.get(dateList.size() - 1) <= toDate));

    }

    @Then("results should be sorted by most recent date")
    public void results_should_be_sorted_by_most_recent_date() {
        List<Integer> actualOrder = OtherUtils.convertListWEtoInteger(findTransactions.dateTable);
        List<Integer> expectedOrder = OtherUtils.sortListDescending(actualOrder);
        Assert.assertEquals(expectedOrder, actualOrder);

    }

    @Then("results table should only not contain transactions dated {string}")
    public void results_table_should_only_not_contain_transactions_dated(String date) {
        date="2012-09-01";
        int dateInt=Integer.parseInt(date.replace("-", ""));
       String startDate="2012-09-02";
       String endDate = "2012-09-06";
       findTransactions.startDataBox.clear();
       findTransactions.endDataBox.clear();
        findTransactions.startDataBox.sendKeys(startDate);
        findTransactions.endDataBox.sendKeys(endDate);
        findTransactions.findButton.click();

        BrowserUtils.waitFor(3);
        List<Integer> dateList= OtherUtils.convertListWEtoInteger(findTransactions.dateTable);
        boolean result=true;

        for (Integer eachDate:dateList ) {
            if(eachDate==dateInt){
                result=false;
            }
        }

        Assert.assertTrue(result);

    }

    @When("user enters description ONLINE")
    public void user_enters_description_ONLINE() {
        findTransactions.descreptionBox.clear();
        findTransactions.descreptionBox.sendKeys("ONLINE");
    }

    @Then("results table should only show description containing ONLINE")
    public void results_table_should_only_show_description_containing_ONLINE() {
        List<String> descriptionList=new ArrayList<>();
        boolean result=true;

        for (WebElement eachDescription: findTransactions.descriptionTable) {
            descriptionList.add(eachDescription.getText());
        }

        for (String eachDescriptionString: descriptionList) {
            if(eachDescriptionString.contains("ONLINE")){
                result=true;
            }else {
                result=false;
            }
        }

        Assert.assertTrue(result);

    }

    @When("user enters description OFFICE")
    public void user_enters_description_OFFICE() {
        findTransactions.descreptionBox.clear();
        findTransactions.descreptionBox.sendKeys("OFFICE");

    }

    @Then("results table should only show description containing OFFICE")
    public void results_table_should_only_show_description_containing_OFFICE() {
        List<String> descriptionList=new ArrayList<>();
        boolean result=true;

        for (WebElement eachDescription: findTransactions.descriptionTable) {
            descriptionList.add(eachDescription.getText());
        }

        for (String eachDescriptionString: descriptionList) {
            if(eachDescriptionString.contains("OFFICE")){
                result=true;
            }else {
                result=false;
            }
        }

        Assert.assertTrue(result);
    }

    @Then("results table should not show description containing ONLINE")
    public void results_table_should_not_show_description_containing_ONLINE() {
        List<String> descriptionList=new ArrayList<>();
        boolean result=true;

        for (WebElement eachDescription: findTransactions.descriptionTable) {
            descriptionList.add(eachDescription.getText());
        }

        for (String eachDescriptionString: descriptionList) {
            if(eachDescriptionString.contains("ONLINE")){
                result=false;
            }
        }

        Assert.assertTrue(result);
    }

    @When("user enters description online")
    public void user_enters_description_online() {
        findTransactions.descreptionBox.clear();
        findTransactions.descreptionBox.sendKeys("online");

    }

    @And("clicks search")
    public void clicks_search() {
        findTransactions.findButton.click();
        BrowserUtils.waitFor(2);
    }

    @Then("result table should show at least one result under Deposit")
    public void result_table_should_show_at_least_one_result_under_Deposit() {
       Assert.assertTrue(findTransactions.depositColumn.size()>0);
    }

    @Then("result table should show at least one result under Withdrawal")
    public void result_table_should_show_at_least_one_result_under_Withdrawal() {
        Assert.assertTrue(findTransactions.withdrawalColumn.size()>0);
    }

    @When("user selects type Deposit")
    public void user_selects_type_Deposit() {
        Select select=new Select(findTransactions.selectType);
        select.selectByValue("DEPOSIT");

    }

    @Then("results table should show no results under Withdrawal")
    public void results_table_should_show_no_results_under_Withdrawal() {
        BrowserUtils.waitFor(3);
        boolean result=true;


        for (WebElement eachWithdrawal:findTransactions.withdrawalColumn) {
            if(eachWithdrawal.getText().isEmpty()){
                result=true;
            }else{
                result=false;
            }
            Assert.assertTrue(result);
        }


    }

    @When("user selects type Withdrawal")
    public void user_selects_type_Withdrawal() {
        Select select=new Select(findTransactions.selectType);
        select.selectByValue("WITHDRAWAL");

    }

    @Then("results table should show no results under Deposit")
    public void results_table_should_show_no_results_under_Deposit() {
        boolean result=true;
        BrowserUtils.waitFor(3);
        for (WebElement eachDeposit:findTransactions.depositColumn) {
            if(eachDeposit.getText().isEmpty()){
                result=true;
            }else{
                result=false;
            }
            Assert.assertTrue(result);

        }


    }

}
