Feature: Test login functionality

  Scenario Outline: Check login is successful with valid credential
    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And user click on login
    Then user is navigated to home page

    Examples: 
      | username | password |
      | PJ       |    12345 |
      | DJ       |    12345 |
      | HJ       |    12345 |
