package SeleniumPatformaDemo5Grid.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmagPage {


   // public static final String CLOSE_BUTTON_XPATH = "//img[@title='IFI']";
    public static final String ACCEPT_BUTTON_XPATH = "//button[normalize-space()='Accept']";
    public static final String LOGIN_BUTTON_CSS = ".font-size-ms.strong.login-btn.btn.btn-primary.js-login-btn";
    public EmagPage(ChromeDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Inapoi in site']")
    private WebElement inapoiPeSite;

//    public WebElement getInapoiPeSite() {
//        return inapoiPeSite;
//    }

    @FindBy(xpath = ACCEPT_BUTTON_XPATH)
    private WebElement acceptButton;

    public WebElement getAcceptButton() {

        return acceptButton;
    }

    @FindBy(css = LOGIN_BUTTON_CSS)
    private WebElement loginButton;

    public WebElement getLoginButton() {
        return loginButton;
    }

//    @FindBy(xpath = CLOSE_BUTTON_XPATH)
//    private WebElement closeButton;

//    public WebElement getCloseButton() {
//        return closeButton;
//    }
}
