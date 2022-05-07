package com.stsi.cbus.bdd.StepsImp;

import com.stsi.cbus.bdd.BrowerControls.BasePageSetup;
import com.stsi.cbus.bdd.Pages.LoginPage;

public class LoginPageStepsImp extends BasePageSetup {

    public  LoginPage loginPage;


    public void loginIntoOracleHCM(){
        loginPage =  new LoginPage();
        loginPage.userNamefld.sendKeys("CURTIS.FEITTY");
        loginPage.passwordField.sendKeys("tDA7U%3?");
        loginPage.signInButton.click();
    }


}
