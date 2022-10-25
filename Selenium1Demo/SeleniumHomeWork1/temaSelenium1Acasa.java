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

        //each paragraph - a doua metoda
        WebElement para1 = driver.findElement(By.cssSelector("#p1"));
        System.out.println(para1.getText());
        System.out.println("");

        WebElement para2 = driver.findElement(By.cssSelector("#p2"));
        System.out.println(para2.getText());
        System.out.println("");

        WebElement para3 = driver.findElement(By.cssSelector("#p3"));
        System.out.println(para3.getText());
        System.out.println("");

        WebElement para4 = driver.findElement(By.cssSelector("#p4"));
        System.out.println(para4.getText());
        System.out.println("");

        WebElement para5 = driver.findElement(By.cssSelector("#p5"));
        System.out.println(para5.getText());
        System.out.println("");

        WebElement para6 = driver.findElement(By.cssSelector("#p6"));
        System.out.println(para6.getText());
        System.out.println("");

        WebElement para7 = driver.findElement(By.cssSelector("#p7"));
        System.out.println(para7.getText());
        System.out.println("");

        WebElement para8 = driver.findElement(By.cssSelector("#p8"));
        System.out.println(para8.getText());
        System.out.println("");

        WebElement para9 = driver.findElement(By.cssSelector("#p9"));
        System.out.println(para9.getText());
        System.out.println("");

        WebElement para10 = driver.findElement(By.cssSelector("#p10"));
        System.out.println(para10.getText());
        System.out.println("");

        WebElement para11 = driver.findElement(By.cssSelector("#p11"));
        System.out.println(para11.getText());
        System.out.println("");

        WebElement para12 = driver.findElement(By.cssSelector("#p12"));
        System.out.println(para12.getText());
        System.out.println("");

        WebElement para13 = driver.findElement(By.cssSelector("#p13"));
        System.out.println(para13.getText());
        System.out.println("");

        WebElement para14 = driver.findElement(By.cssSelector("#p14"));
        System.out.println(para14.getText());
        System.out.println("");

        WebElement para15 = driver.findElement(By.cssSelector("#p15"));
        System.out.println(para15.getText());
        System.out.println("");

        WebElement para16 = driver.findElement(By.cssSelector("#p16"));
        System.out.println(para16.getText());
        System.out.println("");

        WebElement para17 = driver.findElement(By.cssSelector("#p17"));
        System.out.println(para17.getText());
        System.out.println("");

        WebElement para18 = driver.findElement(By.cssSelector("#p18"));
        System.out.println(para18.getText());
        System.out.println("");

        WebElement para19 = driver.findElement(By.cssSelector("#p19"));
        System.out.println(para19.getText());
        System.out.println("");

        WebElement para20 = driver.findElement(By.cssSelector("#p20"));
        System.out.println(para20.getText());
        System.out.println("");

        WebElement para21 = driver.findElement(By.cssSelector("#p21"));
        System.out.println(para21.getText());
        System.out.println("");

        WebElement para22 = driver.findElement(By.cssSelector("#p22"));
        System.out.println(para22.getText());
        System.out.println("");

        WebElement para23 = driver.findElement(By.cssSelector("#p23"));
        System.out.println(para23.getText());
        System.out.println("");

        WebElement para24 = driver.findElement(By.cssSelector("#p24"));
        System.out.println(para24.getText());
        System.out.println("");

        WebElement para25 = driver.findElement(By.cssSelector("#p25"));
        System.out.println(para25.getText());
        System.out.println("");

        //the first paragraph and the other paragraphs
        WebElement para1A = driver.findElement(By.cssSelector("#p1"));
        System.out.println(para1A.getText());
        System.out.println("");

        WebElement otherParagraphs = driver.findElement(By.cssSelector(""));





        sleep(5000);
        driver.close();
    }
}
