package web_saucedemo.tests.testng.testcases;

import org.testng.annotations.Test;
import web_saucedemo.pages.LoginPage;

import static org.junit.jupiter.api.Assertions.*;

public class TC005_Login extends BaseTest{

    @Test
    public void testLogin() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("standard_user", "secret_sauce");

        assertEquals("https://www.saucedemo.com/inventory.html", driver.getCurrentUrl());
    }
}
