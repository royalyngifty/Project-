package com.it.code;

import com.it.pop.TestClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilterCategories extends TestClass {
    static JavascriptExecutor js;

    @Given("User is on MyStore page")
    public void userIsOnMyStorePage() {
        setUp();
    }

    @And("user selects Clothes section")
    public void userSelectsClothesSection() {
        ClickElementXpath(clothesSection);
    }

    @When("user clicks on filter Woman in Categories")
    public void userSelectsWomenCategories() {
       // selectWomanCategory();
        ClickElementXpath(categoryWomen);
    }

    @When("user clicks on filter Men in Categories")
    public void userClicksOnFilterMenInCategories() {
        ClickElementXpath(categoryMen);
    }
    @When("user selects both filters")
    public void userSelectsBothFilters() {
        selectCategories();
    }

    @Then("both categories filters are shown as active")
    public void bothCategoriesFiltersAreShownAsActive() {

        waitForClearAllButtn();
        assertEquals(filterMen,driver.findElement(By.xpath("//section/section/div[2]/section/ul/li[1]")).getText());
        assertEquals(filterWomen,driver.findElement(By.xpath("//section/section/div[2]/section/ul/li[2]")).getText());

        assertEquals(category, driver.findElement(By.xpath("//*[@id=\"left-column\"]/div[1]/ul/li[1]/a")).getText());

  //      ClearFilter();
        tearDown();
    }

    @Then("Woman filter is shown as active")
    public void womanFilterIsShownAsActive() {
        CompareTextFilter("Categories: Women\n" +
                "\uE5CD");

        assertEquals(category, driver.findElement(By.xpath("//*[@id=\"left-column\"]/div[1]/ul/li[1]/a")).getText());

    //    ClearFilter();
        tearDown();
    }
    @Then("Men filter is shown as active")
    public void menFilterIsShownAsActive() {
        CompareTextFilter("Categories: Men\n" +
                "\uE5CD");

        assertEquals(category, driver.findElement(By.xpath("//*[@id=\"left-column\"]/div[1]/ul/li[1]/a")).getText());

    //    ClearFilter();
        tearDown();
    }
    @And("^user selects ([^\"]*) in Categories$")
    public void userSelectsValueInCategories(String filter) {
        selectOneCategory(filter);
        waitForClearAllButtn();
    }

    @Then("^([^\"]*) with query parameter is shown$")
    public void linkWithQueryParameterIsShown(String link) {
 //       assertEquals(link,driver.getCurrentUrl());
        verifyPage(link);
        tearDown();
    }

}
