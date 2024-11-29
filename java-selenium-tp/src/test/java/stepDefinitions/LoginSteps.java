package stepDefinitions;

import io.cucumber.java.en.Given;
import web_saucedemo.pages.LoginPage;
import web_saucedemo.tests.testng.testcases.BaseTest;

public class LoginSteps extends BaseTest {

    @Given("I am on the login page with valid credentials {string} and {string}")
    public void iOnLoginPage(String username, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(username, password);
    }
}
