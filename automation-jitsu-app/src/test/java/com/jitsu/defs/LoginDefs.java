package com.jitsu.defs;

import com.jitsu.steps.*;

import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class LoginDefs {
    @Steps
    LoginSteps loginSteps;

    @Given("^user opens jitsu app$")
    public void userOpenFMB() {
        loginSteps.startApplication();
    }

    @Given("^user login with username:\"([^\"]*)\" and password:\"([^\"]*)\"$")
    public void loginWithUsernameAndPass(String userName,String passs) {
        loginSteps.loginWithUsernameAndPass(userName,passs);
    }


}
