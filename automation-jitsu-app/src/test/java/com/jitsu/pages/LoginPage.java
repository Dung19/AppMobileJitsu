package com.jitsu.pages;

import com.jitsu.common.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends BasePage {

    @AndroidFindBy(xpath = "(//android.widget.Button[@content-desc=\"Log in with phone number\"]/preceding-sibling::android.widget.EditText)[1]")
    WebElementFacade inputUserName;
    @AndroidFindBy(xpath = "(//android.widget.Button[@content-desc=\"Log in with phone number\"]/preceding-sibling::android.widget.EditText)[2]")
    WebElementFacade inputPassword;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Log In\"]")
    WebElementFacade btnLogin;
    @AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc,'Tab 1 of 5')]")
    WebElementFacade rounterTag;



    public void enterUsername(String username) {
        inputUserName.waitUntilEnabled().clear();
        inputUserName.click();
        inputUserName.sendKeys(username);
//        clickNextButtonKeyboard();
    }
    public void enterPassword(String password) {
        inputPassword.waitUntilPresent().waitUntilEnabled().clear();
        inputPassword.click();
        inputPassword.sendKeys(password);


    }
    public void clickBtnLogin() {
        btnLogin.waitUntilClickable().click();
        waitElementEnable(30, rounterTag);
    }


}
