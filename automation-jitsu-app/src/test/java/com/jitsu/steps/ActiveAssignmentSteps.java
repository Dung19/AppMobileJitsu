/* (C)2023 */
package com.jitsu.steps;

import com.jitsu.pages.ActiveAssignmentPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.junit.Assert.assertTrue;

public class ActiveAssignmentSteps extends ScenarioSteps {
    ActiveAssignmentPage activeAssignmentPage;


    @Step
    public void clickBntStartTutorial() {
        activeAssignmentPage.clickBntStartTutorial();
    }
    @Step
    public void checkBtnQuitTutorialDisplay() {
        assertTrue(activeAssignmentPage.checkBtnQuitTutorialDisplay());
    }

}
