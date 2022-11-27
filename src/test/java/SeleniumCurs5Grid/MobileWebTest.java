package SeleniumCurs5Grid;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class MobileWebTest {
    ChromeDriver driver;


    @BeforeSuite
    public void getChromeDriver() {
        driver = Utilitati.getMobileChromeDriver();
    }

    @AfterSuite
    public void closeChrome() {
        driver.quit();
    }

    @Test
    public void mobileChromeTest() {
        driver.get("https://demoqa.com");
    }
}
