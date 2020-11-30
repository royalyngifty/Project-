package com.it.pop;
import org.junit.jupiter.api.Assertions;
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
    public void goToClothesSection(){
        driver.navigate().to(homePage);
        ClickElementXpath(clothesSection);
        assertEquals(linkClothes,driver.getCurrentUrl());
    }

    @Test
    //Select Categories under Clothes section
    public void selectCategories(){
        goToClothesSection();
        ClickElementXpath(categoryMen);
        waitForClearAllButtn();
        ClickElementXpath(categoryWomen);

    }
     @Test
     //Select color White under Clothes
     public void selectClothesWhite() {
         goToClothesSection();
         //select white filter
         ClickElementXpath(clothesWhite);
         Assertions.assertTrue(waitForActiveFilter(filterColorWhite));
         assertEquals("http://40.76.27.113:8085/en/3-clothes?q=Color-White",driver.getCurrentUrl());
     }

    @Test
    //Select color Black under Clothes
    public void selectClothesBlack() {
        goToClothesSection();
        //select white filter
        ClickElementXpath(clothesBlack);
        waitForClearAllButtn();
        Assertions.assertTrue(waitForActiveFilter(filterColorBlack));
        assertEquals("http://40.76.27.113:8085/en/3-clothes?q=Color-Black",driver.getCurrentUrl());
    }

    @Test
    //Select color Black
    public void selectColorBlack(){
        goToClothesSection();
        //select white filter
        ClickElementXpath(colorBlack);
    }

    //Select One under Clothes section
    public void selectOneCategory(String oneCategory){
 //       goToClothesSection();
        ClickElementXpath(oneCategory);
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
    }

    @Test
    public void selectColorUnderClothesMen(String menClothesColor){
        ClickElementXpath(menClothesColor);
        waitForClearAllButtn();
    }


    @Test
    public void removeClearAllUnderClothes(){
        ClickElementXpath(clrAllBttn);
        waitToRemoveClearAll();
    }

    @Test
    public void verifyPage(String linkUnderTest){
        assertEquals(linkUnderTest, driver.getCurrentUrl());
    }
}
