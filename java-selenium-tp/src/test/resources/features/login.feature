Feature: User Login
  Scenario Outline: Successful login with valid credentials
    Given I am on the login page with valid credentials <login> and <password>
    When I submit the login form
    Then I will be redirected to page "https://www.saucedemo.com/inventory.html"

    Examples:
      | login | password |
      | "standard_user" | "secret_sauce" |
      | "standard_user" | "secret_sauce" |
      | "standard_user" | "secret_sauce" |