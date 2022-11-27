package SeleniumCurs4.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmagPage {

    private static final String ACCEPT_BUTTON_XPATH = "btn btn-primary js-accept gtm_h76e8zjgoo btn-block";
    private static final String CASUTA_NEAGRA = "//div[@class='gdpr-cookie-banner js-gdpr-cookie-banner pad-sep-xs pad-hrz-none show']";

    @FindBy(xpath = CASUTA_NEAGRA)
    private WebElement mesajPagina;

    @FindBy(name = ACCEPT_BUTTON_XPATH)
    private WebElement acceptButton;

    public WebElement getAcceptButton() {
        return acceptButton;
    }

    public WebElement getMesajPagina(){
        return mesajPagina;
    }
    }

