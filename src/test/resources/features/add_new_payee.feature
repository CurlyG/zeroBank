
@add_new_payee
  Feature: Add new payee under pay bills

  Given the user is on the login page
  When user logs with valid credentials
  Then Account summary page should be displayed
  Given add new payee tab

    Scenario: Add a new payee
      When user creates new payee using following info
      |Payee Name   | The Law Office of Hyde, Price & Scharks|
      |Payee Address|100 Same st, Anytown, USA, 10001        |
      |Account      |Checking                                |
      |Payee details|XYZ account                             |
      Then message The new payee The Law Offices of Hyde, Price & Scharks was successfully created. should be displayed


