package web_saucedemo.tests.testng.testcases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import web_saucedemo.contexts.CheckoutYourInfoData;
import web_saucedemo.pages.*;

import static org.junit.jupiter.api.Assertions.*;

public class TC001_AddToCart_Checkout extends BaseTest {

    

    @Test
    public void TC001_AddToCart_Checkout() {

        //Créer la page => Arrange
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        ProductsPage productsPage = new ProductsPage(driver);
        HeaderPage headerPage = new HeaderPage(driver);
        //ACT
        productsPage.sort("Price (low to high)");
        WebElement firstElement = productsPage.getProduct("Sauce Labs Onesie");
        productsPage.add("Sauce Labs Onesie");
        int totalProductInCart = headerPage.getCartCount();
        //Assert
        assertNotNull(firstElement);
        assertEquals(1, totalProductInCart);
    }
}
