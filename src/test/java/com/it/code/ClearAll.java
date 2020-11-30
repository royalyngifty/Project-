package com.it.code;

import com.it.pop.TestClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ClearAll extends TestClass {


    @When("user clicks on Clear All button")
    public void userClicksOnClearAllButton() {
        removeClearAllUnderClothes();
    }

    @Then("^user is on ([^\"]*)$")
    public void userIsOnCorrectPage(String correctPage) {
        verifyPage(correctPage);
        tearDown();
    }


    @And("^user selects filters ([^\"]*) and ([^\"]*) from different sections$")
    public void userSelectsFiltersFilterAndFilterFromDifferentSections(String filter1, String filter2) {
        ClickElementXpath(filter1);
        waitForClearAllButtn();
        ClickElementXpath(filter2);
    }

    @And("^active filters ([^\"]*) and ([^\"]*) are shown$")
    public void activeFiltersActFilterAndActFilterAreShown(String actFilter1, String actFilter2) {
        waitForActiveFilter(actFilter1);
        waitForActiveFilter(actFilter2);
    }

    @And("filters under Clothes are removed")
    public void filtersUnderClothesAreRemoved() {
        waitToRemoveClearAll();
        verifyPage("http://40.76.27.113:8085/en/3-clothes");
    }
}
