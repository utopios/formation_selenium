package web_saucedemo.tests.testng.testcases;

import automation.enums.Browsers;
import automation.selenium.BrowserFactory;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import web_saucedemo.config.EnvironmentVariables;

import java.time.Duration;

public abstract class BaseTest {

    // TODO: Externalise config data

    private static Browsers browser = Browsers.FIREFOX;
    protected static String url = "https://www.saucedemo.com/";
    protected static WebDriver driver = BrowserFactory.launch(browser);
    @BeforeEach
    public void setup() {
        driver = BrowserFactory.launch(browser);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(EnvironmentVariables.WAIT_IMPLICIT));
        driver.manage().window().maximize();
        driver.get(url);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}