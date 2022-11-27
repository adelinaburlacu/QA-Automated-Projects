package SeleniumHomeWork4.Refresh;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class refreshTest extends testsConfigJavaScript {

    @Test
    public void refreshTest() throws InterruptedException {
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
