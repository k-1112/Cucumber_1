Feature: HRM Login Page

  Scenario: User navigates to the HRM login page
    Given the user opens the HRM application
    When the user enter the username
    And the user enter the password
    And the user click login.
    Then the user should be on the HRM login page