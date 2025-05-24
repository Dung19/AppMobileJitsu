/* (C)2023 */
package com.jitsu.steps;

import com.jitsu.pages.ProfilePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ProfileSteps extends ScenarioSteps {
    ProfilePage profilePage;


    @Step
    public void clickProfileTab() {
        profilePage.clickProfileTab();
    }
    @Step
    public void clickBtnTutorials() {
        profilePage.clickBtnTutorials();
    }



}
