package com.jitsu.pages;

import com.jitsu.common.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ActiveAssignmentPage extends BasePage {

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Start Tutorial\"]")
    WebElementFacade bntStartTutorial;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Quit tutorial\"]")
    WebElementFacade bntQuitTutorial;


//    public void checkBtnQuitTutorialDisplay() {
//        bntQuitTutorial.isDisplayed();
////        clickNextButtonKeyboard();
//    }
    public boolean checkBtnQuitTutorialDisplay() {
        return bntQuitTutorial.waitUntilPresent().isDisplayed();
    }

    public void clickBntStartTutorial() {
        bntStartTutorial.waitUntilClickable().click();
    }


}
