package com.it.code;

import com.it.pop.TestClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilterCategories extends TestClass {
    static JavascriptExecutor js;

    @And("user selects Clothes section")
    public void userSelectsClothesSection() {
        ClickElementXpath("//*[@id=\"category-3\"]/a");
    }

    @When("user selects <value> in filter Categories")
    public void userSelectsValueInFilterCategories() {
    }

    @When("user selects both filters in Categories")
    public void userSelectsBothFiltersInCategories() {
        selectCategories();
    }

    @Then("both categories filters are shown as active")
    public void bothCategoriesFiltersAreShownAsActive() {
        CompareTextFilter("Categories: Men\n" +
                "\uE5CD");
        CompareTextFilter("Categories: Women\n" +
                "\uE5CD");

        String category = "CLOTHES";
        assertEquals(category, driver.findElement(By.xpath("//*[@id=\"left-column\"]/div[1]/ul/li[1]/a")).getText());

        ClearFilter();
        tearDown();
    }

}
