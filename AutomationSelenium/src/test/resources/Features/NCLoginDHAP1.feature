Feature: NC Login

@Smoke
  Scenario: Validate the NC login with data
    Given open chrome browser 
    Given open NC login page with valid url
    When enter valid email data "admin@yourstore.com" into email field
    When enter valid password data "admin" into password field
    When click on login button to do login
    Then verify login success or not
