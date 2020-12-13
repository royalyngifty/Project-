package com.it.code;

import com.it.pop.TestClass;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class Accessories extends TestClass {
    static JavascriptExecutor js;

    @When("User clicks on Accessories Category")
    public void userClicksOnAccessoriesCategory() {
        clickAccessories();
    }

    public void clickAccessories() {
        driver.findElement(By.xpath("//*[@id=\"category-6\"]")).click();
        String category ="ACCESSORIES";
        assertEquals(category,driver.findElement(By.xpath("//*[@id=\"left-column\"]/div[1]/ul/li[1]/a")).getText());
    }

    @Then("Accessories category products to be loaded")
    public void accessoriesCategoryProductsToBeLoaded() {
        String category = "ACCESSORIES";
        assertEquals(category, driver.findElement(By.xpath("//*[@id=\"js-product-list-header\"]/div/h1")).getText());
        tearDown();

    }

    @When("User selects {string}")
    public void userSelects(String locator) {
        ClickElementXpath(locator);
    }

    @Then("{string} should be applied")
    public void shouldBeApplied(String filter) {
        CompareTextFilter(filter);
        ClearFilter();
        tearDown();
    }
}
