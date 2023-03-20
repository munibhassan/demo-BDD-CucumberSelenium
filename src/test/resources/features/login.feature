Feature: Login Functionality
  In order to test login func
  As a registered or Authorized user
  I want to verify login condition

  Scenario: Login with valid credentials
    When User enter valid "<username>" in User Textbox
      """
      This is test description
      """
    And User enter valid "<password>" in password Textbox
    Then User should navigate to Dashboard Page
    But Then User Should not be in Login Page

  Example:
  |abcd@gmail.com|password|
  |email@gmail.com|passw0rd|
  |username|password|

    Examples:
    Given The Following Users Exist:
      | Name | Email          | Twitter |
      | John | john@gmail.com | @john   |
      | Tom  | tom@gmail.com  | @tom    |