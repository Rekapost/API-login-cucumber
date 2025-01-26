Feature: login
Scenario: login
    Given user is on login page
    When user enters valid username and password
    Then user is navigated to home page
