package com.stsi.cbus.bdd.Pages;

import com.stsi.cbus.bdd.BrowerControls.BasePageSetup;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePageSetup {

    public LoginPage() {

        PageFactory.initElements(webdriver, this);

    }

    /********** User Name Field *********/
    @FindBy(xpath = "//input[@name='userid']")
    public WebElement userNamefld;

    /********** Password Field *********/
    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordField;

    /********** Sign In Button *********/
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    /********** Sign In Button *********/
    @FindBy(xpath = "//a[@id='forgotLink']")
    public WebElement forgotpasswordLink;


}
