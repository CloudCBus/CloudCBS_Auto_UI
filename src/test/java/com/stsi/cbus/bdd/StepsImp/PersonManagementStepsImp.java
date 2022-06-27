package com.stsi.cbus.bdd.StepsImp;

import com.stsi.cbus.bdd.BrowerControls.BasePageSetup;
import com.stsi.cbus.bdd.Pages.PersonManagementPage;
import com.stsi.cbus.bdd.Utils.CommonFunctions;
import com.stsi.cbus.bdd.Utils.DateUtils;
import com.stsi.cbus.bdd.Utils.WebDriverUtils;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class PersonManagementStepsImp extends BasePageSetup {


    public PersonManagementPage personManagementPage;

    public PersonManagementStepsImp() {
        personManagementPage = new PersonManagementPage();
    }

    public void validatwPersonNumberisDisplayed() throws Exception {

        try {
            Thread.sleep(10000);
            new WebDriverWait(webdriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(personManagementPage.personNumberResultField));
            String personNumber = personManagementPage.personNumberResultField.getText().trim();
            Assert.assertEquals("512", personNumber);
            personManagementPage.personsearchResults.isDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("No Records Found with the Person Number. Please try with Valid Person Number " + "\t" + e.getMessage());
        }
    }


    public void clickonActionsIconandSelectWorkRelationship(String action, String item) throws Exception {

        try {
            //personManagementPage.userPersonType.isDisplayed();
            personManagementPage.actionsButton.click();
            new WebDriverWait(webdriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(personManagementPage.actionsListpopup));
            List<WebElement> actionslist = personManagementPage.actionsList;
            System.out.println("+++++++++++" + actionslist.size());
            CommonFunctions.SelectValueFromDropDown(actionslist, item);
            List<WebElement> actionssublist = personManagementPage.actionsList;
            System.out.println("+++++++++++" + actionssublist.size());
            CommonFunctions.SelectValueFromDropDown(actionssublist, action);

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Cannot Terminate the Person with Given Person Number. Please try with Permanent Person Numbers " + "\t" + e.getMessage());

        }
    }

    public void validateworkRelationshipPageIsdisplayed() throws Exception {

        try {
            new WebDriverWait(webdriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(personManagementPage.workRelationshipPageHeadder));
            Assert.assertTrue(personManagementPage.workRelationshipPageHeadder.isDisplayed());
            Assert.assertEquals(webdriver.getTitle(), "Work Relationship - Person Management - Oracle Applications");
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Failed to load the Work Relationship - Person Management - Oracle Applications Page: " + "\t" + e.getMessage());
        }
    }

    public void selectRespectiveItemFromActionsList(String actionsitem) throws Exception {

        try {
            new WebDriverWait(webdriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(personManagementPage.workRelationshipActionsDropdownkey));
            Thread.sleep(2000);
            personManagementPage.workRelationshipActionsDropdownkey.click();
            List<WebElement> actionsList = personManagementPage.workRelationshipActionsDropdownitems;
            CommonFunctions.SelectValueFromDropDown(actionsList, actionsitem);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Failed to Select " + actionsitem + " Item from Actions Dropdown: " + "\t" + e.getMessage());
        }
    }


    public void enterTerminationDetailsAndClickOnSubmit() throws Exception {

        try {
            new WebDriverWait(webdriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(personManagementPage.terminationDateInputField));
            personManagementPage.terminationDateInputField.clear();
            personManagementPage.terminationDateInputField.sendKeys(DateUtils.getYesterdayDateMMDDYYFormat());
            personManagementPage.reviewButton.click();

            try {
                new WebDriverWait(webdriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(personManagementPage.warningDialogueBoxYesButton));
                personManagementPage.warningDialogueBoxYesButton.click();
            } catch (Exception e) {

                System.out.println("Warning Message not Displayed...!!!");
            }
            new WebDriverWait(webdriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(personManagementPage.submitbutton));
            Thread.sleep(4000);
            personManagementPage.submitbutton.click();
            new WebDriverWait(webdriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(personManagementPage.confirmationYesButton));
            personManagementPage.confirmationYesButton.click();

            new WebDriverWait(webdriver, Duration.ofSeconds(40)).until(ExpectedConditions.visibilityOf(personManagementPage.confirmationdialoguebox));
            personManagementPage.confirmationOkButton.click();

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Failed to Terminate an Employee..!!" + "\t" + e.getMessage());
        }
    }


    public void selectEmployementEditOption(String EmployementEditOption) throws Exception {

        try {
            WebDriverUtils.waitforelementToBeClickable(personManagementPage.editEmployementDropdown);
            Thread.sleep(2000);
            personManagementPage.editEmployementDropdown.click();
            Thread.sleep(2000);
            List<WebElement> actionslist = personManagementPage.editEmployementDropdownitems;
            System.out.println("+++++++++++" + actionslist.size());
            CommonFunctions.SelectValueFromDropDown(actionslist, EmployementEditOption);

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Failed to Select " + EmployementEditOption + " Item from Actions Dropdown: " + "\t" + e.getMessage());
        }
    }


    public void SelectActionReasonAndActionReason(String action, String actionReason) throws Exception {

        try {
            WebDriverUtils.waitforElementTobeVisible(personManagementPage.updateEmployementpopup);
            Thread.sleep(2000);
            personManagementPage.actionDropdownKey.click();
            Thread.sleep(2000);
            List<WebElement> actionslist = personManagementPage.actionDropdownItems;
            System.out.println("+++++++++++" + actionslist.size());
            CommonFunctions.SelectValueFromDropDown(actionslist, action);
            Thread.sleep(3000);
            WebDriverUtils.waitforelementToBeClickable(personManagementPage.actionReasonDropdownKey);
            personManagementPage.actionReasonDropdownKey.click();
            List<WebElement> actionsReasonlist = personManagementPage.actionReasonDropdownItems;
            System.out.println("+++++++++++" + actionsReasonlist.size());
            CommonFunctions.SelectValueFromDropDown(actionsReasonlist, actionReason);
            personManagementPage.confirmationOkButton.click();

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Failed to Select " + action + " Item from Actions Dropdown: " + "\t" + e.getMessage());
        }
    }

    public void enterDetailsInAddAssignmentSection() throws Exception {

        try {
            WebDriverUtils.waitforelementToBeClickable(personManagementPage.assignmentNewLabel);
            personManagementPage.assignmentNewLabel.click();
            if (personManagementPage.bussinessUnitInputField.isEnabled()) {
                WebDriverUtils.jsSendKeys(personManagementPage.bussinessUnitInputField, "US1 Business Unit");
            }
            personManagementPage.reportingEstablishmentdropdown.click();
            List<WebElement> list = personManagementPage.reportingEstablishmentInputFieldItems;
            CommonFunctions.SelectValueFromDropDown(list, "Atlanta");

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Failed to Enter details in Add Assignement Section " + "\t" + e.getMessage());
        }
    }


    public void enterDetailsInCompensationSectionAndCLickOnNext() throws Exception {

        try {
            WebDriverUtils.waitforelementToBeClickable(personManagementPage.nextButton);
            personManagementPage.nextButton.click();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Failed to Enter details in Compensations Detail Page Section " + "\t" + e.getMessage());
        }
    }

    public void enterDetailsInRolesSectionAndCLickOnNext() throws Exception {

        try {
            WebDriverUtils.waitforelementToBeClickable(personManagementPage.nextButton);
            personManagementPage.nextButton.click();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Failed to Enter details in Roles Detail Page Section " + "\t" + e.getMessage());
        }
    }

    public void clickOnSumbitButtonToSubmitTheAssignment() throws Exception {

        try {

            WebDriverUtils.waitforElementTobeVisible(personManagementPage.confirmationYesButton);
            personManagementPage.confirmationYesButton.click();
            WebDriverUtils.waitforElementTobeVisible(personManagementPage.confirmationdialoguebox);
            personManagementPage.confirmationOkButton.click();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Failed to Enter details in Roles Detail Page Section " + "\t" + e.getMessage());
        }
    }


    public void enterWorkRelationshipIdentificationFieldsAndClickOnNext(DataTable dataTable) throws Exception {

        try {
            List<Map<String, String>> actionslistMap = dataTable.asMaps(String.class, String.class);
            Map actionsMap = actionslistMap.get(0);
            Thread.sleep(2000);
            Actions actions = new Actions(webdriver);
            actions.moveToElement(personManagementPage.contingentWorkerAddAssignmentActionsDropdownkey)
                    .click(personManagementPage.contingentWorkerAddAssignmentActionsDropdownkey)
                    .build()
                    .perform();

            Thread.sleep(2000);
            List<WebElement> actionsList = personManagementPage.contingentWorkerAddAssignmentActionsDropdownitems;
            CommonFunctions.SelectValueFromDropDown(actionsList, actionsMap.get("Action").toString());
            Thread.sleep(4000);
            actions.moveToElement(personManagementPage.contingentWorkerAddAssignmentActionsReasonDropdownkey)
                    .click(personManagementPage.contingentWorkerAddAssignmentActionsReasonDropdownkey)
                    .build()
                    .perform();
            Thread.sleep(2000);
            List<WebElement> actionsReason = personManagementPage.contingentWorkerAddAssignmentActionsReasonDropdownitems;
            CommonFunctions.SelectValueFromDropDown(actionsReason, actionsMap.get("ActionReason").toString());
            WebDriverUtils.jsSendKeys(personManagementPage.legalEmployertype, "US1 Legal Entity");
            WebDriverUtils.waitforelementToBeClickable(personManagementPage.nextButton);
            personManagementPage.nextButton.click();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Failed to Enter details in Roles Detail Page Section " + "\t" + e.getMessage());
        }
    }


    public void enterPerrsonIdentifierDetailsAndClickOnSubmit(DataTable dataTable) throws Exception {

        try {
            List<Map<String, String>> identifierlist = dataTable.asMaps(String.class, String.class);
            Map identifierMap = identifierlist.get(0);
            Thread.sleep(2000);
        //    if(personManagementPage.noSearchResultsMsg.isDisplayed()){
                personManagementPage.personIdentifierAddButton.click();
                WebDriverUtils.waitforElementTobeVisible(personManagementPage.personIdentifierType);
                Thread.sleep(3000);
                personManagementPage.personIdentifierType.click();
                List<WebElement> identifierItems = personManagementPage.personIdentifierItems;
                CommonFunctions.SelectValueFromDropDown(identifierItems,identifierMap.get("IdentifierType").toString() );
                Thread.sleep(2000);
                Actions actions = new Actions(webdriver);
                actions.sendKeys(Keys.TAB)
                    .sendKeys((DateUtils.getrandomNumberOnDate()))
                    .build()
                    .perform();
                WebDriverUtils.jsClick(personManagementPage.fromDateInputField);
                Thread.sleep(1000);
                WebDriverUtils.returnWebElement(personManagementPage.datetext,"14").click();
                personManagementPage.okButton.click();
                WebDriverUtils.jsClick(personManagementPage.toDateInputField);
                Thread.sleep(1000);
                WebDriverUtils.jsClick(personManagementPage.selectnextMonthButton);
                WebDriverUtils.returnWebElement(personManagementPage.datetext,"14").click();
                personManagementPage.okButton.click();
                WebDriverUtils.waitforelementToBeClickable(personManagementPage.submitbutton);
                personManagementPage.submitbutton.click();
                WebDriverUtils.waitforAllElementsTobeVisible(personManagementPage.confirmationYesButton);
                personManagementPage.confirmationYesButton.click();
                WebDriverUtils.waitforAllElementsTobeVisible(personManagementPage.confirmationdialoguebox);
                personManagementPage.confirmationOkButton.click();

           // }
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Failed to enter External Identifier Details " + "\t" + e.getMessage());
        }
    }

    public void enterEmployeeDemotionDetailsAndClickOnReviewButton() throws Exception {

        try {
            WebDriverUtils.waitforelementToBeClickable(personManagementPage.demotionReviewButton);
            personManagementPage.demotionReviewButton.click();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Unable to Review the Demotion Details " + "\t" + e.getMessage());
        }
    }

    public void enterEmployeePromotionDetailsAndClickOnReviewButton() throws Exception {

        try {
            WebDriverUtils.waitforelementToBeClickable(personManagementPage.positionInputField);
            WebDriverUtils.jsSendKeys(personManagementPage.positionInputField,"Human Resources Manager");
            WebDriverUtils.waitforelementToBeClickable(personManagementPage.demotionReviewButton);
            personManagementPage.demotionReviewButton.click();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Unable to Review the Promotion Details " + "\t" + e.getMessage());
        }
    }

    public void reviewDemotionDetailsAndClicOnSubmit() throws Exception {

        try {
            WebDriverUtils.waitforelementToBeClickable(personManagementPage.submitbutton);
            personManagementPage.submitbutton.click();
            WebDriverUtils.waitforElementTobeVisible(personManagementPage.confirmationYesButton);
            personManagementPage.confirmationYesButton.click();
            WebDriverUtils.waitforElementTobeVisible(personManagementPage.confirmationOkButton);
            personManagementPage.confirmationOkButton.click();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Failed to Submit Employee Demotion Details " + "\t" + e.getMessage());
        }
    }

    public void changeAssignmentNameAndClickOnReviewButton() throws Exception {

        try {
           WebDriverUtils.sendKeys(personManagementPage.assignmentNameInputField, "Assistant Manager");
            personManagementPage.personIdentifierReviewButton.click();

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Failed to Enter Assignemt Name, Assignment Change input Filed Not Found " + "\t" + e.getMessage());
        }
    }

    public void reviewAssignmentDetailsAndClickOnSubmit() throws Exception {

        try {
            personManagementPage.submitButton.click();
            WebDriverUtils.waitforElementTobeVisible(personManagementPage.confirmationYesButton);
            personManagementPage.confirmationYesButton.click();
            WebDriverUtils.waitforElementTobeVisible(personManagementPage.confirmationOkButton);
            personManagementPage.confirmationOkButton.click();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Failed to Click On Submit Button to Submit Assignment Change" + "\t" + e.getMessage());
        }
    }


    public void changeJOBNameandClickOnReviewButton() throws Exception {

        try {
            WebDriverUtils.jsSendKeys(personManagementPage.jobNameInputField, "Lead Project Specialist");
            WebDriverUtils.waitforelementToBeClickable(personManagementPage.personIdentifierReviewButton);
            personManagementPage.personIdentifierReviewButton.click();

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Failed to Enter JOB, Job Name Change input Filed Not Found " + "\t" + e.getMessage());
        }
    }


    public void changeLocationNameandClickOnReviewButton() throws Exception {

        try {
            WebDriverUtils.jsSendKeys(personManagementPage.locationNameInputField, "Florida");
            WebDriverUtils.waitforelementToBeClickable(personManagementPage.personIdentifierReviewButton);
            personManagementPage.personIdentifierReviewButton.click();

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Failed to Enter JOB, Job Name Change input Filed Not Found " + "\t" + e.getMessage());
        }
    }

    public void enterWorkingHoursAndClickOnReviewButton() throws Exception {
        try {

            WebDriverUtils.sendKeys(personManagementPage.startTimeInputField, "08:00");
            personManagementPage.startTimeAMPMdropdown.click();
            personManagementPage.timeZoneAM.click();
            Thread.sleep(2000);
            WebDriverUtils.sendKeys(personManagementPage.endTimeInputField, "09:00");
            personManagementPage.startTimeAMPMdropdown.click();
            personManagementPage.timeZonePM.click();
            personManagementPage.reportingEstablishmentdropdown.click();
            List<WebElement> list = personManagementPage.reportingEstablishmentInputFieldItems;
            CommonFunctions.SelectValueFromDropDown(list, "Atlanta");
            personManagementPage.personIdentifierReviewButton.click();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Failed To Entet the Employee Timing Hours " + "\t" + e.getMessage());
        }
    }

}

