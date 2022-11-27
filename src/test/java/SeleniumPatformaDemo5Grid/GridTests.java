package SeleniumPatformaDemo5Grid;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class GridTests {

    @Test
    public void gridTest() throws MalformedURLException {
        RemoteWebDriver driver = WebDriverManager.getRemoteWebDriver();
        driver.get("https://demoqa.com/");
        driver.quit();
    }
}
