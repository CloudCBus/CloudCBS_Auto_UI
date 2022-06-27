package com.stsi.cbus.bdd.StepsImp;

import com.stsi.cbus.bdd.BrowerControls.BasePageSetup;
import com.stsi.cbus.bdd.Pages.MyTeamPage;
import com.stsi.cbus.bdd.Pages.NewPersonPage;
import com.stsi.cbus.bdd.Utils.CommonFunctions;
import com.stsi.cbus.bdd.Utils.WebDriverUtils;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.List;

public class MyTeamStepsImp extends BasePageSetup {

    public MyTeamPage myTeamPage;

    public MyTeamStepsImp() {
        myTeamPage = new MyTeamPage();
    }


    public void searchPersonByPersonNameAndClickOnSearchIcon() throws Exception {

        try {
            WebDriverUtils.waitforElementTobeVisible(myTeamPage.overviewHeadder);
            myTeamPage.searchPersonInputField.sendKeys("Vijay Kodali");
            WebDriverUtils.waitforelementToBeClickable(myTeamPage.searchPersonSearchIcon);
            Thread.sleep(2000);
            WebDriverUtils.jsClick(myTeamPage.searchPersonSearchIcon);
            Thread.sleep(2000);

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Failed to search an Employee in My team Section" + "\t" + e.getMessage());
        }
    }


    public void selectActionItemFromListOfActions(String StringToClick) throws Exception {

        try {
            WebDriverUtils.waitforElementTobeVisible(myTeamPage.employeeName, "Vijay Kodali");
            WebDriverUtils.jsClick(myTeamPage.actionsIcon);
            WebDriverUtils.waitforElementTobeVisible(myTeamPage.actionMemupopup);
            List<WebElement> actionItemsList = myTeamPage.actionItemsList;
            actionItemsList.forEach(p -> System.out.println(p));
            CommonFunctions.SelectValueFromDropDown(actionItemsList, StringToClick);
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Failed to Select Add Assignemt Value" + "\t" + e.getMessage());
        }
    }

    public void validateHeadderpageisDisplayed(String header) throws Exception {

        try {
            Assert.assertTrue(myTeamPage.getPageHeadderElement(header).isDisplayed());
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Failed to load Add Assignment Page" + "\t" + e.getMessage());
        }
    }


    public void selectAllAssignmentOptions() throws Exception {

        try {
            List<WebElement> assignmentOptions = myTeamPage.assignmentoptions;
            assignmentOptions.forEach(p -> p.click());
            Thread.sleep(1000);
            myTeamPage.continueButton.click();
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Failed to load Add Assignment Page" + "\t" + e.getMessage());
        }
    }


    public void enterAssignmentDetails(String assignmentType) throws Exception {

       try{
            switch (assignmentType){

                case "When and Why":
                    WebDriverUtils.waitforElementTobeVisible(myTeamPage.whenAndWhyoption);
                    WebDriverUtils.waitforelementToBeClickable(myTeamPage.continueassignmentsButton);
                    myTeamPage.continueassignmentsButton.click();
                    break;

                case "Assignment":
                    WebDriverUtils.waitforElementTobeVisible(myTeamPage.labels, "Primary Assignment");
                    myTeamPage.continueassignmentsButton.click();
                    break;

                case "Maintain Managers":
                    WebDriverUtils.waitforElementTobeVisible(myTeamPage.addButton);
                    myTeamPage.continueassignmentsButton.click();
                    break;

                case "Salary":
                    WebDriverUtils.waitforElementTobeVisible(myTeamPage.salaryBasicsInputField);
                    myTeamPage.salaryBasicsInputField.sendKeys("IN Annual Salary Basis");
                    Thread.sleep(3000);
                    myTeamPage.salaryBasicsdropdownItem.click();
                    Thread.sleep(5000);
                    Actions actions = new Actions(webdriver);
                    actions.moveToElement(myTeamPage.salaryAmountInputField)
                            .click(myTeamPage.salaryAmountInputField)
                            .sendKeys("40000")
                            .build()
                            .perform();

                    Thread.sleep(2000);
                    myTeamPage.continueassignmentsButton.click();
                    break;

                case "Compensation":
                    WebDriverUtils.waitforElementTobeVisible(myTeamPage.addButton);
                    myTeamPage.continueassignmentsButton.click();
                    break;

                case "Add Direct Reports":
                    WebDriverUtils.waitforElementTobeVisible(myTeamPage.addDirectReportslabel);
                    myTeamPage.continueassignmentsButton.click();
                    break;

                case "Comments and Attachments":
                    WebDriverUtils.waitforElementTobeVisible(myTeamPage.comentsTextarea);
                    WebDriverUtils.sendKeys(myTeamPage.comentsTextarea,"Adding Assignments");
                    break;
            }


        }catch (Exception e){
            e.printStackTrace();
            throw new Exception("Failed to entet "+ assignmentType + "Details " + "\t" + e.getMessage());
        }

    }


    public void submitanAssignment() throws Exception {

        try {
            Thread.sleep(3000);
            WebDriverUtils.waitforelementToBeClickable(myTeamPage.submitButton);
            myTeamPage.submitButton.click();

        }catch (Exception e){
            e.printStackTrace();
            throw new Exception("Failed To Click on Submit Button " + "\t" + e.getMessage());

        }
    }
}

