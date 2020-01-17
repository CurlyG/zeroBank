@activity_navigation
  Feature: Navigating to specific accounts in Accounts Activity

    Background:
      Given the user is on the login page
      When user logs with valid credentials
      Then Account summary page should be displayed

    Scenario: Savings account redirect
      When user navigates to Account summary page
      And user clicks on Savings link
      Then Account Activity page should be displayed
      And Account dropdown option should have Savings selected

    Scenario: Savings account redirect
      When user navigates to Account summary page
      And user clicks on Brokerage link
      Then Account Activity page should be displayed
      And Account dropdown option should have Brokerage selected

    Scenario: Savings account redirect
      When user navigates to Account summary page
      And user clicks on Checking link
      Then Account Activity page should be displayed
      And Account dropdown option should have Checking selected

    Scenario: Savings account redirect
      When user navigates to Account summary page
      And user clicks on Credit card link
      Then Account Activity page should be displayed
      And Account dropdown option should have Credit Card selected

    Scenario: Savings account redirect
      When user navigates to Account summary page
      And user clicks on Loan link
      Then Account Activity page should be displayed
      And Account dropdown option should have Loan selected




