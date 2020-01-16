@activity
Feature: Account Activity Page

  Background:
    Given the user is on the login page
    Then user is logged in


  Scenario:Account Activity page should have title "Zero-Account activity"
    When user navigates to "Account Activity" page
    Then page title should be "Zero-Account activity"

    Scenario: Account dropdown default option should be "Savings"
      When user navigates to "Account Activity" page
      Then "Account" dropdown default option should be "Savings"
      
      Scenario: Account dropdown options
        When user navigates to "Account Activity" page
        Then user verifies that dropdown options are displayed
        |Savings|
        |Checking|
        |Loan    |
        |Credit Card|
        |Brokerage  |
        
        Scenario: Transaction column has the columns
          When user navigates to "Account Activity" page
          Then user verifies that columns are displayed in Transaction table
          |Date|
          |Description|
          |Deposit|
          |Withdrawal|




        
        


