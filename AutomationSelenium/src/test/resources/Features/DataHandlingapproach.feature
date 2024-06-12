Feature: NC Login
@Regression
  Scenario Outline: 
    Given open Chrome Browser
    Given open appilication login page
    When enter valid Email data
      |Email|
      | admin@yourstore.com |
    When enter valid Password data 
      |Password|
      | admin |
    When click on Login
    Then verify login is success or not
