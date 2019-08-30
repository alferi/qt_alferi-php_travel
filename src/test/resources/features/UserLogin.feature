#@Ignore
Feature: Existing User Login

  Scenario: Existing user sucessful login
    Given PHP Travel homepage is displayed
     When User click login menu 
      And User enter correct login data
      And User click login
     Then Verify my login page is displayed