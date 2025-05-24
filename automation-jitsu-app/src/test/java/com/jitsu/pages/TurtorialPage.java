package com.jitsu.pages;

import com.jitsu.common.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TurtorialPage extends BasePage {

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Assigned Route\"]")
    WebElementFacade btnAssignedRoute;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Direct Booking\"]")
    WebElementFacade btnDirectBooking;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Ticket Booking\"]")
    WebElementFacade btnTicketBooking;


//    public void checkScreenTutorialDisplay() {
//        btnAssignedRoute.isDisplayed();
//        btnDirectBooking.isDisplayed();
//        btnTicketBooking.isDisplayed();
//    }
    public boolean checkBtnAssignedRouteDisplay() {
        return btnAssignedRoute.waitUntilPresent().isDisplayed();
    }
    public boolean checkBtnDirectBookingDisplay() {
        return btnDirectBooking.waitUntilPresent().isDisplayed();
    }
    public boolean checkBtnTicketBookingDisplay() {
        return btnTicketBooking.waitUntilPresent().isDisplayed();
    }

    public void clickBtnAssignedRoute() {
        btnAssignedRoute.click();
    }

}


