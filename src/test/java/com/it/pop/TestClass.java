package com.it.pop;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class TestClass extends PageElements{
    @Test
    //Basic test to open IT University website and assert if Home page loaded successfully
    public void titleCheck(){

        CheckTitle("PrestShop");
    }

    @Test
    //Select Categories under Clothes section
    public void selectCategories(){

        ClickElementXpath(categoryMen);
        waitForClearAllButtn();
        ClickElementXpath(categoryWomen);

    }

    @Test
    //Select One under Clothes section
    public void selectOneCategory(String oneCategory){
        ClickElementXpath(oneCategory);
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
    }

}
