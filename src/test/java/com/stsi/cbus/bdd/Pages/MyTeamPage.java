package com.stsi.cbus.bdd.Pages;

import com.stsi.cbus.bdd.BrowerControls.BasePageSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MyTeamPage extends BasePageSetup {

    public MyTeamPage() {

        PageFactory.initElements(webdriver, this);

    }

    private static String links = "//a[text()='%s']";
    private static String myTeamlinks = "//div[@title='%s']/child::a";
    private static String pageHeadders =  "//h1[text()='%s']";
    public  String labels =  "//label[text()='%s']";
    public  String employeeName =  "//h2[text()='Workers']/ancestor::table[1]/parent::div/following-sibling::div/descendant::tbody[1]/descendant::a[contains(text(),'%s')]";


    /********** Search Person Input Field *********/
    @FindBy(xpath = "//input[@placeholder='Search Person']")
    public WebElement searchPersonInputField;


    /********** Search Person Search icon *********/
    @FindBy(xpath = "//img[@title='Search']/parent::a")
    public WebElement searchPersonSearchIcon;

    /********** Overview Headder *********/
    @FindBy(xpath = "//h2[text()='Overview']")
    public WebElement overviewHeadder;

    /********** Actions Icon *********/
    @FindBy(xpath = "//h2[text()='Workers']/ancestor::table[1]/parent::div/following-sibling::div/descendant::tbody[1]/descendant::a[@title='Actions']")
    public WebElement actionsIcon;

    /********** Actions Items List *********/
    @FindBy(xpath = "//div[@class='AFPopupMenuPopup']/descendant::tr[@role='menuitem']/td[2]")
    public List<WebElement> actionItemsList;


    /********** Actions Menu popup *********/
    @FindBy(xpath = "//div[@class='AFPopupMenuPopup']")
    public WebElement actionMemupopup;

    /********** Assignment Options *********/
    @FindBy(xpath = "//span[text()='What info do you want to manage?']/ancestor::table/parent::div/following-sibling::div[2]/descendant::a")
    public List<WebElement> assignmentoptions;

    /********** Continue Button *********/
    @FindBy(xpath = "//a[@accesskey='u']")
    public WebElement continueButton;

    /********** Continue Button *********/
    @FindBy(xpath = "//td[text()='When and Why']")
    public WebElement whenAndWhyoption;

    /********** Continue Button *********/
    @FindBy(xpath = "//button[@title='Continue']")
    public WebElement continueassignmentsButton;

    /********** Ad Button *********/
    @FindBy(xpath = "//div[@title='Add']")
    public WebElement addButton;

    /********** Salary Totla *********/
    @FindBy(xpath = "//label[text()='New Salary']/ancestor::div[2]/descendant::span[1]")
    public WebElement totalSalaryprogressBar;

    /********** Salary Basics Dropdown*********/
    @FindBy(xpath = "//div[@class='AFDetectExpansion']/following-sibling::tbody/descendant::tr[3]/th")
    public WebElement salaryBasicsdropdownItem;



    /********** Salary Basics Input Field *********/
    @FindBy(xpath = "//span[@aria-label='Salary Basis']/input")
    public WebElement salaryBasicsInputField;


    /********** Salary Basics Input Field *********/
    @FindBy(xpath = "//td[text()='Salary']/ancestor::h1/following-sibling::div[1]/descendant::input[3]")
    public WebElement salaryAmountInputField;

    /********** Add Direct Reports Label*********/
    @FindBy(xpath = "//td[text()='Add Direct Reports']/ancestor::h1/following-sibling::div[1]/descendant::label[1]")
    public WebElement addDirectReportslabel;

    /********** Comments and Attachements comment text areal*********/
    @FindBy(xpath = "//label[text()='Comments']/parent::div/following-sibling::div/textarea")
    public WebElement comentsTextarea;

    /********** Submit Button*********/
    @FindBy(xpath = "//a[@accesskey='m']")
    public WebElement submitButton;



    public WebElement getwebElement(String str){
        String elementxpath = String.format(links,str);
        new WebDriverWait(webdriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementxpath)));
        return webdriver.findElement(By.xpath(elementxpath));
    }

    public WebElement getMyTeamwebElement(String str){
        String elementxpath = String.format(myTeamlinks,str);
        new WebDriverWait(webdriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementxpath)));
        return webdriver.findElement(By.xpath(elementxpath));
    }

    public WebElement getPageHeadderElement(String str){
        String elementxpath = String.format(pageHeadders,str);
        new WebDriverWait(webdriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementxpath)));
        return webdriver.findElement(By.xpath(elementxpath));
    }



}


