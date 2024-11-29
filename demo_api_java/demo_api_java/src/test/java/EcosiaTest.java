import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class EcosiaTest {

    //Avec JUNIT
    @Test
    public void testRechercheEcosia() throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        webDriver.get("https://www.ecosia.org/?c=fr");

        //Trouver le champ de recherche
        WebElement champRecherche = webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/header/div/form/div/div/div[1]/input"));
        champRecherche.sendKeys("Selenium WebDriver");
        champRecherche.submit();

        //Récupérer le resultat
        WebElement resultatRecherche = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"main\"]/div/section/div[1]/div[3]/div[2]")));
        assertNotNull(resultatRecherche);

        String contenu = resultatRecherche.getText();
        assertTrue(contenu.toLowerCase().contains("selenium"));

        webDriver.close();
    }
}

