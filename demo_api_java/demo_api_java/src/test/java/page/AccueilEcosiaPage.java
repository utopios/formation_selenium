package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccueilEcosiaPage {

    private WebDriver webDriver;
    private WebDriverWait webDriverWait;
    By byChampRecherche = By.xpath("//*[@id=\"app\"]/div/div[1]/header/div/form/div/div/div[1]/input");
    By byResultatRecherche = By.xpath("//*[@id=\\\"main\\\"]/div/section/div[1]/div[3]/div[2]\"");

    public AccueilEcosiaPage(WebDriver webDriver, WebDriverWait webDriverWait) {
        this.webDriver = webDriver;
        this.webDriverWait = webDriverWait;
    }

    public void open() {
        webDriver.get("https://www.ecosia.org/?c=fr");
    }

    public void close() {
        webDriver.close();
    }

    public WebElement recuperChampRecherche() {
        //Je vais chercher le champ de recherche
        return webDriver.findElement(byChampRecherche);
    }

    public WebElement recuperResultatRecherche() {
        //Je vais chercher le champ de recherche
        return webDriverWait.until(ExpectedConditions.presenceOfElementLocated(byResultatRecherche));
    }
}
