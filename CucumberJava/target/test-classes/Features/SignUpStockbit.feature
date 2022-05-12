Feature: Test sign up functionality

  Scenario: Check sign up successful
    Given browser for sign up is open 
    When user is on home page for sign up
    Then user click button Mulai Berinvestasi 
    And user click button Register with Email
    When user enters data
    Then user click button Register
    When user enters phone number
    Then user click button Send Verification Code	
