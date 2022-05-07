package com.stsi.cbus.bdd.StepDefs;

import com.stsi.cbus.bdd.BrowerControls.BasePageSetup;
import com.stsi.cbus.bdd.Pages.HomePage;
import com.stsi.cbus.bdd.StepsImp.HomePageStepsImp;
import com.stsi.cbus.bdd.StepsImp.LoginPageStepsImp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Map;

public class HomePageSteps  extends BasePageSetup {

    public HomePageStepsImp homePageStepsImp;
    public HomePage homePage;
    public HomePageSteps(){
        homePageStepsImp =  new HomePageStepsImp();
        homePage = new HomePage();
    }


    @And("I Click on {string} Link in NAV Tabs on Main Page")
    public void iClickOnSpecificNavLinks(String navLink) throws Exception {
          new WebDriverWait(webdriver, 40).until(ExpectedConditions.visibilityOf(homePage.getmainTabWebElement(webdriver, navLink)));
        homePage.getmainTabWebElement(webdriver, navLink).click();
        Thread.sleep(3000);

        }


    @Then("I Click on {string} Link Under My Clients Group")
    public void iClickOnIconUnderMyClientGroup(String navLink) throws Exception {
        new WebDriverWait(webdriver, 40).until(ExpectedConditions.visibilityOf(homePage.getmainTabWebElement(webdriver, navLink)));
        homePage.getmainTabWebElement(webdriver, navLink).click();
        Thread.sleep(3000);

    }


    }




