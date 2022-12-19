Feature: Testing HRM Application

  Scenario: Login to application
    When user open browser
    Given when user enter username
    And when user enter password
    Then user should be able to login

  Scenario: verify all links
    When user is on home page
    Then user should be able to see all social links
