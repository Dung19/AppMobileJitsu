/* (C)2023 */
package com.jitsu.steps;

import com.jitsu.pages.TurtorialPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class TutorialsSteps extends ScenarioSteps {
    TurtorialPage turtorialPage;


    @Step
    public void checkScreenTutorialDisplay() {
        turtorialPage.checkBtnDirectBookingDisplay();
        turtorialPage.checkBtnTicketBookingDisplay();
        turtorialPage.checkBtnAssignedRouteDisplay();

    }
    @Step
    public void clickBtnAssignedRoute() {
        turtorialPage.clickBtnAssignedRoute();
    }



}
