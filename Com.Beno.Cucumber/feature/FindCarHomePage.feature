Feature: Test Beno Website Smoke Scenario

  Scenario: To check Find Car functionality of Beno Application
    Given User Select pickUp location from Search option
    And User Select DropOff Location from Search option
    When User select PickUp Date and Time
    And User Select DropOff Date and Time
    Then User click on Find Car Button and Navigate to Listing page

  Scenario Outline: To check PickUp Time funtionality
    When User Click on "<PickUpTime>"and "<DropOffTime>" Text field
    Then User able to Select PickUp time

    Examples: 
      | PickUpTime | DropOffTime |
      | 17:30      | 16:30       |
      | 00:30      | 01:30       |

  