Feature: NC Product Search

  Scenario: Verify and validate the NC product search functionality
    Given launch chrome browser
    Given open NC login page
    Then verify NC login page got loaded
    When do login of the NC
    Then verify login success
    When click on catalog
    When click on products
    When enter valid product name
    When click on serach button
    When Click on logout link
    Then verfify logout success
    When terminate the browser
