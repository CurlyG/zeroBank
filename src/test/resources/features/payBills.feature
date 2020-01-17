@payBills
  Feature: PayBills

    Background: User is in the login page and logged in
      Given the user is on the login page
      When user logs with valid credentials
      Then Account summary page should be displayed

      @step1
    Scenario:Account Activity page should have title "Zero-Pay Bills"
      When user navigates to Pay Bills page
      Then page title should be Zero-Pay Bills


        @step2
    Scenario: When user completes a successful Pay operation, The payment was successfully submitted
      When user navigates to Pay Bills page
      And add any amount to Amount box
      And choose date from Date box
      And add description in Description box
      And click Pay button
      Then The payment was successfully submitted should be displayed


          @step3
    Scenario: Error message should be displayed if user doesn't fill the options
        When user navigates to Pay Bills page
        And  click Pay button
        Then user verifies that error message Please fill out this field message! should be displayed

    Scenario: Amount field should not accept special characters
      When user navigates to Pay Bills page
      And user enters special characters in Amount box
     Then Amount field should not accept it

    Scenario: Amount field should not accept alphabetic characters
      When user navigates to Pay Bills page
      And user enters alphabetic characters in Amount box
      Then Amount field should not accept it






