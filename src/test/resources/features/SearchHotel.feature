Feature: Search hotel as guest

  Scenario: Search hotel is successful as guest
    Given PHP Travel homepage is displayed
#     When User click hotel menu
      When User enter city
      And User enter check in date
      And User enter check out date
      And User enter total guest
      And User click search
     Then Verify hotel list is displayed