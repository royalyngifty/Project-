package com.it.code;

import com.it.pop.TestClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

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
        selectColorBlack();
    }

    @Then("both color filters are shown as active")
    public void bothColorFiltersAreShownAsActive() {
        Assertions.assertTrue(waitForActiveFilter(filterColorWhite));
        Assertions.assertTrue(waitForActiveFilter(filterColorBlack));
        tearDown();
    }

    @Then("page with query parameter Men and black color is opened")
    public void pageWithQueryParameterMenAndBlackColorIsOpened() {
        Assertions.assertTrue(waitForActiveFilter(filterColorBlack));
        assertEquals(linkMenBlack,driver.getCurrentUrl());
        tearDown();
    }

    @Then("page with query parameter Men and colors is opened")
    public void pageWithQueryParameterMenAndColorsIsOpened() {
        Assertions.assertTrue(waitForActiveFilter(filterColorWhite));
        Assertions.assertTrue(waitForActiveFilter(filterColorBlack));
        assertEquals(linkMenWhiteBlack,driver.getCurrentUrl());
        tearDown();
    }
}
