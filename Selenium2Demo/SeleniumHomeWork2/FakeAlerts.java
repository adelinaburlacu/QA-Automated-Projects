package homework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static homework.AlertTestsHomeWork.isAlertOpened;

public class FakeAlerts {
    public static void main(String[] args) {
        //firstFakeAlert();
        secondFakeAlert();
    }

    public static void firstFakeAlert() {
        ChromeDriver driver = null;
        try {
            driver = BrowserManager.getChromedriver();
            driver.get("https://testpages.herokuapp.com/styled/alerts/fake-alert-test.html");

            WebElement firstButton = driver.findElement(By.id("fakealert"));
            firstButton.click();
            Alert firstFakeAlert = driver.switchTo().alert();
            System.out.println(firstFakeAlert.getText());
            firstFakeAlert.accept();
            System.out.println("Is alert open after it has been closed: " + isAlertOpened(driver));
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }

    public static void secondFakeAlert() {
        ChromeDriver driver = null;
        try {
            driver = BrowserManager.getChromedriver();
            driver.get("https://testpages.herokuapp.com/styled/alerts/fake-alert-test.html");

            WebElement secondButton = driver.findElement(By.id("modaldialog"));
            secondButton.click();
            Alert secondFakeAlert = driver.switchTo().alert();
            System.out.println(secondFakeAlert.getText());
            secondFakeAlert.accept();
            System.out.println("Is alert open after it has been closed: " + isAlertOpened(driver));
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
