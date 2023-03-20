Feature: OrangeHRM Login
  Scenario: Logo presence on OrangeHRM home page
    Given I Launch Chrome Browser
    When I Open orange hrm homepage
    Then I verify that the logo present on page
    And close browser