Feature: add to cart
  Scenario : add to cart
    Given I am on the login page with valid credentials "standard_user" and "secret_sauce"
    When I submit the login form
    And I select low to high price and add to cart
    Then I will be sure that there is one element into cart
