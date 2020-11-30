package com.it.code;

import com.it.pop.TestClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinksInClothesSection extends TestClass {
    static JavascriptExecutor js;

    @Then("Clothes section is shown")
    public void clothesSectionIsShown() {
        //verify text header in section Clothes
        assertEquals(category, driver.findElement(By.xpath("//*[@id=\"js-product-list-header\"]/div/h1")).getText());
        //verify link when Clothes is selected
        assertEquals(linkClothes,driver.getCurrentUrl());
        tearDown();
    }

    @When("selects link Men under Clothes section")
    public void selectsMenLinkUnderClothesSection() {
        ClickElementXpath("//*[@id=\"left-column\"]/div[1]/ul/li[2]/ul/li[1]/a");
    }

    @Then("page with query parameter Men is opened")
    public void pageWithQueryParameterMenIsOpened() {
        assertEquals(linkMen,driver.getCurrentUrl());
        tearDown();

    }

    @When("selects link Women under Clothes section")
    public void selectsWoMenLinkUnderClothesSection() {
        ClickElementXpath("//*[@id=\"left-column\"]/div[1]/ul/li[2]/ul/li[2]/a");
    }

    @Then("page with query parameter Women is opened")
    public void pageWithQueryParameterWoMenIsOpened() {
        assertEquals(linkWomen,driver.getCurrentUrl());
        tearDown();

    }

}
