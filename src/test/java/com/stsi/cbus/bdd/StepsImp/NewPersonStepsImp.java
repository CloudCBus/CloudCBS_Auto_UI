package com.stsi.cbus.bdd.StepsImp;

import com.stsi.cbus.bdd.BrowerControls.BasePageSetup;
import com.stsi.cbus.bdd.Pages.NewPersonPage;
import com.stsi.cbus.bdd.Pages.PersonManagementPage;
import com.stsi.cbus.bdd.Utils.CommonFunctions;
import com.stsi.cbus.bdd.Utils.WebDriverUtils;
import org.junit.Assert;
import org.junit.internal.runners.statements.Fail;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;
import java.time.Duration;
import java.util.List;

import static org.junit.Assert.fail;

public class NewPersonStepsImp extends BasePageSetup {

    public NewPersonPage newPersonPage;

    public NewPersonStepsImp() {
        newPersonPage = new NewPersonPage();
    }


    public void clickOnHireType(String element) throws Exception {
        try {
            Thread.sleep(5000);
            WebElement headder = newPersonPage.getwebElement(element);
            new WebDriverWait(webdriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(headder));
            newPersonPage.getwebElement(element).click();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Unable to Click on Hire an Employee Icon. " + "\t" + e.getMessage());
        }
    }


    public void validatePageHeadderIsDisplayed(String header) throws Exception {
        try {
             Assert.assertTrue(newPersonPage.getPageHeadderElement(header).isDisplayed());
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Cannot Load the Add a Contingent Worker Identification Page " + "\t" + e.getMessage());
        }
    }



    public void enterEmployeeDetailsInIdentificationSection(String workerType) throws Exception {
        try {
            new WebDriverWait(webdriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(newPersonPage.legalEmployertype));
            JavascriptExecutor js = (JavascriptExecutor) webdriver;
            js.executeScript("arguments[0].value='US1 Legal Entity'", newPersonPage.legalEmployertype);
            Thread.sleep(1000);
            if(workerType.equals("Add Pending Worker")){
                newPersonPage.praposedWorkertypedropdown.click();
                newPersonPage.praposedWorkertypeEmployee.click();
            }
            js.executeScript("arguments[0].value='Simon Xiao Xiea'", newPersonPage.lastNameInputField);
            Thread.sleep(3000);
            js.executeScript("arguments[0].click();", newPersonPage.nextButton);

            try {
                new WebDriverWait(webdriver, Duration.ofSeconds(25)).until(ExpectedConditions.visibilityOf(newPersonPage.matchingPersonRecordspopup));
                if (newPersonPage.matchingPersonRecordspopup.isDisplayed()) {
                    fail("The Employee with the Provided Employee Name Already Exists..!!! Please change the employee name and try Again..!! ");
                }
            } catch (Exception e) {
                System.out.println("Continue Execution....!!!!");
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Failed to enter Details in Employee Identification Page " + "\t" + e.getMessage());
        }
    }



    public void enterPersonInformationDetailstoHireAnEmployee() throws Exception {
        try {

            JavascriptExecutor js = (JavascriptExecutor) webdriver;
            js.executeScript("arguments[0].value='California'", newPersonPage.addressLine1Field);
            js.executeScript("arguments[0].value='96162'", newPersonPage.zipCodeInputField);
            new WebDriverWait(webdriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(newPersonPage.nextButton));
            newPersonPage.nextButton.click();

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Failed To Enter the Employee Person Details under Hire New Employee" + "\t" + e.getMessage());
        }
    }



    public void enterEmployementDetails() throws Exception {
        try {

            JavascriptExecutor js = (JavascriptExecutor) webdriver;
            js.executeScript("arguments[0].value='US1 Business Unit'", newPersonPage.bussinessUnitInputField);
            new WebDriverWait(webdriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(newPersonPage.nextButton));
            Thread.sleep(3000);
            newPersonPage.nextButton.click();

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Failed To Enter the Employee Person Details under Hire New Employee" + "\t" + e.getMessage());
        }
    }



    public void enterEmployeeCompensationDetails() throws Exception {
        try {

            JavascriptExecutor js = (JavascriptExecutor) webdriver;
            //  js.executeScript("arguments[0].value='US1 Business Unit'", newPersonPage.bussinessUnitInputField);

            new WebDriverWait(webdriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(newPersonPage.nextButton));
            newPersonPage.nextButton.click();

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Failed To Enter Employee Compensation Details " + "\t" + e.getMessage());
        }
    }


    public void enterpersonProfileDetailsAndClickOnNext() throws Exception {
        try {

            new WebDriverWait(webdriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(newPersonPage.nextButton));
            newPersonPage.nextButton.click();

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Failed To Enter Person Profile Details " + "\t" + e.getMessage());
        }
    }


    public void submitTheNewHireEmployeeRequest() throws Exception {
        try {

            new WebDriverWait(webdriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(newPersonPage.newHireSubmitButton));
            Thread.sleep(3000);
            newPersonPage.newHireSubmitButton.click();
            new WebDriverWait(webdriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(newPersonPage.warningDialogueBox));
            newPersonPage.warningDialogueBoxYesButton.click();
            new WebDriverWait(webdriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(newPersonPage.confirmationDialogueBox));
            newPersonPage.confirmationDialogueBoxOkButton.click();


        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Failed Submit the New Hire Employee Request " + "\t" + e.getMessage());
        }
    }





}


