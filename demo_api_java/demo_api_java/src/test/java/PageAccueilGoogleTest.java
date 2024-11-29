import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.jupiter.api.Assertions.*;
public class PageAccueilGoogleTest {

    @Test
    public void testIfSearchFieldExist() {

        ///AAA

        //Arrange
        WebDriver driver = new FirefoxDriver();

        //Act
        //Naviguer vers une page
        driver.get("https://google.com");
        //Trouver le champ recherche
        WebElement searchBox = driver.findElement(By.name("q"));
        WebElement acceptButton = driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div"));
        assertNotNull(acceptButton);
        acceptButton.click();
        //Assert
        assertNotNull(searchBox);

        driver.close();
    }
}
