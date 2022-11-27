package SeleniumHomeWork4.DinamicButtonsDisabled;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;

public class dinamicButtonsTests extends testsConfigDinamicButtonsDisabled {



    @Test(description = "Se va crea un test care va face click pe toate butoanele, " +
            "și la sfârșit va verifica mesajul afișat. Mesajul apare doar dacă toate " +
            "butoanele au fost apăsate.")
    public void dinamicButtons() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        //Click Buttons In Order

        //Start
        WebElement startButton = driver.findElement(By.cssSelector("#button00"));
        startButton.click();
        Thread.sleep(6000);

        WebElement oneButton = driver.findElement(By.cssSelector("#button01"));
        oneButton.click();
        Thread.sleep(6000);

        WebElement twoButton = driver.findElement(By.cssSelector("#button02"));
        twoButton.click();
        Thread.sleep(6000);

        WebElement threeButton = driver.findElement(By.cssSelector("#button03"));
        threeButton.click();
        Thread.sleep(6000);
        WebElement message = driver.findElement(By.cssSelector("#buttonmessage"));
        System.out.println(message.getText());
    }
}
