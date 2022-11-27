package SeleniumCurs4;

import SeleniumCurs4.pageObjects.EmagPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.time.Duration;

public class EmagPageTest {

    RemoteWebDriver driver;
        @BeforeSuite
    public void  getChromeDriver() throws MalformedURLException {

            driver = Utilitati.getRemoteDriver();
        }

        @AfterSuite
    public void closeChrome() {
            driver.quit();
        }

        @Test
    public void implicitTest() {
            driver.get("https://www.emag.ro/");
            EmagPage emagPage = PageFactory.initElements(driver, EmagPage.class);
//            WebElement casutaNeagra = emagPage.getMesajPagina();
//            casutaNeagra.click();
            WebElement accept = emagPage.getAcceptButton();
            accept.click();
//            driver.findElement(By.xpath("//div[@class='gdpr-cookie-banner js-gdpr-cookie-banner pad-sep-xs pad-hrz-none show']"));
//            WebElement accept = driver.findElement(By.xpath("//button[normalize-space()='Accept']"));
//            accept.click();

        }

        @Test
    public void explicitTest() {
            driver.get("https://www.emag.ro/");
            driver.manage().window().maximize();
            WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(2));
            EmagPage emagPage = PageFactory.initElements(driver, EmagPage.class);
            WebElement casutaNeagra = emagPage.getMesajPagina();

            explicitWait.until(ExpectedConditions.visibilityOf(casutaNeagra));
                                            //  elementToBeClickable //visibilityOfElementLocated
            casutaNeagra.click();
            WebElement accept = emagPage.getAcceptButton();
            accept.click();
        }






}
