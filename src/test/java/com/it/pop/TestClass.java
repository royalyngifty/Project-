package com.it.pop;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class TestClass extends PageElements{
    @Test
    //Basic test to open IT University website and assert if Home page loaded successfully
    public void titleCheck(){

        CheckTitle("PrestShop");
    }

    //Select Categories under Clothes section
    public void selectCategories(){
        driver.findElement(By.xpath("/html/body/main/section/div/div[1]/div[2]/div[2]/section[1]/ul/li[1]/label/span/span")).click();
        driver.findElement(By.xpath("/html/body/main/section/div/div[1]/div[2]/div[2]/section[1]/ul/li[2]/label/span/span")).click();
    }


}
