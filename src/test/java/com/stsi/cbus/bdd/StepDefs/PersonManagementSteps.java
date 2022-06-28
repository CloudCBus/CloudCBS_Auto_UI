package com.stsi.cbus.bdd.StepDefs;

import com.stsi.cbus.bdd.BrowerControls.BasePageSetup;
import com.stsi.cbus.bdd.Pages.HomePage;
import com.stsi.cbus.bdd.Pages.PersonManagementPage;
import com.stsi.cbus.bdd.StepsImp.HomePageStepsImp;
import com.stsi.cbus.bdd.StepsImp.PersonManagementStepsImp;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PersonManagementSteps extends BasePageSetup {

    public PersonManagementStepsImp personManagementStepsImp;
    public PersonManagementPage personManagementPage;
    public PersonManagementSteps(){
        personManagementStepsImp =  new PersonManagementStepsImp();
        personManagementPage = new PersonManagementPage();
    }

    @Then("I Verify Person Management Search Page is Displayed")
    public void validatePersonManagementSearchPage() throws Exception {
        new WebDriverWait(webdriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(personManagementPage.personManagementSearchHeadder));
        Assert.assertTrue(personManagementPage.personManagementSearchHeadder.isDisplayed());
        Assert.assertTrue(personManagementPage.personNameSearchField.isDisplayed());
        Assert.assertTrue(personManagementPage.personNumberSearchField.isDisplayed());
        System.out.println("++++++++++++++"+personManagementPage.personManagementSearchHeadder.isDisplayed());
    }

    @And("I Search Employee by Person Number and Click on Search Button")
    public void searchEmployeeByPersonNumberandClickOnSearchButton() throws Exception {

        personManagementStepsImp.searchEmployeeByPersonNumber();

    }

    @And("I Search Employee by Person Number Including terminated work Relationships")
    public void I_Search_Employee_by_Person_Number_Including_terminated_work_Relationships() throws Exception {

        personManagementStepsImp.searchEmployeeByPersonNumberIncludingTerminatedEmployees();

    }

    @Then("I Validate the Employee with Person Number is Displayed in the Search Results")
    public void I_Validate_the_Employee_with_Person_Number_is_Displayed() throws Exception {

        personManagementStepsImp.validatwPersonNumberisDisplayed();

    }

    @Then("I Click on the Actions Icon and Select {string} Action under {string} Section")
    public void I_Click_on_the_Actions_Icon_and_SelectWork_Relationship_Action_under_Personal_and_Employment(String action, String item) throws Exception {

        personManagementStepsImp.clickonActionsIconandSelectWorkRelationship(action, item);

    }

    @Then("I Validate Work Relationship page is displayed")
    public void I_Validate_Work_Relationship_page_is_displayed() throws Exception {

        personManagementStepsImp.validateworkRelationshipPageIsdisplayed();

    }

    @Then("I Select {string} Item in Actions Dropdown in WorkRelationship Page")
    public void I_Select_Item_in_Actions_Dropdown_in_WorkRelationship_Page(String actionsitem) throws Exception {

        personManagementStepsImp.selectRespectiveItemFromActionsList(actionsitem);

    }

    @Then("I Validate Terminate Work Relationship Page is Displayed")
    public void I_Validate_Terminate_Work_Relationship_Page_is_Displayed() throws Exception {

        try {
            new WebDriverWait(webdriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(personManagementPage.terminateWorkRelationshipheadder));
            Assert.assertTrue(personManagementPage.terminateWorkRelationshipheadder.isDisplayed());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Then("I Enter Termination Date and Review the Termination Process and Submit the Request")
    public void I_Enter_Termination_Date_and_Review_the_Termination_Process_and_Submit_the_Request() throws Exception {
        personManagementStepsImp.enterTerminationDetailsAndClickOnSubmit();
    }
    @Then("I Validate the Employee should not appear in the System anymore upon Employee Search")
    public void I_Validate_the_Employee_should_not_appear_in_the_System_anymore_upon_Employee_Search() throws Exception {

    }


    @Then("I Click Edit button and Select {string} Employement option from the dropdown")
    public void I_Enter_Termination_Date_and_Review_the_Termination_Process_and_Submit_the_Request(String EmployementEditOption) throws Exception {
        personManagementStepsImp.selectEmployementEditOption(EmployementEditOption);
    }


    @Then("I Select Action as {string} and Action Reason as {string} and Click on OK Button")
    public void I_Enter_Termination_Date_and_Review_the_Termination_Process_and_Submit_the_Request(String action, String actionReson) throws Exception {
        personManagementStepsImp.SelectActionReasonAndActionReason(action,actionReson );
    }
    @Then("I Click on Add Assignment Label and enter all the Mandatory fields and Click on Next Button")
    public void I_Click_on_Add_Assignment_Label_and_enter_all_the_Mandatory_fields() throws Exception {
        personManagementStepsImp.enterDetailsInAddAssignmentSection();
    }


    @Then("I Enter all Mandatory Details in the Compensation Section and Click on Next")
    public void I_Enter_all_Mandatory_Details_in_the_Compensation_Section_and_Click_on0_Next() throws Exception {
        personManagementStepsImp.enterDetailsInCompensationSectionAndCLickOnNext();
    }

    @Then("I Enter all Mandatory Details in the Roles Section and Click on Next")
    public void I_Enter_all_Mandatory_Details_in_the_Roles_Section_and_Click_on_Next() throws Exception {
        personManagementStepsImp.enterDetailsInRolesSectionAndCLickOnNext();
    }


    @Then("I Click On Submit Button to Sumbit the Secendory Assignment")
    public void I_Click_On_Submit_Button_to_Sumbit_the_Secendory_Assignment() throws Exception {
        personManagementStepsImp.clickOnSumbitButtonToSubmitTheAssignment();
    }


    @Then("I Enter Add Assignement Action Action Reason and Legal Employer and Click on Next")
    public void I_Enter_Add_Assignement_Action_Action_Reason_and_Legal_Employer_and_Click_on_Next(DataTable datatable) throws Exception {
        personManagementStepsImp.enterWorkRelationshipIdentificationFieldsAndClickOnNext(datatable);
    }

    @Then("I Enter below Person Identifier Details and Click on Submit Button")
    public void I_Enter_below_Person_Identifier_Details_and_Click_on_Submit_Button(DataTable datatable) throws Exception {
        personManagementStepsImp.enterPerrsonIdentifierDetailsAndClickOnSubmit(datatable);
    }

    @Then("I Enter all Employee Promotion Details and Click on Review Button")
    public void I_Enter_all_Employee_Promoton_Details_and_Click_on_Review_Button() throws Exception {
        personManagementStepsImp.enterEmployeePromotionDetailsAndClickOnReviewButton();
    }


    @Then("I Enter all Employee Demotion Details and Click on Review Button")
    public void I_Enter_all_Employee_Demotion_Details_and_Click_on_Review_Button() throws Exception {
        personManagementStepsImp.enterEmployeeDemotionDetailsAndClickOnReviewButton();
    }


    @Then("I Review the Demotion Details and Click on Submit Button")
    public void I_Review_the_Demotion_Details_and_Click_on_Submit_Button() throws Exception {
        personManagementStepsImp.reviewDemotionDetailsAndClicOnSubmit();
    }

    @Then("I change the Assignemt Name and Click on Review Button")
    public void I_change_the_Assignemt_Name_and_Click_on_Review_Button() throws Exception {
        personManagementStepsImp.changeAssignmentNameAndClickOnReviewButton();
    }

    @Then("I Review the Change Details and Click on Submit Button")
    public void I_Review_the_Assignment_Change_Details_and_Click_on_Submit_Button() throws Exception {
        personManagementStepsImp.reviewAssignmentDetailsAndClickOnSubmit();
    }

    @Then("I change the JOB Name and Click on Review Button")
    public void I_change_the_JOB_Name_and_Click_on_Review_Button() throws Exception {
        personManagementStepsImp.changeJOBNameandClickOnReviewButton();
    }


    @Then("I change the Location Name and Click on Review Button")
    public void I_change_the_Location_Name_and_Click_on_Review_Button() throws Exception {
        personManagementStepsImp.changeLocationNameandClickOnReviewButton();
    }

    @Then("I change the Employee Working Hours and Click on Review Button")
    public void I_change_the_Employee_Working_Hours_and_Click_on_Review_Button() throws Exception {
        personManagementStepsImp.enterWorkingHoursAndClickOnReviewButton();
    }

    @Then("I Click On Task Icon on Right hand Side of the Page and Select {string} Task")
    public void I_Click_On_Task_Icon_on_Right_hand_Side_of_the_Page_and_Select_Task(String task) throws Exception {
        personManagementStepsImp.ClcikOnTaskIconAndSelectREspectiveTask(task);
    }
}

