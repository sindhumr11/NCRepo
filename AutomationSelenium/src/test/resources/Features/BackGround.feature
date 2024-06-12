Feature: NC Login

  Background: 
    Given open Chrome Browser in new window
    Given open NC login page in open window
@Smoke
  Scenario:1 Validate the NC login page functionality
    When enter valid email into email field
    When enter valid password into password field
    When click on Login of the NC
    Then verify login is success
@Regression
  Scenario:2 
    When enter Email data 
      | Email               |
      | admin@yourstore.com |
    When enter Password data
      | Password |
      | admin    |
    When click on Loginbutton
    Then verify login is successful 
