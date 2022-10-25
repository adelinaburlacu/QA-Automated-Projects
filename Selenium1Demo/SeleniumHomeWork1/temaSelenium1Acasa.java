package skillbrain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class temaSelenium1Acasa {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver" , "Selenium1Demo/driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/basic-web-page-test.html");
//Prima pagina din tema
        //title
        WebElement title = driver.findElement(By.cssSelector("div[class='page-body'] h1"));
        System.out.println(title.getText());
        System.out.println("");

        //explanation
        WebElement explanation = driver.findElement(By.cssSelector(".explanation"));
        System.out.println(explanation.getText());
        System.out.println("");

        //first paragraph
        WebElement firstParagraph;
        firstParagraph = driver.findElement(By.cssSelector("#para1"));
        System.out.println(firstParagraph.getText());
        System.out.println("");

        //second paragraph
        WebElement secondParagraph = driver.findElement(By.cssSelector("#para2"));
        System.out.println(secondParagraph.getText());
        System.out.println("");

//A doua pagina din tema

        driver.get("https://testpages.herokuapp.com/styled/attributes-test.html");
        //titlul 2
        WebElement title2 = driver.findElement(By.cssSelector("div[class='page-body'] h1"));
        System.out.println(title2.getText());
        System.out.println("");

        //explenation 2
        WebElement explanation2 = driver.findElement(By.cssSelector(".explanation"));
        System.out.println(explanation2.getText());
        System.out.println("");

        //subtitle
        WebElement subtitle = driver.findElement(By.cssSelector("body > div:nth-child(1) > h2:nth-child(4)"));
        System.out.println(subtitle.getText());
        System.out.println("");

        //inline-explanation
        WebElement inlineExplanation = driver.findElement(By.cssSelector("body > div:nth-child(1) > p:nth-child(5)"));
        System.out.println(inlineExplanation.getText());
        System.out.println("");

        //paragrapgWithAtributte
        WebElement paragraph3 = driver.findElement(By.cssSelector("#domattributes"));
        System.out.println(paragraph3.getText());
        System.out.println("");

        //subtitle2
        WebElement subtitle2 = driver.findElement(By.cssSelector("body > div:nth-child(1) > h2:nth-child(9)"));
        System.out.println(subtitle2.getText());
        System.out.println("");

        //inlime-explanation2
        WebElement inlineExplanation2 = driver.findElement(By.cssSelector("body > div:nth-child(1) > p:nth-child(11)"));
        System.out.println(inlineExplanation2.getText());
        System.out.println("");

        //paragrapgWithDynamicAttributes
        WebElement paragraph4 = driver.findElement(By.cssSelector("#jsattributes"));
        System.out.println(paragraph4.getText());
        System.out.println("");

        //AddAnotherAttributeButton
        driver.findElement(By.cssSelector(".styled-click-button")).click();

//A treia pagina din tema

        driver.get("https://testpages.herokuapp.com/styled/find-by-playground-test.html");
        //title3
        WebElement title3 = driver.findElement(By.cssSelector("div[class='page-body'] h1"));
        System.out.println(title3.getText());
        System.out.println("");

        //explanation3
        WebElement explanation3 = driver.findElement(By.xpath("//div[@class='explanation']"));
        System.out.println(explanation3.getText());
        System.out.println("");

        //body - div1 - prima metoda de localizare
        WebElement body = driver.findElement(By.cssSelector("#div1"));
        System.out.println(body.getText());
        System.out.println("");

        //





        sleep(5000);
        driver.close();
    }
}
