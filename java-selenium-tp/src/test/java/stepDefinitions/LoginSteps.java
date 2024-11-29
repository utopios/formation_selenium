package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import web_saucedemo.pages.LoginPage;
import web_saucedemo.tests.testng.testcases.BaseTest;

import static org.junit.jupiter.api.Assertions.*;

public class LoginSteps extends BaseTest {
    private LoginPage loginPage;
    private String username;
    private String password;
    @Given("I am on the login page with valid credentials {string} and {string}")
    public void iOnLoginPage(String username, String password) {
        loginPage = new LoginPage(driver);
        this.username = username;
        this.password = password;

    }
    @When("I submit the login form")
    public void submitLogin() {
        loginPage.login(username, password);
    }
    @Then("I will be redirected to page {string}")
    public void getUrl(String url) {
        assertEquals(driver.getCurrentUrl(), url);
    }
}
