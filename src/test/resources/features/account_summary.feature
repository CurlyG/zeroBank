@summary
Feature: Account summary page

  Background: User is in the login page and logged in
    Given the user is on the login page
    Then user is logged in


  Scenario:Account summary page should have title "Zero-Account summary"
    When user navigates to Account summary page
    Then page title should be Zero-Account summary

    Scenario: Account summary page should have all account types
      When user navigates to Account summary page
      Then user verifies that account types are displayed
      |Cash Accounts      |
      |Investment Accounts|
      |Credit Accounts    |
      |Loan Accounts      |


  Scenario: Credit account table should have all columns
    When user navigates to Account summary page
    Then user verifies that columns are displayed in Credit Accounts table
    |Account|
    |Credit Card|
    |Balance    |









