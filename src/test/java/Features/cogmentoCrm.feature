Feature: Test End to End Cogmento Functionality

  Scenario: Validate Login Functionality
    Given user is on login page
    When user enter valid credentails
    Then user click on login button

  Scenario: validate home page Functionality
    Given user is on home page and  validate logo
    And user validate home page title
    And user validate home page logo

  Scenario: validate the Contact Page Functionality
    When user click on contact link
    And user click on create button
    And user enter first name and last name
    And user click on save button

  Scenario: validate the Admin Deals Page Functionality
    When user is click on deals page
    And user click on crate button in deals Page
    And user enter title
    And user click on save button deals Page
