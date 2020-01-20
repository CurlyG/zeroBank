@activity @regression
Feature: Account Activity Page

  Background:
    Given the user is on the login page
    When user logs with valid credentials
    Then Account summary page should be displayed


    @step1 @wip
  Scenario:Account Activity page should have title "Zero-Account activity"
    When user navigates to Account Activity page
    Then page title should be Zero-Account activity

      @step2
    Scenario: Account dropdown default option should be Savings
      When user navigates to Account Activity page
      Then Account dropdown default option should be Savings

        @step3
      Scenario: Account dropdown options
        When user navigates to Account Activity page
        Then user verifies that dropdown options are displayed
        |Savings|
        |Checking|
        |Loan    |
        |Credit Card|
        |Brokerage  |

          @step4
        Scenario: Transaction column has the columns
          When user navigates to Account Activity page
          Then user verifies that columns are displayed in Transaction table
          |Date|
          |Description|
          |Deposit|
          |Withdrawal|




        
        


