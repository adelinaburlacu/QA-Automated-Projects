package SeleniumHomeWork5Grid.SeleniumHomeWork4Grid.JavaScript;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class testsConfigJavaScript extends javaScriptTests {

    RemoteWebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = WebdriverConfig.getChromeDriverWithOptions();
        driver.get("https://testpages.herokuapp.com/styled/javascript-redirect-test.html");

    }


    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        if (driver != null) {
            driver.quit();
        }
    }
}
