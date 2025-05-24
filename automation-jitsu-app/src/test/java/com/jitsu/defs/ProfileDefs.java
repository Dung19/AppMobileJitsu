/* (C)2023 */
package com.jitsu.defs;

import com.jitsu.steps.ProfileSteps;

import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;

public class ProfileDefs {

    @Steps
    ProfileSteps profileSteps;

    @And("^user click on tab profile$")
    public void clickProfileTab() {
        profileSteps.clickProfileTab();
    }
    @And("^user click on button tutorials$")
    public void clickBtnTutorials() {
        profileSteps.clickBtnTutorials();
    }


}
