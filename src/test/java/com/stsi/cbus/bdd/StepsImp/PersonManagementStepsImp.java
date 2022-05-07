package com.stsi.cbus.bdd.StepsImp;

import com.stsi.cbus.bdd.BrowerControls.BasePageSetup;
import com.stsi.cbus.bdd.Pages.PersonManagementPage;
import com.stsi.cbus.bdd.Utils.CommonFunctions;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PersonManagementStepsImp extends BasePageSetup {


    public PersonManagementPage personManagementPage;
    public PersonManagementStepsImp(){
        personManagementPage = new PersonManagementPage();
    }

    public void validatwPersonNumberisDisplayed(){

       try{
           new WebDriverWait(webdriver, 40).until(ExpectedConditions.visibilityOf(personManagementPage.personNumberResultField));
            String personNumber = personManagementPage.personNumberResultField.getText().trim();
           Assert.assertEquals("4816", personNumber);
       }catch (NoSuchElementException e){
           System.out.println("No Results Found With The Search Criteria...!!!!, Please modify your search results and Try Again..!!");
       }
    }


    public void clickonActionsIconandSelectWorkRelationship() throws InterruptedException {

        personManagementPage.actionsButton.click();
        Thread.sleep(2000);
        List<WebElement> actionslist = personManagementPage.actionsList;
        CommonFunctions.SelectValueFromDropDown(webdriver,actionslist,"Personal and Employment");
        List<WebElement> actionssublist = personManagementPage.actionsList;
        CommonFunctions.SelectValueFromDropDown(webdriver,actionslist,"Work Relationship");
            Thread.sleep(5000);
    }

}
