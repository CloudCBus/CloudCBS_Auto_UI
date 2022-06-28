package com.stsi.cbus.bdd.StepsImp;

import com.stsi.cbus.bdd.BrowerControls.BasePageSetup;
import com.stsi.cbus.bdd.Pages.LoginPage;

public class LoginPageStepsImp extends BasePageSetup {

    public  LoginPage loginPage;


    public void loginIntoOracleHCM(){
        loginPage =  new LoginPage();
        loginPage.userNamefld.sendKeys("Albert.harris");
        loginPage.passwordField.sendKeys("Welcome@123");
        loginPage.signInButton.click();
    }


}
