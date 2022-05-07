package com.stsi.cbus.bdd.BrowerControls;


import com.stsi.cbus.bdd.Pages.PageInitializer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class BasePageSetup extends PageInitializer {
    public  static WebDriver  webdriver;

    public static void initialization() throws Exception{

        System.setProperty("webdriver.chrome.driver", (System.getProperty("user.dir")+ File.separator + "src/test/resources/Drivers/chromedriver"));
        webdriver = new ChromeDriver();
        webdriver.manage().window().maximize();
        webdriver.manage().deleteAllCookies();
        webdriver.get("https://fa-eqne-dev13-saasfademo1.ds-fa.oraclepdemos.com");
        PageInitializer init = new PageInitializer();
        init.initializeAllPages();

    }

    public static void CloseBrowser(){
        webdriver.quit();
    }
}