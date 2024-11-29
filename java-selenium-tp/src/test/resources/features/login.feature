Feature: User Login
  Scenario: Successful login with valid credentials
    Given I am on the login page with valid credentials standard_user and secret_sauce
    When I submit the login form
    Then I will be redirected to page https://www.saucedemo.com/inventory.html