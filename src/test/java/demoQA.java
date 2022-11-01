import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoQA {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver" , "Selenium1Demo/driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        //title
//        WebElement titleImage = driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']"));
//        titleImage.click();


        //driver.findElement(By.cssSelector(".home-banner")).click();

        //pagina din spatele banner-ului
       // driver.findElement(By.xpath("//a[@class='navbar__brand col-auto order-0']")).click(); //revenire la pagina initiala
//          Thread.sleep(2000);

        //carduri
        //Element card
        WebElement formsPage = driver.findElement(By.xpath("//div[@class='category-cards']/div[1]"));
        formsPage.click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='header-wraper'][1]")).click();
        driver.findElement(By.id("item-3")).click();
        Thread.sleep(1000);



        driver.close();

    }
}
