import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.*;
public class PageAccueilGoogleTest {

    @Test
    public void testIfSearchFieldExist() {

        ///AAA

        //Arrange
        WebDriver driver = new ChromeDriver();

        //Act
        //Naviguer vers une page
        driver.get("https://google.com");
        //Trouver le champ recherche
        WebElement searchBox = driver.findElement(By.name("q"));

        //Assert
        assertNotNull(searchBox);

        driver.close();
    }
}
