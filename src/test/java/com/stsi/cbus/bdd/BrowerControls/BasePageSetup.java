package com.stsi.cbus.bdd.BrowerControls;


import com.stsi.cbus.bdd.Pages.PageInitializer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public class BasePageSetup extends PageInitializer {
    public  static WebDriver  webdriver;

    public static void initialization(String browser) throws Exception {

        if (browser.equalsIgnoreCase("Chrome")) {

            System.setProperty("webdriver.chrome.driver", (System.getProperty("user.dir") + File.separator + "src/test/resources/Drivers/Chrome/chromedriver"));
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("start-maximized");
            chromeOptions.setAcceptInsecureCerts(true);
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
            desiredCapabilities.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, true);
            desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
            chromeOptions.merge(desiredCapabilities);
            webdriver = new ChromeDriver(chromeOptions);
            webdriver.manage().window().maximize();
            webdriver.manage().deleteAllCookies();
            webdriver.get("https://fa-eqne-dev13-saasfademo1.ds-fa.oraclepdemos.com");
            PageInitializer init = new PageInitializer();
            init.initializeAllPages();

        }else if(browser.equalsIgnoreCase("Firefox")){

            System.setProperty("webdriver.gecko.driver", (System.getProperty("user.dir") + File.separator +"src/test/resources/Drivers/Firefox/geckodriver"));
            webdriver = new FirefoxDriver();
            webdriver.manage().window().maximize();
            webdriver.manage().deleteAllCookies();

            PageInitializer init = new PageInitializer();
            init.initializeAllPages();
        }
    }


    public static void CloseBrowser(){
        //webdriver.quit();
    }
}