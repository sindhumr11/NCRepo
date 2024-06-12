Feature: NC Login
@Regression
  Scenario Outline: 
    Given open chrome browser in window
    Given open NC login page with valid URL
    When enter  "<Email>" data into email field
    When enter "<Password>" data into password field
    When click on login button
    Then verify application is successfully login or not

    Examples: 
      | Email               | Password |
      | admin@yourstore.com | admin    |
      | test@yourstore.com  | test     |
