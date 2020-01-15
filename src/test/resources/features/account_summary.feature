
Feature: Account summary page

  Background: User is in the login page and logged in
    Given the user is on the login page
    Then user is logged in


  Scenario:Page should have title "Zero-Account summary"
    When user goes to "Account summary" page
    Then page title should be "Zero-Account summary"

    Scenario: Account summary page should have "Cash Accounts" type
      When user goes to "Account summary" page
      Then user should see "Cash Accounts" type

  Scenario: Account summary page should have "Investment Accounts" type
    When user goes to "Account summary" page
    Then user should see "Investment Accounts" type

  Scenario: Account summary page should have "Credit Accounts" type
    When user goes to "Account summary" page
    Then user should see "Credit Accounts" type

  Scenario: Account summary page should have "Loan Accounts" type
    When user goes to "Account summary" page
    Then user should see "Loan Accounts" type

  Scenario: Credit account table should have "Account" column
    When user goes to "Account summary" page
    Then user should see "Account" column in "Credit Accounts" table

  Scenario: Credit account table should have "Credit Card" column
    When user goes to "Account summary" page
    Then user should see "Credit Card" column in "Credit Accounts" table

  Scenario: Credit account table should have "Balance" column
    When user goes to "Account summary" page
    Then user should see "Balance" column in "Credit Accounts" table







