/* (C)2023 */
package com.jitsu.defs;

import com.jitsu.steps.ActiveAssignmentSteps;
import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;

public class ActiveAssignmentDefs {

    @Steps
    ActiveAssignmentSteps activeAssignmentSteps;

    @And("^user click button start tutorial$")
    public void clickBntStartTutorial() {
        activeAssignmentSteps.clickBntStartTutorial();
    }
    @And("^user check button quit tutorial display$")
    public void checkBtnQuitTutorialDisplay() {
        activeAssignmentSteps.checkBtnQuitTutorialDisplay();
    }


}
