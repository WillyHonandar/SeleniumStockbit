Feature: Test login functionality

  Scenario: Check login successful
    Given browser for login is open
    When user is on home page for login
    Then user click tab Login
    When user enters login data
    Then user click button Login
