package com.zerobank.stepdefinitions;

import com.zerobank.pages.PayBillsPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class payBillsStepDefs {
    PayBillsPage payBillsPage=new PayBillsPage();

    @When("user navigates to Pay Bills page")
    public void user_navigates_to_Pay_Bills_page() {

        payBillsPage.PayBillsModule.click();
        BrowserUtils.waitFor(3);
    }

    @Then("page title should be Zero-Pay Bills")
    public void page_title_should_be_Zero_Pay_Bills() {
        String actualTitle =  Driver.get().getTitle();
        Assert.assertEquals(actualTitle, "Zero - Pay Bills");
    }

    @When("add any amount to Amount box")
    public void add_any_amount_to_Amount_box() {
        payBillsPage.amountBox.sendKeys("123");
    }

    @When("choose date from Date box")
    public void choose_date_from_Date_box() {
        payBillsPage.dateBox.sendKeys("2020-01-02");
    }

    @When("add description in Description box")
    public void add_description_in_Description_box() { payBillsPage.descriptionBox.sendKeys("Selenium is fun");}

    @When("click Pay button")
    public void click_Pay_button() { payBillsPage.payButton.click();}

    @Then("The payment was successfully submitted should be displayed")
    public void the_payment_was_successfully_submitted_should_be_displayed() {
        String actual=payBillsPage.alertSuccessful.getText();
        String expected="The payment was successfully submitted.";
        Assert.assertEquals(actual, expected);
    }

    @When("user enters special characters in Amount box")
    public void user_enters_special_characters_in_Amount_box() { payBillsPage.amountBox.sendKeys("!@#"); }


    @When("user enters alphabetic characters in Amount box")
    public void user_enters_alphabetic_characters_in_Amount_box() {payBillsPage.amountBox.sendKeys("123");}

    @Then("Amount field should not accept it")
    public void amount_field_should_not_accept_it() {
       Assert.assertFalse(payBillsPage.alertSuccessful.isDisplayed());

    }


    @Then("user verifies that error message Please fill out this field message! should be displayed")
    public void user_verifies_that_error_message_Please_fill_out_this_field_message_should_be_displayed() {
    String actualMessage= payBillsPage.amountBox.getAttribute("validationMessage");
        String expectedMessage="Please fill out this field.";
        Assert.assertEquals(expectedMessage, actualMessage);
    }

}
