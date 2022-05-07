package com.stsi.cbus.bdd.BrowerControls;


import com.stsi.cbus.bdd.Pages.PageInitializer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public class BasePageSetup extends PageInitializer {
    public  static WebDriver  webdriver;

    public static void initialization() throws Exception{

        System.setProperty("webdriver.chrome.driver", (System.getProperty("user.dir")+ File.separator + "src/test/resources/Drivers/chromedriverNew"));
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.setAcceptInsecureCerts(true);
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
        desiredCapabilities.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT,true);
        desiredCapabilities.setCapability(ChromeOptions.CAPABILITY,chromeOptions); // Adding options to capabilities
        chromeOptions.merge(desiredCapabilities); //Merging all capabilities into options
        webdriver = new ChromeDriver(chromeOptions);

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