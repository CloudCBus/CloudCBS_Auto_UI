package com.stsi.cbus.bdd.StepDefs;

import com.stsi.cbus.bdd.BrowerControls.BasePageSetup;
import com.stsi.cbus.bdd.Pages.NewPersonPage;
import com.stsi.cbus.bdd.Pages.PersonManagementPage;
import com.stsi.cbus.bdd.StepsImp.NewPersonStepsImp;
import com.stsi.cbus.bdd.StepsImp.PersonManagementStepsImp;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NewPersonSteps extends BasePageSetup {

    public NewPersonStepsImp newPersonStepsImp;
    public NewPersonPage newPersonPage;
    public NewPersonSteps(){
        newPersonStepsImp =  new NewPersonStepsImp();
        newPersonPage = new NewPersonPage();
    }

    @Then("I Click On {string} Icon under New Person Page")
    public void I_Click_On_Icon_under_New_Person_Page(String element) throws Exception {
        newPersonStepsImp.clickOnHireType(element);
    }


    @Then("I Validate the Page with {string} header is Displayed")
    public void I_Validate_a_Page_with_header_is_Displayed(String element) throws Exception {
        newPersonStepsImp.validatePageHeadderIsDisplayed(element);
    }




    @Then("I Enter Employee details in the {string} Identification Section and Click on Next")
    public void I_Enter_all_Employee_details_in_the_Identification_Section(String workerType) throws Exception {
        newPersonStepsImp.enterEmployeeDetailsInIdentificationSection(workerType);
    }


    @Then("I Enter all Employee details in the Person Information Section and Click on Next Button")
    public void I_Enter_all_Employee_details_in_the_Person_Information_Section_and_Click_on_Next_Button() throws Exception {
        newPersonStepsImp.enterPersonInformationDetailstoHireAnEmployee();
    }


    @Then("I Enter all Employee details in the Employment Information Section and Click on Next Button")
    public void I_Enter_all_Employee_detailsin_Employment_Information_Section_and_Click_on_Next_Button() throws Exception {
        newPersonStepsImp.enterEmployementDetails();
    }


    @Then("I Enter all Employee Compensation details in Compensation Section and Click on Next Button")
    public void I_Enter_all_Employee_Compensation_details_and_Click_on_Next_Button() throws Exception {
        newPersonStepsImp.enterEmployeeCompensationDetails();
    }

    @Then("I Validate Hire Employee Information Review Page is Displayed")
    public void I_Validate_Hire_Employee_Information_Review_Page_is_Displayed() throws Exception {
        newPersonStepsImp.enterEmployeeCompensationDetails();
    }
    @Then("I Click on Submit Button to Submit the New Hire Employee Request")
    public void I_Click_on_Submit_Button_to_Submit_the_New_Hire_Employee_Request() throws Exception {
        newPersonStepsImp.submitTheNewHireEmployeeRequest();
    }

    @Then("I Enter Person Profile Details and Click on Next Button")
    public void I_Enter_Person_Profile_Details_and_Click_on_Next_Button() throws Exception {
        newPersonStepsImp.enterpersonProfileDetailsAndClickOnNext();
    }



}
