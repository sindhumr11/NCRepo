Feature: NC Login

  Background: 
    Given open Chrome Browser in new window
    Given open NC login page in open window

  Scenario:1 Validate the NC login page functionality
    When enter "admin@yourstore.com" into email field
    And enter "admin" into password field
    But click on Login button for login purpose
    Then verify Login is success

  