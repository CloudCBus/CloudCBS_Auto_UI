package com.stsi.cbus.bdd.Pages;

import com.stsi.cbus.bdd.Pages.LoginPage;

public class PageInitializer {

    public PersonManagementPage personManagementPage;
    public LoginPage loginPage;
    public HomePage homePage;
    public void initializeAllPages(){

        loginPage =  new LoginPage();
        homePage =  new HomePage();
        personManagementPage = new PersonManagementPage();
    }
}
