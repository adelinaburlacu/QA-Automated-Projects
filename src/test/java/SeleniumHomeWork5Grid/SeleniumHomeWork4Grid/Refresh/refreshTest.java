package SeleniumHomeWork5Grid.SeleniumHomeWork4Grid.Refresh;

import SeleniumHomeWork5Grid.utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.time.Duration;

import static SeleniumHomeWork5Grid.GridSetUp.driver;

public class refreshTest extends utilities {

    RemoteWebDriver driver;
    @BeforeSuite
    public void  getChromeDriver() throws MalformedURLException {
        driver = getRemoteDriver();
        //driver = SeleniumHomeWork5Grid.utilities.getRemoteDriver();
    }


    @AfterSuite
    public void closeChrome() {
        driver.quit();
    }

    @Test
    public void refreshTest() throws InterruptedException {
        driver.get("https://testpages.herokuapp.com/styled/refresh");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        for (int i = 0; i <5; i++) {
            String date = driver.findElement(By.id("refreshdate")).getText();
            System.out.println("Date = " + date);
            Thread.sleep(4000);
            driver.navigate().refresh();
            Assert.assertNotEquals(date, driver.findElement(By.id("refreshdate")).getText());
        }
    }

}
