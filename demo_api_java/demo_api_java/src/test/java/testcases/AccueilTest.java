package testcases;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.AccueilEcosiaPage;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class AccueilTest {

    private AccueilEcosiaPage accueilEcosiaPage;
    private WebDriver webDriver;
    private WebDriverWait webDriverWait;

    @BeforeEach
    public void setUp() {
        webDriver = new FirefoxDriver();
        webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        accueilEcosiaPage = new AccueilEcosiaPage(webDriver, webDriverWait);
    }

    @Test
    public void testRechercheEcosia() {
        accueilEcosiaPage.open();
        WebElement recherche = accueilEcosiaPage.recuperChampRecherche();
        recherche.sendKeys("Selenium");

        WebElement result = accueilEcosiaPage.recuperResultatRecherche();
        assertNotNull(result);
        assertTrue(result.getText().toLowerCase().contains("selenium"));
        accueilEcosiaPage.close();
    }
}
