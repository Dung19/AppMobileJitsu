package com.jitsu.steps;

import com.jitsu.common.BasePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import com.jitsu.pages.LoginPage;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginSteps extends ScenarioSteps {
    LoginPage loginPage;
    BasePage basePage;
    @Step
    public void hideKeyboard() {
        loginPage.hideKeyboard();
    }

    @Step
    public void startApplication() {
        loginPage.startApplication();
    }

//    @Step
//    public void enterPassword(String pass) {
//        loginPage.enterPassword(pass);
//    }
//
//    @Step
//    public void enterUsername(String username) {
//        loginPage.enterUsername(username);
//    }
//
//    @Step
//    public void clickBtnLogin() {
//        loginPage.clickBtnLogin();
//    }
    @Step
    public void loginWithUsernameAndPass(String user, String pass) {
        loginPage.enterUsername(user);
        loginPage.enterPassword(pass);
        waitABit(1000);
        loginPage.clickBtnLogin();


    }



}

