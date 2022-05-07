package com.stsi.cbus.bdd.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CommonFunctions {


    public static void SelectValueFromDropDown(WebDriver driver, List<WebElement> list, String ExpectedValue){

        for(int i=0; i<list.size(); i++){

            if(list.get(i).getText().trim().equals("Personal and Employment")){
                list.get(i).click();
                break;
            }
        }
    }
}
