Feature: Test End to End Cogmento Functionality

  Scenario: Validate Login Functionality
    Given user is on login page
    When user enter valid credentails
    Then user click on login button

  Scenario: validate home page Functionality
    Given user is on home page and  validate logo
    And user validate home page title
    And user validate home page logo

