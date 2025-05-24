package com.jitsu.pages;

import com.jitsu.common.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ProfilePage extends BasePage {

    @AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc,'Tab 5 of 5')]")
    WebElementFacade btnProfileTab;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Tutorials\"]")
    WebElementFacade btnTutorials;

    public void clickProfileTab() {
        System.out.println("dsdsds"+btnProfileTab.isDisplayed());
        btnProfileTab.waitUntilEnabled().click();
    }
    public void clickBtnTutorials() {
        btnTutorials.waitUntilPresent().click();
    }

}
