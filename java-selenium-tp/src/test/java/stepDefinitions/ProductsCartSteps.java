package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import web_saucedemo.pages.HeaderPage;
import web_saucedemo.pages.LoginPage;
import web_saucedemo.pages.ProductsPage;
import web_saucedemo.tests.testng.testcases.BaseTest;

import static org.junit.jupiter.api.Assertions.*;

public class ProductsCartSteps extends BaseTest {
    //private LoginPage loginPage;
    private ProductsPage productPage;
    private HeaderPage headerPage;

    @When("I select low to high price and add to cart")
    public void selectLowToHighPrice() {
        productPage = new ProductsPage(driver);
        productPage.sort("Price (low to high)");
        productPage.add("Sauce Labs Onesie");
    }

    @Then("I will be sure that there is one element into cart")
    public void verifyElementInCart() {
        int nbElementInCart;
        headerPage = new HeaderPage(driver);
        nbElementInCart = headerPage.getCartCount();
        assertEquals(1, nbElementInCart);
        tearDown();
    }
}
