package com.stsi.cbus.bdd.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.stsi.cbus.bdd.BrowerControls.BasePageSetup.webdriver;

public class EmployeeSelfServicePage {

    public EmployeeSelfServicePage() {

        PageFactory.initElements(webdriver, this);

    }

    public  String personalInfoIcon = "//span[text()='%s']/ancestor::a";


    /********** Contact Details Add Dropdown *********/
    @FindBy(xpath = "//h2[text()='Communication']/ancestor::table/descendant::div[@title='Add']")
    public WebElement contactDetailsAddDropdown;


    /********** Contact Details Add Dropdown Items *********/
    @FindBy(xpath = "//div[@class='AFPopupMenuPopup']/descendant::tr[@role='menuitem']/td[2]")
    public List<WebElement> contactDetailsDropdownItems;


    /********** Email Type DropDown *********/
    @FindBy(xpath = "//label[text()='Type']/ancestor::div[1]/following-sibling::div/descendant::input[1]")
    public WebElement emailTypeDropdown;

    /********** Email Type DropDown Items *********/
    @FindBy(xpath = "//div[@class='AFPopupMenuPopup']/descendant::li")
    public List<WebElement> TypeDropdownItems;


    /********** Email Input Field *********/
    @FindBy(xpath = "//label[text()='Email']/ancestor::div[1]/following-sibling::div/input")
    public WebElement emailInputField;

    /********** Submit Button *********/
    @FindBy(xpath = "//a[@accesskey='m']")
    public WebElement submitButton;

    /********** Phone Number Input Field *********/
    @FindBy(xpath = "//label[text()='Number']/ancestor::div[1]/following-sibling::div/descendant::input[1]")
    public WebElement phoneNumberInputField;

    /********** Edit Demographic Info Icon *********/
    @FindBy(xpath = "//a[@title='Edit Demographic Info']")
    public WebElement editDemographicInfoIcon;

    /********** Maritial Status Dropdown *********/
    @FindBy(xpath = "//label[text()='Marital Status']/ancestor::div[1]/following-sibling::div/descendant::input[1]")
    public WebElement maritialStatusDropDown;

    /********** Maritial Status Dropdown Items *********/
    @FindBy(xpath = "//div[@class='AFPopupMenuPopup']/descendant::li")
    public List<WebElement> maritialStatusDropDownItems;


    /********** Address Add Button *********/
    @FindBy(xpath = "//h2[text()='Address']/ancestor::table/descendant::div[@title='Add']")
    public WebElement addressAddButton;

    /********** Address Line1 Input Field *********/
    @FindBy(xpath = "//label[text()='Address Line 1']/ancestor::div[1]/following-sibling::div/descendant::input[1]")
    public WebElement addressLine1InputField;

    /********** Zip Code Dropdown Items *********/
    @FindBy(xpath = "//div[@class='AFPopupMenuPopup']/descendant::tr/th")
    public List<WebElement> zipCodedropdownItems;

    /********** Zip Code Dropdown *********/
    @FindBy(xpath = "//label[text()='ZIP Code']/ancestor::div[1]/following-sibling::div/descendant::input[2]")
    public WebElement zipCodedropdown;

    /********** Assigned Property Add Button *********/
    @FindBy(xpath = "//h2[text()='Assigned Property']/ancestor::table/descendant::div[@title='Add']")
    public WebElement assignedPropertyAddButton;

    /********** Issue Date Input Field *********/
    @FindBy(xpath = "//label[text()='Issue Date']/ancestor::div[1]/following-sibling::div/descendant::input[1]")
    public WebElement issueDateInputField;


    /********** Save Button *********/
    @FindBy(xpath = "//a[@accesskey='S']")
    public WebElement saveButton;




}
