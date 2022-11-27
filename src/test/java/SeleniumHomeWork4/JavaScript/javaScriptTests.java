package SeleniumHomeWork4.JavaScript;

import SeleniumHomeWork4.PageObject.HerokuAppPage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class javaScriptTests extends testsConfigJavaScript {

    @Test(description = "Se vor verifica butoanele care redirectează " +
            "către o pagină noua, folosind wait si windowHandles")
    public void redirectingButton() {
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
