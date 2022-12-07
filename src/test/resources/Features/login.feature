Feature: feature to test login page

  Scenario: check login is successful
    Given user in login page
    When user enters username and password
    And clicks on login button
    Then user navigated into home page

   