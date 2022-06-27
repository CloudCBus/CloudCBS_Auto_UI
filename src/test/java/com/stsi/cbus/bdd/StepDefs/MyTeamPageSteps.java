package com.stsi.cbus.bdd.StepDefs;

import com.stsi.cbus.bdd.BrowerControls.BasePageSetup;
import com.stsi.cbus.bdd.Pages.MyTeamPage;
import com.stsi.cbus.bdd.Pages.NewPersonPage;
import com.stsi.cbus.bdd.StepsImp.MyTeamStepsImp;
import com.stsi.cbus.bdd.StepsImp.NewPersonStepsImp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class MyTeamPageSteps extends BasePageSetup {


    public MyTeamStepsImp myTeamStepsImp;
    public MyTeamPage myTeamPage;
    public MyTeamPageSteps(){
        myTeamStepsImp =  new MyTeamStepsImp();
        myTeamPage = new MyTeamPage();
    }

    @Then("I Search Person by the Person Name and Click on Search Icon")
    public void I_Search_Person_by_the_Person_Name_and_Click_on_Search_Icon() throws Exception {
        myTeamStepsImp.searchPersonByPersonNameAndClickOnSearchIcon();
    }

    @Then("I Click on {string} Cluster link Under My Team Section")
    public void I_Search_Person_by_the_Person_Name_and_Click_on_Search_Icon(String element) throws Exception {
        myTeamPage.getMyTeamwebElement(element).click();
    }



    @Then("I Click on {string} from the Actions List under Workers Sections")
    public void I_Click_on__from_the_Actions_List_under_Workers_Sections(String actionItem) throws Exception {
        myTeamStepsImp.selectActionItemFromListOfActions(actionItem);
    }


    @And("I Validate {string} Page is displayed for the Employee")
    public void I_Validate__Page_is_displayed_for_the_Employee(String header) throws Exception {
        myTeamStepsImp.validateHeadderpageisDisplayed(header);
    }

    @Then("I Click On all the Assignment Options and Click on Continue Button")
    public void  I_Click_On_all_the_Assignment_Options_and_Click_on_Continue_Button() throws Exception {
        myTeamStepsImp.selectAllAssignmentOptions();
    }

    @Then("I Enter the details in {string} details Pannel and Click on Continue")
    public void  I_Enter_the_details_in_details_Pannel_and_Click_on_Continue(String assignmentType) throws Exception {
        myTeamStepsImp.enterAssignmentDetails(assignmentType);
    }


    @Then("I Click on Submit Button to Submit the Candidate Assignement")
    public void  I_Click_on_Submit_Button_to_Submit_the_Candidate_Assignemtn() throws Exception {
        myTeamStepsImp.submitanAssignment();
    }

}
