package SeleniumHomeWork5Grid.SeleniumHomeWork4Grid.JavaScript;

import SeleniumHomeWork5Grid.utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.time.Duration;

import static SeleniumHomeWork5Grid.GridSetUp.driver;

public class javaScriptTests extends utilities {
    RemoteWebDriver driver;
    @BeforeSuite
    public void  getChromeDriver() throws MalformedURLException {
        driver = getRemoteDriver();
       // driver = SeleniumHomeWork5Grid.utilities.getRemoteDriver();
    }


    @AfterSuite
    public void closeChrome() {
        driver.quit();
    }


    @Test(description = "Se vor verifica butoanele care redirectează " +
            "către o pagină noua, folosind wait si windowHandles")
    public void redirectingButton() {
        driver.get("https://testpages.herokuapp.com/styled/javascript-redirect-test.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

        WebElement fiveSecondsButton = driver.findElement(By.cssSelector("#delaygotobasic"));
        fiveSecondsButton.click();

        WebElement goBack = driver.findElement(By.id("goback"));
        goBack.click();

        WebElement twoSecondsButton = driver.findElement(By.id("delaygotobounce"));
        twoSecondsButton.click();

        WebElement goBack2 = driver.findElement(By.id("goback"));
        goBack2.click();





  }
}
