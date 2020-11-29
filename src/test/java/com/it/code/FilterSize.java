package com.it.code;

import com.it.pop.TestClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilterSize extends TestClass {
    @When("^user selects two filters ([^\"]*) and ([^\"]*) under Categories Size page$")
    public void userSelectsTwoFiltersFilterAndFilterUnderCategoriesSizePage(String filter1, String filter2) {
        ClickElementXpath(filter1);
        waitForClearAllButtn();
        ClickElementXpath(filter2);

    }

    @Then("^([^\"]*) and active filters ([^\"]*) and ([^\"]*) are shown$")
    public void linkWithTwoQueryParameterIsShown(String link, String actFilter1, String actFilter2) {
        waitForActiveFilter(actFilter1);
        waitForActiveFilter(actFilter2);
        verifyPage(link);
        tearDown();
    }

    @When("user selects Women link under Clothes section")
    public void userSelectsWomenLinkUnderClothesSection() {
        ClickElementXpath(linkClothesWomen);
    }

}
