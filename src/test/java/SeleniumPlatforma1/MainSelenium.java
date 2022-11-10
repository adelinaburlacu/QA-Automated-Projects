package SeleniumPlatforma1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainSelenium {

    public static void main(String[] args) {
//       System.setProperty("webdriver.chrome.driver" , "src/test/chromedriver.exe");
//        ChromeDriver driver = new ChromeDriver();

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com");

        //WebElement element1 = driver.findElement(By.xpath("//div[@class='home-banner']/a"));
//        WebElement element2 = driver.findElement(By.cssSelector("div.home-banner a"));
//        element2.click();

        //By.tagName
//       WebElement header = driver.findElement(By.tagName("header"));
//        header.click();

        //By.id
//        driver.get("https://demoqa.com/webtables");
//        WebElement button = driver.findElement(By.id("addNewRecordButton"));
//        button.click();

        //By.linkText
//        driver.get("https://demoqa.com/links");
//        WebElement link = driver.findElement(By.linkText("Home"));
//        link.click();
//        WebElement link2 = driver.findElement(By.partialLinkText("Content"));
//        link2.click();

        //By.name
//        driver.get("https://demoqa.com/");
//        WebElement meta = driver.findElement(By.name("viewport"));
//        System.out.println(meta.getAttribute("content"));

        //By.ClassName
        WebElement homeBanner= driver.findElement(By.className("home-banner"));
        homeBanner.click();



        driver.close();
        driver.quit();

        System.out.println("Finish");
    }
}
