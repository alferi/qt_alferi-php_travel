#@Ignore
Feature: New Customer Registration

  Scenario: Create new customer registration
    Given PHP Travel homepage is displayed
     When User click sign up menu
      And User enter correct data
      And User click submit
     Then Verify my account page is displayed


