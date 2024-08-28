Feature: Test End to End Cogmento Functionality

  Scenario: Validate Login Functionality
    Given user is on login page
    When user enter valid credentails
    Then user click on login button
