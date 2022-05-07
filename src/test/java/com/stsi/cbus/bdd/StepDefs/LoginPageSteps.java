package com.stsi.cbus.bdd.StepDefs;


import com.stsi.cbus.bdd.BrowerControls.BasePageSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import com.stsi.cbus.bdd.StepsImp.LoginPageStepsImp;

import java.util.Map;

public class LoginPageSteps extends BasePageSetup {

   public LoginPageStepsImp loginPageStepsImp;

   public LoginPageSteps(){
       loginPageStepsImp =  new LoginPageStepsImp();
   }

    @Given("I Navigate to Oracel HCM Login Page")
    public void I_Navigate_to_Oracel_HCM_Login_Page() throws Exception {
        initialization();

    }

    @Then("I Login into the Application with Valid Credentials")
    public void I_Login_into_the_Application_with_Valid_Credentials() throws InterruptedException {

        loginPageStepsImp.loginIntoOracleHCM();
        Thread.sleep(10000);

    }
}
