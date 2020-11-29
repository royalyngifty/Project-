package com.it.code;

import com.it.pop.TestClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilterColor extends TestClass {

    @When("user selects White color in filter Color")
    public void userSelectsWhiteColorInFilterColor() {
        selectClothesWhite();
    }

    @Then("White is active filter")
    public void whiteIsActiveFilter() {
        Assertions.assertTrue(waitForActiveFilter(filterColorWhite));

        tearDown();
    }

    @When("user selects Black color in filter Color")
    public void userSelectsBlackColorInFilterColor() {
        selectColorBlack();
    }

    @Then("Black is active filter")
    public void blackIsActiveFilter() {
        Assertions.assertTrue(waitForActiveFilter(filterColorBlack));

        tearDown();
    }

    @When("user selects both values in filter Color")
    public void userSelectsBothValuesInFilterColor() {
        selectClothesWhite();
        waitForClearAllButtn();
        //click Black color filter after white is applied
        ClickElementXpath("//section[2]/ul/li[2]/label/span/span");
    }

    @Then("both color filters are shown as active")
    public void bothColorFiltersAreShownAsActive() {
        waitForClearAllButtn();
        Assertions.assertTrue(waitForActiveFilter(filterColorWhite));

  //      blackIsActiveFilter();
        waitForActiveFilter("//section/section/div[2]/section/ul/li[2]");
 //       assertEquals("http://40.76.27.113:8085/en/3-clothes?q=Color-White-Black",driver.getCurrentUrl());
        tearDown();
    }

    @Then("page with query parameter Men and black color is opened")
    public void pageWithQueryParameterMenAndBlackColorIsOpened() {
        Assertions.assertTrue(waitForActiveFilter(filterColorBlack));
        assertEquals(linkMenBlack,driver.getCurrentUrl());
        tearDown();
    }

    @When("user selects Men link under Clothes section")
    public void userSelectsMenLinkUnderClothesSection() {
        ClickElementXpath(linkClothesMen);
    }

    @And("^user selects filter ([^\"]*) under Clothes Men$")
    public void userSelectsColorValueInFilterColor(String colorValue) {
        selectColorUnderClothesMen(colorValue);
    }

    @Then("^Clothes Men ([^\"]*) is opened with color query parameter$")
    public void genderpageIsOpened(String genderPage) {
        verifyPage(genderPage);
    }

    @And("^active filter ([^\"]*) is shown$")
    public void filterActiveValueIsShown(String activeValue) {
        Assertions.assertTrue(waitForActiveFilter(activeValue));
        tearDown();
    }

    @When("user selects both color values under Clothes section for page Men")
    public void userSelectsBothColorValuesUnderClothesSectionForPageMen() {
        //select White color under Clothes > Men
        ClickElementXpath("//section[2]/ul/li[1]/label/span/span");

        waitForClearAllButtn();
        //click Black color filter after white is applied
        ClickElementXpath("//section[2]/ul/li[2]/label/span/span");
        waitForClearAllButtn();
    }

    @Then("Clothes Men page is opened with two color parameters")
    public void clothesMenPageIsOpenedWithTwoColorQueryParameters() {
        waitForActiveFilter(filterColorBlack);
        waitForActiveFilter(filterColorWhite);
        tearDown();
    }

}
