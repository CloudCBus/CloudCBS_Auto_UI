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
    @FindBy(xpath = "//div[text()='No results found.']")
    public WebElement noSearchResultsMsg;

    /********** Actions Button *********/
    @FindBy(xpath = "//table[@summary='Search Results']/tbody/descendant::button")
    public WebElement actionsButton;

    /********** Actions List *********/
    @FindBy(xpath = "//div[@class='AFDetectExpansion']/following-sibling::tbody/descendant::table[2]/tbody/tr/td[2]")
    public List<WebElement> actionsList;

    /********** Person Management Search Headder*********/
    @FindBy(xpath = "//h1[text()='Person Management: Search']")
    public WebElement personManagementSearchHeadder;

    /********** Person Number  *********/
    @FindBy(xpath = "//table[@summary='Search Results']/tbody/descendant::span[4]")
    public WebElement personNumberResultField;


}

