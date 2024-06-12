Feature: NC Login
@Smoke
  Scenario: Validate the NC login page functionality
    Given launch chrome browser
    Given open NC login page
    When enter valid email data into email field
    When enter valid password data into password field
    When click on login of the NC
    Then verify login success
