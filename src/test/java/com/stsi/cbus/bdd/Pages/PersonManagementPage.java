package com.stsi.cbus.bdd.Pages;

import com.stsi.cbus.bdd.BrowerControls.BasePageSetup;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PersonManagementPage extends BasePageSetup {

    public PersonManagementPage() {

        PageFactory.initElements(webdriver, this);

    }


    public static String datetext = "//table[@style='position: relative;']/descendant::td[@role='gridcell' and text()='%s']";


    /********** Person Number Search Field *********/
    @FindBy(xpath = "//input[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAt1:0:pt1:Perso1:0:SP3:q1:value10::content']")
    public WebElement personNumberSearchField;


    /********** Person Name Search Field *********/
    @FindBy(xpath = "//input[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAt1:0:pt1:Perso1:0:SP3:q1:value00::content']")
    public WebElement personNameSearchField;

    /********** Search Button *********/
    @FindBy(xpath = "//button[text()='Search']")
    public WebElement searchButton;

    /********** Reset Button *********/
    @FindBy(xpath = "//button[text()='Reset']")
    public WebElement resetButton;

    /********** Save Button *********/
    @FindBy(xpath = "//button[text()='Save...']")
    public WebElement saveButton;

    /********** No Search Results Msg *********/
    @FindBy(xpath = "//div[text()='No data to display.']")
    public WebElement noSearchResultsMsg;

    /********** Actions Button *********/
    @FindBy(xpath = "//table[@summary='Search Results']/tbody/descendant::button")
    public WebElement actionsButton;

    /********** Actions Button *********/
    @FindBy(xpath = "//table[@summary='Search Results']")
    public WebElement personsearchResults;




    /********** Actions Button *********/
    @FindBy(xpath = "//table[@summary='Search Results']/tbody/descendant::button/parent::span/parent::td/following-sibling::td[5]/span")
    public WebElement userPersonType;

    /********** Actions List *********/
    @FindBy(xpath = "//div[@class='AFDetectExpansion']/following-sibling::tbody/descendant::table[2]/tbody/tr/td[2]")
    public List<WebElement> actionsList;

    /********** Actions List *********/
    @FindBy(xpath = "//div[@class='AFDetectExpansion']/following-sibling::tbody/descendant::table[2]")
    public WebElement actionsListpopup;


    /********** Person Management Search Headder*********/
    @FindBy(xpath = "//h1[text()='Person Management: Search']")
    public WebElement personManagementSearchHeadder;

    /********** Person Number  *********/
    @FindBy(xpath = "//button[@title='Actions']/parent::td/following-sibling::td[1]")
    public WebElement personNumberResultField;

    /********** Actions Dropdown key in Work Relationship Page  *********/
    @FindBy(xpath = "//a[@title='Actions']")
    public WebElement workRelationshipActionsDropdownkey;

    /********** Actions Dropdown Items in Work Relationship Page  *********/
    @FindBy(xpath = "//table[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAt1:0:pt1:r1:0:pt1:SP1:menu1::ScrollContent']/tbody/tr/td[2]")
    public List<WebElement> workRelationshipActionsDropdownitems;

    /********** Work Relationship Page Headder  *********/
    @FindBy(xpath = "//h1[contains(text(),'Work Relationship:')]")
    public WebElement workRelationshipPageHeadder;


    /********** Terminate Work Relationship Page Headder  *********/
    @FindBy(xpath = "//h1[text()='Terminate Work Relationship']")
    public WebElement terminateWorkRelationshipheadder;

    /********** Termination Date Input Field  *********/
    @FindBy(xpath = "//label[text()='Termination Date']/parent::td/following-sibling::td/input[1]")
    public WebElement terminationDateInputField;

    /********** Review Button  *********/
    @FindBy(xpath = "//button[text()='Review']")
    public WebElement reviewButton;


    /********** Warning Dialogue Box Yes Button *********/
    @FindBy(xpath = "//button[text()='Yes']")
    public WebElement warningDialogueBoxYesButton;


    /********** Submit Button *********/
    @FindBy(xpath = "//div[@title='Submit']/a")
    public WebElement submitbutton;

    /********** Confirmation Yes Button *********/
    @FindBy(xpath = "//button[@accesskey='Y']")
    public WebElement confirmationYesButton;


    /********** Confirmation Message Dialogue Box *********/
    @FindBy(xpath = "//div[text()='Confirmation']")
    public WebElement confirmationdialoguebox;

    /********** Confirmation Ok Button *********/
    @FindBy(xpath = "//button[@accesskey='K']")
    public WebElement confirmationOkButton;


    /********** Edit Employement Dropdown *********/
    @FindBy(xpath = "//span[text()='Edit']/parent::a")
    public WebElement editEmployementDropdown;

    /********** Edit Employement Dropdown Items *********/
    @FindBy(xpath = "//div[@class='AFPopupMenuContent']/descendant::tr[@role='menuitem']/td[2]")
    public List<WebElement> editEmployementDropdownitems;

    /********** Update Employement Popuop *********/
    @FindBy(xpath = "//div[text()='Update Employment']")
    public WebElement updateEmployementpopup;

    /********** Actions Dropdown In update Employement Popup*********/
    @FindBy(xpath = "//label[text()='Action']/parent::td/following-sibling::td/descendant::a")
    public WebElement actionDropdownKey;


    /********** Actions Dropdown Items update Employement Popup*********/
    @FindBy(xpath = "//div[@class='AFPopupMenuContent']/descendant::li")
    public List<WebElement> actionDropdownItems;


    /********** Actions Reason Dropdown In update Employement Popup*********/
    @FindBy(xpath = "//label[text()='Action Reason']/parent::td/following-sibling::td/descendant::a")
    public WebElement actionReasonDropdownKey;

    /********** Actions Reason Dropdown Items update Employement Popup*********/
    @FindBy(xpath = "//div[@class='AFPopupMenuContent']/descendant::li")
    public List<WebElement> actionReasonDropdownItems;


    /********** Business Unit*********/
    @FindBy(xpath = "//label[text()='Business Unit']/ancestor::td[1]/following-sibling::td/descendant::input")
    public WebElement businessUnitInputField;

    /********** Reporting Establishment Input Field*********/
    @FindBy(xpath = "//label[text()='Reporting Establishment']/ancestor::td[1]/following-sibling::td/descendant::input[1]")
    public WebElement reportingEstablishmentdropdown;

    /********** Reporting Establishment Input Field*********/
    @FindBy(xpath = "//div[@class='AFPopupMenuContent']/descendant::li")
    public List<WebElement> reportingEstablishmentInputFieldItems;

    /********** Assignment New Label*********/
    @FindBy(xpath = "//html[1]/body[1]/descendant::a[text()='Assignment: New'][1]")
    public WebElement assignmentNewLabel;

    /********** payroll New Label*********/
    @FindBy(xpath = "//html[1]/body[1]/descendant::a[text()='Payroll'][1]")
    public List<WebElement> payrolllabel;

    /********** Bussiness Unit Input Field *********/
    @FindBy(xpath = "//label[text()='Business Unit']/ancestor::tr[1]/td[2]/span/input")
    public WebElement bussinessUnitInputField;


    /********** Next Button *********/
    @FindBy(xpath = "//a[@accesskey='x']")
    public WebElement nextButton;

    /********** Submit Button *********/
    @FindBy(xpath = "//a[@accesskey='m']")
    public WebElement submitButton;

    /********** contingent Worker Assignemnt Action *********/
    @FindBy(xpath = "//label[text()='Action']/ancestor::td[1]/following-sibling::td/span/input")
    public WebElement contingentWorkerAddAssignmentActionsDropdownkey;

    /********** contingent Worker Assignemnt Action Items*********/
    @FindBy(xpath = "//div[@class='AFPopupMenuPopup']/descendant::li")
    public List<WebElement> contingentWorkerAddAssignmentActionsDropdownitems;

    /********** contingent Worker Assignemnt Action Reason *********/
    @FindBy(xpath = "//label[text()='Action Reason']/ancestor::td[1]/following-sibling::td/span/input")
    public WebElement contingentWorkerAddAssignmentActionsReasonDropdownkey;

    /********** contingent Worker Assignemnt Action Reason *********/
    @FindBy(xpath = "//div[@class='AFPopupMenuContent']/descendant::li")
    public List<WebElement> contingentWorkerAddAssignmentActionsReasonDropdownitems;


    /********** Legal Employer Dropdown *********/
    @FindBy(xpath = "//label[text()='Legal Employer']/ancestor::tr[1]/child::td[2]/span/input")
    public WebElement legalEmployertype;

    /********** Person Identifier Add Button *********/
    @FindBy(xpath = "//img[@title='Add Row']/parent::a")
    public WebElement personIdentifierAddButton;

    /********** Person Identifier Type *********/
    @FindBy(xpath = "//table[@summary='Person Identifiers for External Applications']/descendant::input[1]")
    public WebElement personIdentifierType;

    /********** Person Identifier items *********/
    @FindBy(xpath = "//div[@class='AFPopupMenuPopup']/descendant::li")
    public List<WebElement> personIdentifierItems;


    /********** Identifier *********/
    @FindBy(xpath = "//table[@summary='Person Identifiers for External Applications']/descendant::td[@title='Identifier'][1]/descendant::input")
    public WebElement identifier;

    /********** From Date *********/
    @FindBy(xpath = "//table[@summary='Person Identifiers for External Applications']/descendant::a[@title='Select Date and Time'][1]")
    public WebElement fromDateInputField;

    /********** To Date *********/
    @FindBy(xpath = "//table[@summary='Person Identifiers for External Applications']/descendant::a[@title='Select Date and Time'][2]")
    public WebElement toDateInputField;

    /********** Identifier Review Button *********/
    @FindBy(xpath = "//span[text()='Review']")
    public WebElement personIdentifierReviewButton;


    /********** Next month button *********/
    @FindBy(xpath = "//table[@style='position: relative;']/descendant::a[@title='Next Month']")
    public WebElement selectnextMonthButton;

    /********** Identifier Ok Button *********/
    @FindBy(xpath = "//table[@style='position: relative;']/descendant::button[text()='OK']")
    public WebElement okButton;

    /********** Employee Demotion Review Button *********/
    @FindBy(xpath = "//div[@title='Review']")
    public WebElement demotionReviewButton;


    /********** Assignment Name Input Field *********/
    @FindBy(xpath = "//label[text()='Assignment Name']/parent::td/following-sibling::td/input")
    public WebElement assignmentNameInputField;

    /********** Job Name Input Field *********/
    @FindBy(xpath = "//div[@class='AFDetectExpansion']/following-sibling::div[2]/descendant::label[text()='Job'][1]/parent::td/following-sibling::td/descendant::input")
    public WebElement jobNameInputField;

    /********** Job Name Input Field *********/
    @FindBy(xpath = "//div[@class='AFDetectExpansion']/following-sibling::div[2]/descendant::label[text()='Location'][1]/parent::td/following-sibling::td/descendant::input")
    public WebElement locationNameInputField;

    /********** Job Name Input Field *********/
    @FindBy(xpath = "//div[@class='AFDetectExpansion']/following-sibling::div[2]/descendant::label[text()='Position'][1]/parent::td/following-sibling::td/descendant::input")
    public WebElement positionInputField;

    /********** Start Time Input Field *********/
    @FindBy(xpath = "//input[@aria-label='Start Time']")
    public WebElement startTimeInputField;

    /********** End Time Input Field *********/
    @FindBy(xpath = "//input[@aria-label='End Time']")
    public WebElement endTimeInputField;


    /********** Time Zone AM *********/
    @FindBy(xpath = "//div[@class='AFPopupMenuContent']/descendant::li[text()='AM']")
    public WebElement timeZoneAM;

    /********** Time Zone PM *********/
    @FindBy(xpath = "//div[@class='AFPopupMenuContent']/descendant::li[text()='PM']")
    public WebElement timeZonePM;

    /********** End Time AM PM Dropdown*********/
    @FindBy(xpath = "//input[@aria-label='End Time']/ancestor::td[1]/following-sibling::td/descendant::input[1]")
    public WebElement endTimeAMPMdropdown;

    /********** End Time AM PM Dropdown*********/
    @FindBy(xpath = "//input[@aria-label='Start Time']/ancestor::td[1]/following-sibling::td/descendant::input[1]")
    public WebElement startTimeAMPMdropdown;

    /********** Extra Information Link *********/
    @FindBy(xpath = "//div[@title='Disabilities']/ancestor::table[3]/descendant::a[text()='Extra Information'][1]")
    public WebElement extraInformationLink;

    /********** India Miscellaneous Information Link *********/
    @FindBy(xpath = "//a[text()='India Miscellaneous Information']")
    public WebElement indiaMiscellaneousInformation;

    /********** person Extra Information Edit Dropdown *********/
    @FindBy(xpath = "//a[@title='Edit']")
    public WebElement personExtraInformationEditDropdown;


    /********** person Extra Information Edit Dropdown *********/
    @FindBy(xpath = "//td[text()='Update']")
    public WebElement personExtraInformationEditDropdownUpdateItem;

    /********** Update Extra Information Effective Start Date Input Field *********/
    @FindBy(xpath = "//label[text()='Effective Start Date']/ancestor::td/descendant::input[1]")
    public WebElement updateInformationEffectiveStartDateInputField;

   // confirmationOkButton


}

