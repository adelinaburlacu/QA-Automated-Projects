package SeleniumHomeWork4.DinamicButtonsDisabled;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class testsConfigDinamicButtonsDisabled {

    protected ChromeDriver driver = null;

    @BeforeMethod
    public void beforeMethod() {
        driver = WebdriverConfig.getChromeDriverWithOptions();
        driver.get("https://testpages.herokuapp.com/styled/dynamic-buttons-disabled.html");

    }


    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        if (driver != null) {
            driver.quit();
        }
    }
}
