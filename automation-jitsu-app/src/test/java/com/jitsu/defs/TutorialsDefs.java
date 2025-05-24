/* (C)2023 */
package com.jitsu.defs;

import com.jitsu.steps.TutorialsSteps;
import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;

public class TutorialsDefs {

    @Steps
    TutorialsSteps tutorialsSteps;

    @And("^user check screen tutorial display$")
    public void checkScreenTutorialDisplay() {
        tutorialsSteps.checkScreenTutorialDisplay();
    }
    @And("^user click on button assigned route$")
    public void clickBtnTutorials() {
        tutorialsSteps.clickBtnAssignedRoute();
    }


}
