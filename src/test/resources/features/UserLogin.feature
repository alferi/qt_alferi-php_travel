Feature: Existing User Login

  Scenario: Existing user sucessful login
    Given PHP Travel homepage open
     When User click login menu 
      And User enter correct login data
      And User click login
     Then Verify my login page open