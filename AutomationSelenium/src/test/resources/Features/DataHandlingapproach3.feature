Feature: NC Login
@Regression
  Scenario Outline: 
    Given open ChromeBrowser
    Given open login page
    When enter  Email data in email field
      | admin@yourstore.com |
    When enter Password data in password field
      | admin |
    When click on LoginButton
    Then verify application login is success or not
