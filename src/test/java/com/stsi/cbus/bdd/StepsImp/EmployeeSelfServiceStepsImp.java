package com.stsi.cbus.bdd.StepsImp;

import com.stsi.cbus.bdd.BrowerControls.BasePageSetup;
import com.stsi.cbus.bdd.Pages.EmployeeSelfServicePage;
import com.stsi.cbus.bdd.Utils.CommonFunctions;
import com.stsi.cbus.bdd.Utils.WebDriverUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class EmployeeSelfServiceStepsImp extends BasePageSetup {

    public EmployeeSelfServicePage employeeSelfServicePage;

    public EmployeeSelfServiceStepsImp() {
        employeeSelfServicePage = new EmployeeSelfServicePage();
    }


    public void ClickOnGivenPersonalInfoIcon(String optionToSelect) throws Exception {

        try {
            WebElement personalInformationOption = WebDriverUtils.returnWebElement(employeeSelfServicePage.personalInfoIcon,optionToSelect);
            WebDriverUtils.waitforelementToBeClickable(personalInformationOption);
            Thread.sleep(3000);
            personalInformationOption.click();

        }catch (Exception e){
            e.printStackTrace();
            throw new Exception("Failed to click On " + optionToSelect +"Icon" + "\t" + e.getMessage());


        }


          }

    public void selectContactTypeOptiontoEdit(String optionToSelect) throws Exception {

        try {
            WebDriverUtils.waitforElementTobeVisible(employeeSelfServicePage.contactDetailsAddDropdown);
            Thread.sleep(2000);
            employeeSelfServicePage.contactDetailsAddDropdown.click();
            List<WebElement> contactUpdateItems = employeeSelfServicePage.contactDetailsDropdownItems;
            CommonFunctions.SelectValueFromDropDown(contactUpdateItems,optionToSelect);

        }catch (Exception e){
            e.printStackTrace();
            throw new Exception("Failed to Select Contact Type Option "+ "\t" + e.getMessage());
        }

    }


    public void selectemailTypeOption(String optionToSelect) throws Exception {

        try {
            WebDriverUtils.waitforElementTobeVisible(employeeSelfServicePage.emailTypeDropdown);
            Thread.sleep(2000);
            employeeSelfServicePage.emailTypeDropdown.click();
            List<WebElement> options = employeeSelfServicePage.TypeDropdownItems;
            CommonFunctions.SelectValueFromDropDown(options,optionToSelect);
        }catch (Exception e){
            e.printStackTrace();
            throw new Exception("Failed to Select Email Type Option "+ "\t" + e.getMessage());
        }

    }


    public void enterEmailIdAndClickOnSubmit() throws Exception {

        try {
            WebDriverUtils.waitforElementTobeVisible(employeeSelfServicePage.emailInputField);
            employeeSelfServicePage.emailInputField.sendKeys("AlbertHarris@CloudCbus.com");
            employeeSelfServicePage.submitButton.click();
        }catch (Exception e){
            e.printStackTrace();
            throw new Exception("Failed Enter Email id and CLick on Submit"+ "\t" + e.getMessage());
        }

    }


    public void enterContactDetailsAndClickOnSubmit() throws Exception {

        try {
            WebDriverUtils.waitforElementTobeVisible(employeeSelfServicePage.phoneNumberInputField);
            employeeSelfServicePage.phoneNumberInputField.sendKeys("9987674");
            employeeSelfServicePage.submitButton.click();
        }catch (Exception e){
            e.printStackTrace();
            throw new Exception("Failed Enter Email id and CLick on Submit"+ "\t" + e.getMessage());
        }

    }


    public void clickOnEditDemographicIcon() throws Exception {

        try {
            WebDriverUtils.waitforElementTobeVisible(employeeSelfServicePage.editDemographicInfoIcon);
            Thread.sleep(2000);
            WebDriverUtils.jsClick(employeeSelfServicePage.editDemographicInfoIcon);
        }catch (Exception e){
            e.printStackTrace();
            throw new Exception("Failed to Click on Edit Demographic Icon"+ "\t" + e.getMessage());
        }

    }

    public void changeMaritialStatusAndClickOnSubmit() throws Exception {

        try {
            WebDriverUtils.waitforElementTobeVisible(employeeSelfServicePage.maritialStatusDropDown);
            Thread.sleep(2000);
            employeeSelfServicePage.maritialStatusDropDown.click();
            CommonFunctions.SelectValueFromDropDown(employeeSelfServicePage.maritialStatusDropDownItems,"Widowed");

        }catch (Exception e){
            e.printStackTrace();
            throw new Exception("Failed Change the Maritial Details "+ "\t" + e.getMessage());
        }
    }

    public void ClickOnAddButton() throws Exception {

        try {

            WebDriverUtils.waitforElementTobeVisible(employeeSelfServicePage.addressAddButton);
            employeeSelfServicePage.addressAddButton.click();

        }catch (Exception e){
            e.printStackTrace();
            throw new Exception("Failed Change the Maritial Details "+ "\t" + e.getMessage());
        }
    }

    public void enterAddressDetailsAndClickOnSubmit() throws Exception {

        try {

            WebDriverUtils.waitforElementTobeVisible(employeeSelfServicePage.emailTypeDropdown);
            employeeSelfServicePage.emailTypeDropdown.click();
            List<WebElement> addressTypeItems = employeeSelfServicePage.TypeDropdownItems;
            CommonFunctions.SelectValueFromDropDown(addressTypeItems,"Home Address");
            WebDriverUtils.waitforelementToBeClickable(employeeSelfServicePage.addressLine1InputField);
            Actions actions = new Actions(webdriver);

            actions.moveToElement(employeeSelfServicePage.addressLine1InputField)
                    .click(employeeSelfServicePage.addressLine1InputField)
                    .sendKeys("california")
                    .sendKeys(Keys.TAB)
                    .sendKeys("california11")
                    .sendKeys(Keys.TAB)
                    .sendKeys("california11")
                    .build()
                    .perform();
            employeeSelfServicePage.zipCodedropdown.click();
            List<WebElement> zipCOdes = employeeSelfServicePage.zipCodedropdownItems;
            CommonFunctions.SelectValueFromDropDown(zipCOdes,"60093");
            WebDriverUtils.waitforelementToBeClickable(employeeSelfServicePage.submitButton);
            employeeSelfServicePage.submitButton.click();
        }catch (Exception e){
            e.printStackTrace();
            throw new Exception("Failed Change the Address Details "+ "\t" + e.getMessage());
        }
    }

    public void clickOnAddAssignedPropertyButton() throws Exception {

        try {

            WebDriverUtils.waitforElementTobeVisible(employeeSelfServicePage.assignedPropertyAddButton);
            employeeSelfServicePage.assignedPropertyAddButton.click();

        }catch (Exception e){
            e.printStackTrace();
            throw new Exception("Failed Click On Add Assigned Property Button  "+ "\t" + e.getMessage());
        }
    }

    public void enterAssignedPropertiesAndClickOnSubmit() throws Exception {

        try {

            WebDriverUtils.waitforElementTobeVisible(employeeSelfServicePage.assignedPropertyAddButton);
            employeeSelfServicePage.assignedPropertyAddButton.click();
            Actions actions =  new Actions(webdriver);

            actions.moveToElement(employeeSelfServicePage.issueDateInputField)
                    .click(employeeSelfServicePage.issueDateInputField)
                    .sendKeys("6/11/22")
                    .sendKeys(Keys.TAB)
                    .sendKeys("Tea Estate")
                    .sendKeys(Keys.TAB)
                    .sendKeys("Tea Estate Property")
                    .sendKeys(Keys.TAB)
                    .sendKeys("439879283")
                    .sendKeys(Keys.TAB)
                    .sendKeys("20000000")
                    .sendKeys(Keys.TAB)
                    .sendKeys(Keys.TAB)
                    .sendKeys("MR John Peter")
                    .build()
                    .perform();
                    employeeSelfServicePage.saveButton.click();
        }catch (Exception e){
            e.printStackTrace();
            throw new Exception("Failed to Enter Assigned Properties Details"+ "\t" + e.getMessage());
        }
    }
}
