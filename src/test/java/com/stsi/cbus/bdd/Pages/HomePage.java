package com.stsi.cbus.bdd.Pages;

import com.stsi.cbus.bdd.BrowerControls.BasePageSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage  extends BasePageSetup {


    public HomePage() {

        PageFactory.initElements(webdriver, this);

    }

    private static String links = "//a[text()='%s']";




    /********** Home Button *********/
    @FindBy(xpath = "//a[@title='Home']")
    public WebElement homeButton;



    public WebElement getmainTabWebElement(WebDriver driver, String str){

        return webdriver.findElement(By.xpath(String.format(links,str)));

    }


}
