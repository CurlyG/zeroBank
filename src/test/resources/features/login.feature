@login
Feature: User should be able to login

  Background:
    Given the user is on the login page




  @step1
  Scenario: only authorized users should be able to login
    When user logs with valid credentials
    Then Account summary page should be displayed




  @step2
  Scenario:
    When user logs with invalid credentials
    Then Error message "Login and/or password are wrong" should be displayed





