// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class TPTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void testConnexion() {
    // Test name: Test_Connexion
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("https://www.saucedemo.com/");
    // 2 | setWindowSize | 1920x1055 | 
    driver.manage().window().setSize(new Dimension(1920, 1055));
    // 3 | click | css=form | 
    driver.findElement(By.cssSelector("form")).click();
    // 4 | click | css=*[data-test="username"] | 
    driver.findElement(By.cssSelector("*[data-test=\"username\"]")).click();
    // 5 | type | css=*[data-test="username"] | standard_user
    driver.findElement(By.cssSelector("*[data-test=\"username\"]")).sendKeys("standard_user");
    // 6 | type | css=*[data-test="password"] | secret_sauce
    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).sendKeys("secret_sauce");
    // 7 | click | css=*[data-test="login-button"] | 
    driver.findElement(By.cssSelector("*[data-test=\"login-button\"]")).click();
    // 9 | executeScript | javascript: return window.location.href | currentLocation
    vars.put("currentLocation", js.executeScript("javascript: return window.location.href"));
    // 10 | assert | currentLocation | https://www.saucedemo.com/inventory.html
    assertEquals(vars.get("currentLocation").toString(), "https://www.saucedemo.com/inventory.html");
    // 11 | close |  | 
    driver.close();
  }
  @Test
  public void testFilteretajoutpanier() {
    // Test name: Test_Filter_et_ajout_panier
    // Step # | name | target | value
    // 1 | open | /inventory.html | 
    driver.get("https://www.saucedemo.com/inventory.html");
    // 3 | select | css=*[data-test="product-sort-container"] | value=lohi
    {
      WebElement dropdown = driver.findElement(By.cssSelector("*[data-test=\"product-sort-container\"]"));
      dropdown.findElement(By.cssSelector("*[value='lohi']")).click();
    }
    // 4 | click | css=.inventory_item:nth-child(5) > .inventory_item_description | 
    driver.findElement(By.cssSelector(".inventory_item:nth-child(5) > .inventory_item_description")).click();
    // 5 | click | css=*[data-test="inventory-item-desc"] | 
    driver.findElement(By.cssSelector("*[data-test=\"inventory-item-desc\"]")).click();
    // 6 | click | css=*[data-test="inventory-item-name"] | 
    driver.findElement(By.cssSelector("*[data-test=\"inventory-item-name\"]")).click();
    // 7 | executeScript | javascript: return !!document.querySelector('button[data-test="add-to-cart"]') | elementExist
    vars.put("elementExist", js.executeScript("javascript: return !!document.querySelector(\'button[data-test=\"add-to-cart\"]\')"));
    // 8 | echo | ${elementExist} | 
    System.out.println(vars.get("elementExist").toString());
    // 9 | if | ${elementExist} | 
    if ((Boolean) js.executeScript("return (arguments[0])", vars.get("elementExist"))) {
      // 10 | click | css=*[data-test="add-to-cart"] | 
      driver.findElement(By.cssSelector("*[data-test=\"add-to-cart\"]")).click();
      // 11 | else |  | 
    } else {
      // 12 | echo | ${elementExist} | 
      // Produit déjà dans le panier
      System.out.println(vars.get("elementExist").toString());
      // 13 | end |  | 
    }
    // 14 | waitForElementPresent | css=*[data-test="shopping-cart-badge"] | 1000
    {
      WebDriverWait wait = new WebDriverWait(driver, 1);
      wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("*[data-test=\"shopping-cart-badge\"]")));
    }
    // 15 | assertText | css=*[data-test="shopping-cart-badge"] | 1
    assertThat(driver.findElement(By.cssSelector("*[data-test=\"shopping-cart-badge\"]")).getText(), is("1"));
    // 16 | close |  | 
    driver.close();
  }
}
