package com.stsi.cbus.bdd.Pages;

import com.stsi.cbus.bdd.BrowerControls.BasePageSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static com.stsi.cbus.bdd.BrowerControls.BasePageSetup.webdriver;

public class NewPersonPage extends BasePageSetup {

    public NewPersonPage() {

        PageFactory.initElements(webdriver, this);

    }

    private static String links = "//a[text()='%s']";
    private static String dropdownItems = "//a[text()='%s']";
    private static String pageHeadders =  "//h1[text()='%s']";

    /********** Hire a Reason Input Field *********/
    @FindBy(xpath = "//label[text()='Hire Reason']/ancestor::tr[1]/child::td[2]/span/input")
    public WebElement hireReasoninputField;

    /********** Legal Employer list *********/
    @FindBy(xpath = "//div[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:0:pt1:pt_r1:0:SP1:selectOneChoice3::dropdownPopup::dropDownContent::db']/table/tbody/tr/td[1]")
    public List<WebElement> legalEmployerTypelist;


    /********** Legal Employer Dropdown *********/
    @FindBy(xpath = "//label[text()='Legal Employer']/ancestor::tr[1]/child::td[2]/span/input")
    public WebElement legalEmployertype;

    /********** Last Name Field*********/
    @FindBy(xpath = "//label[text()='Last Name']/ancestor::tr[1]/td[2]/input")
    public WebElement lastNameInputField;

    /********** Next Button *********/
    @FindBy(xpath = "//div[@title='Next']/a")
    public WebElement nextButton;

    /********** Last Name Field*********/
    @FindBy(xpath = "//label[text()='Address Line 1']/ancestor::tr[1]/td[2]/input")
    public WebElement addressLine1Field;

    /********** Zip Code Input Field *********/
    @FindBy(xpath = "//label[text()='ZIP Code']/ancestor::tr[1]/td[2]/span/input")
    public WebElement zipCodeInputField;


    /********** Bussiness Unit Input Field *********/
    @FindBy(xpath = "//label[text()='Business Unit']/ancestor::tr[1]/td[2]/span/input")
    public WebElement bussinessUnitInputField;

    /********** Matching Person Records Popup *********/
    @FindBy(xpath = "//div[text()='Matching Person Records']")
    public WebElement matchingPersonRecordspopup;



    /********** New Hire Submit Button *********/
    @FindBy(xpath = "//div[@title='Submit']/a")
    public WebElement newHireSubmitButton;

    /********** Warning Dialogue Box *********/
    @FindBy(xpath = "//div[text()='Warning']")
    public WebElement warningDialogueBox;

    /********** Warning Dialogue Box Yes Button *********/
    @FindBy(xpath = "//button[@accesskey='Y']")
    public WebElement warningDialogueBoxYesButton;

    /********** Confirmation Dialogue Box *********/
    @FindBy(xpath = "//div[text()='Confirmation']")
    public WebElement confirmationDialogueBox;

    /********** Confirmation Dialogue Box Ok Button *********/
    @FindBy(xpath = "//button[@accesskey='K']")
    public WebElement confirmationDialogueBoxOkButton;

    /********** Proposed Worker Type Dropdown *********/
    @FindBy(xpath = "//label[text()='Proposed Worker Type']/ancestor::tr[1]/child::td[2]/span/a")
    public WebElement praposedWorkertypedropdown;

    /********** Proposed Worker Type Value : Contingent worker *********/
    @FindBy(xpath = "//li[text()='Contingent worker']")
    public WebElement praposedWorkertypecontingentWorker;

    /********** Proposed Worker Type Value : Contingent worker *********/
    @FindBy(xpath = "//li[text()='Employee']")
    public WebElement praposedWorkertypeEmployee;






    public WebElement getwebElement(String str){
        String elementxpath = String.format(links,str);
        new WebDriverWait(webdriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementxpath)));
        return webdriver.findElement(By.xpath(elementxpath));
    }


    public WebElement getPageHeadderElement(String str){
        String elementxpath = String.format(pageHeadders,str);
        new WebDriverWait(webdriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementxpath)));
        return webdriver.findElement(By.xpath(elementxpath));
    }

    public WebElement selectvalueFromDropdown(String dropdownItems){
        return webdriver.findElement(By.xpath(String.format(links,dropdownItems)));
    }
}
