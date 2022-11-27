package SeleniumCurs5Grid.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmagPage {

    private static final String ACCEPT_BUTTON_XPATH = "//button[normalize-space()='Accept']";
    private static final String CASUTA_NEAGRA = "gdpr-cookie-banner js-gdpr-cookie-banner pad-sep-xs pad-hrz-none show";

    @FindBy(xpath = CASUTA_NEAGRA)
    private WebElement mesajPagina;

    @FindBy(xpath = ACCEPT_BUTTON_XPATH)
    private WebElement acceptButton;

    public WebElement getAcceptButton() {
        return acceptButton;
    }

    public WebElement getMesajPagina(){
        return mesajPagina;
    }
    }

