package com.stsi.cbus.bdd.StepDefs;

import com.stsi.cbus.bdd.BrowerControls.BasePageSetup;
import com.stsi.cbus.bdd.Pages.EmployeeSelfServicePage;
import com.stsi.cbus.bdd.StepsImp.EmployeeSelfServiceStepsImp;
import io.cucumber.java.en.Then;


public class EmployeeSelfServiceSteps extends BasePageSetup {


    public EmployeeSelfServiceStepsImp employeeSelfServiceStepsImp;
    public EmployeeSelfServicePage employeeSelfServicePage;
    public EmployeeSelfServiceSteps(){
        employeeSelfServiceStepsImp =  new EmployeeSelfServiceStepsImp();
        employeeSelfServicePage = new EmployeeSelfServicePage();
    }

    @Then("I Click on {string} Icon in Personal Info Page")
    public void I_Click_on_PersonInfo_Icons_in_Personal_Info_Page(String optionToSelect) throws Exception {
        employeeSelfServiceStepsImp.ClickOnGivenPersonalInfoIcon(optionToSelect);
    }

    @Then("I Click On Add Dropdown and Select {string} option")
    public void I_Click_On_Add_Dropdown_and_Select_option(String optionToSelect) throws Exception {
        employeeSelfServiceStepsImp.selectContactTypeOptiontoEdit(optionToSelect);
    }

    @Then("I Select {string} item From Contact Type DropDown")
    public void I_Select_item_From_Email_Type_DropDown(String optionToSelect) throws Exception {
        employeeSelfServiceStepsImp.selectemailTypeOption(optionToSelect);
    }

    @Then("I Enter Email Details and Click On Submit Button")
    public void I_Enter_Email_Details_and_Click_On_Submit_Button() throws Exception {
        employeeSelfServiceStepsImp.enterEmailIdAndClickOnSubmit();
    }

    @Then("I Enter Contact Details and Click On Submit Button")
    public void I_Enter_Contact_Details_and_Click_On_Submit_Button() throws Exception {
        employeeSelfServiceStepsImp.enterContactDetailsAndClickOnSubmit();
    }

    @Then("I Click On Edit Demographic Info Icon")
    public void I_Click_On_Edit_Demographic_Info_Icon() throws Exception {
        employeeSelfServiceStepsImp.clickOnEditDemographicIcon();
    }

    @Then("I change the Maritial status And Click On Submit Button")
    public void I_change_the_Maritial_status_And_Click_On_Submit_Button() throws Exception {
        employeeSelfServiceStepsImp.changeMaritialStatusAndClickOnSubmit();
    }

    @Then("I Click On Add Button to Add or change the Address")
    public void I_Click_On_Add_Button_to_add_or_change_the_Address() throws Exception {
        employeeSelfServiceStepsImp.ClickOnAddButton();
    }


    @Then("I Enter Address Details and Click On Submit Button")
    public void I_Enter_Address_Details_and_Click_On_Submit_Button() throws Exception {
        employeeSelfServiceStepsImp.enterAddressDetailsAndClickOnSubmit();
    }

    @Then("I Click On Add Assigned Property Buton to add property details")
    public void I_Click_On_Add_Assigned_Property_Buton_to_add_property_details() throws Exception {
        employeeSelfServiceStepsImp.clickOnAddAssignedPropertyButton();
    }

    @Then("I Enter Assigned Property Details and Click On Submit Button")
    public void I_Enter_Assigned_Property_Details_and_Click_On_Submit_Button() throws Exception {
        employeeSelfServiceStepsImp.enterAssignedPropertiesAndClickOnSubmit();
    }


}
