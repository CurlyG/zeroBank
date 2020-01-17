package com.zerobank.stepdefinitions;

import com.zerobank.pages.AddNewPayeePage;
import com.zerobank.pages.PayBillsPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class add_new_payeeStepDefs {
    PayBillsPage payBillsPage=new PayBillsPage();
    AddNewPayeePage addNewPayeePage=new AddNewPayeePage();


    @Given("user click add new payee tab")
    public void user_click_add_new_payee_tab() {
  payBillsPage.PayBillsModule.click();
  addNewPayeePage.addNewPayeeTab.click();
    }

    @When("user creates new payee using following info")
    public void user_creates_new_payee_using_following_info(Map<String, String> payeeInfo) {

        BrowserUtils.waitFor(1);
        addNewPayeePage.payeeNameBox.sendKeys(payeeInfo.get("Payee Name"));
        addNewPayeePage.payeeAddressBox.sendKeys(payeeInfo.get("Payee Address"));
        addNewPayeePage.accountBox.sendKeys(payeeInfo.get("Account"));
        addNewPayeePage.payeeDetailes.sendKeys(payeeInfo.get("Payee details"));
        addNewPayeePage.addButton.click();

    }

    @Then("message The new payee The Law Offices of Hyde, Price & Scharks was successfully created. should be displayed")
    public void message_The_new_payee_The_Law_Offices_of_Hyde_Price_Scharks_was_successfully_created_should_be_displayed() {
        String actual = addNewPayeePage.alertMessage.getText();
        String expected="The new payee The Law Office of Hyde, Price & Scharks was successfully created.";
        Assert.assertEquals(actual, expected);

    }

}
