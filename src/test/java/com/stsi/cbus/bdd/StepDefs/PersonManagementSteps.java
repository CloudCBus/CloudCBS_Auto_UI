package com.stsi.cbus.bdd.StepDefs;

import com.stsi.cbus.bdd.BrowerControls.BasePageSetup;
import com.stsi.cbus.bdd.Pages.HomePage;
import com.stsi.cbus.bdd.Pages.PersonManagementPage;
import com.stsi.cbus.bdd.StepsImp.HomePageStepsImp;
import com.stsi.cbus.bdd.StepsImp.PersonManagementStepsImp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PersonManagementSteps extends BasePageSetup {

    public PersonManagementStepsImp personManagementStepsImp;
    public PersonManagementPage personManagementPage;
    public PersonManagementSteps(){
        personManagementStepsImp =  new PersonManagementStepsImp();
        personManagementPage = new PersonManagementPage();
    }

    @Then("I Verify Person Management Search Page is Displayed")
    public void validatePersonManagementSearchPage() throws Exception {
//       // new WebDriverWait(webdriver, 40).until(ExpectedConditions.visibilityOf(personManagementPage.personManagementSearchHeadder));
//        Thread.sleep(9000);
//        Assert.assertTrue(personManagementPage.personManagementSearchHeadder.isDisplayed());
//        Assert.assertTrue(personManagementPage.personNameSearchField.isDisplayed());
//        Assert.assertTrue(personManagementPage.personNumberSearchField.isDisplayed());
Thread.sleep(6000);
        System.out.println("++++++++++++++"+personManagementPage.personManagementSearchHeadder.isDisplayed());
    }

    @And("I Search Employee by Person Number and Click on Search Button")
    public void searchEmployeeByPersonNumberandClickOnSearchButton() throws Exception {
        //new WebDriverWait(webdriver, 40).until(ExpectedConditions.visibilityOf(personManagementPage.personManagementSearchHeadder));
Thread.sleep(5000);
        personManagementPage.personNumberSearchField.clear();
        personManagementPage.personNumberSearchField.sendKeys("4816");
        personManagementPage.searchButton.click();
    }

    @Then("I Validate the Employee with Person Number is Displayed in the Search Results")
    public void I_Validate_the_Employee_with_Person_Number_is_Displayed() throws Exception {

        personManagementStepsImp.validatwPersonNumberisDisplayed();

    }

    @Then("I Click on the Actions Icon and Select Work Relationship Action under Personal and Employment Section")
    public void I_Click_on_the_Actions_Icon_and_SelectWork_Relationship_Action_under_Personal_and_Employment() throws Exception {

        personManagementStepsImp.clickonActionsIconandSelectWorkRelationship();


    }
}
