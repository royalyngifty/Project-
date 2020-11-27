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

public class AllSteps extends TestClass {
    static JavascriptExecutor js;


    @Given("^User is on the homepage$")
    public void openHome(){
        setUp();
        assertEquals("PrestShop",driver.getTitle());
    }

    @When("^User clicks on Art Category$")
    public void artCategory(){
        clickArt();

    }
    @And("^User clicks on Art Category Link$")
    public void artCategoryClick(){
        clickArt();
    }

    public void clickArt() {
        driver.findElement(By.xpath("//a[contains(text(),'Art')]")).click();
        String category ="ART";
        assertEquals(category,driver.findElement(By.xpath("//div[@id='left-column']/div/ul/li")).getText());

    }

    @Then("^Art category products to be loaded$")
    public void assert_art_category(){
        String category = "ART";
        assertEquals(category, driver.findElement(By.xpath("//div[@id='left-column']/div/ul/li")).getText());
        tearDown();
    }


    @When("^User selects filter by Composition$")
    public void select_composition(){
        ClickElementXpath("//label/span/span");
    }

    @Then("^Composition filter should be applied$")
    public void assert_filter(){
        CompareTextFilter("Composition: Matt paper\n" +
                "\uE5CD");
        ClearFilter();
        tearDown();
    }

    @When("^User selects filter by Brand$")
    public void select_brand(){
        ClickElementXpath("//section[2]/ul/li/label/span/span");
    }
    @Then("^Brand filter should be applied$")
    public void assert_brand_filter(){
        CompareTextFilter("Brand: Graphic Corner\n" +
                "\uE5CD");
        ClearFilter();
        tearDown();
    }
    @Then("select {string} and verify {string}")
    public void check_dimension_filter(String locator, String dimension){
        ClickElementXpath(locator);
        CompareTextFilter(dimension);
        ClearFilter();
        tearDown();
    }

     /*   @Given("^user is on homepage$")
    public void user_is_on_homepage() {
        driver = new ChromeDriver();
        driver.get("http://40.76.27.113:8085/en/");
        driver.manage().window().maximize();
    }*/

    @When("^user clicks on product$")
    public void user_clicks_on_product() {
        ClickElementXpath("//a[contains(text(),'Hummingbird printed t-shirt')]");

    }

    @And("^user clicks on Add to cart button$")
    public void user_clicks_on_add_to_cart_button() {
        ClickElementXpath("(//button[@type='submit'])[2]");
    }

    @Then("^Proceed to checkout option should be displayed$")
    public void Proceed_to_checkout_is_displayed() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h4[@id='myModalLabel']")));
        assertEquals("\uE876Product successfully added to your shopping cart",driver.findElement(By.xpath("//h4[@id='myModalLabel']")).getText());
        ClickElementXpath("//button/span/i");

    }

    @Given("^user has a product in the cart$")
    public void user_has_a_product_in_the_cart() {
        String actualString = driver.findElement(By.cssSelector("span.cart-products-count")).getText();
        assertTrue(actualString.contains("(1)"));

    }

    @When("^user clicks on the cart icon$")
    public void user_clicks_on_cart_the_icon() {
        driver.findElement(By.xpath("//div[@id='_desktop_cart']/div/div/a/span")).click();
    }

    @Then("^shopping cart page is displayed$")
    public void shopping_cart_page_is_displayed() {
        CheckUrl("http://40.76.27.113:8085/en/cart?action=show");
    }

    @Given("^user is shopping cart page$")
    public void user_is_on_cart() {
        CheckUrl("http://40.76.27.113:8085/en/cart?action=show");

    }

    @And("^click on Proceed to checkout button$")
    public void click_on_Proceed_to_checkout_button() {
        driver.findElement(By.xpath("/html/body/main/section/div/div/section/div/div[2]/div[1]/div[2]/div/a")).click();

    }

    @When("^fill data in mandatory fields$")
    public void fill_data_in_mandatory_fields() {
        driver.findElement(By.name("id_gender")).click();
        driver.findElement(By.name("firstname")).sendKeys("misa");
        driver.findElement(By.name("lastname")).sendKeys("tran");
        driver.findElement(By.name("email")).sendKeys("test10@test.com");
        driver.findElement(By.name("psgdpr")).click();
    }

    @When("^user clicks on Continue button$")
    public void user_clicks_on_continue_button() {
        driver.findElement(By.name("continue")).click();
    }

    @When("^fill data in mandatory fields on address$")
    public void fill_data_in_mandatory_fields_on_address() {
        driver.findElement(By.name("address1")).sendKeys("home 123");
        driver.findElement(By.name("postcode")).sendKeys("123 45");
        driver.findElement(By.name("city")).sendKeys("malmo");
        driver.findElement(By.name("confirm-addresses")).click();
    }

    @When("^select shipping method$")
    public void select_shipping_method() {
   //     driver.findElement(By.name("delivery_option[19]")).click();
        driver.findElement(By.name("confirmDeliveryOption")).click();
    }

    @When("^select payment method$")
    public void select_payment_method() {
        driver.findElement(By.id("payment-option-1")).click();
    }

    @When("^agree to the terms of service$")
    public void agree_to_the_terms_of_service() {
        driver.findElement(By.name("conditions_to_approve[terms-and-conditions]")).click();
    }

    @When("^user clicks on Order with an obligation to pay button$")
    public void user_clicks_on_order_with_an_obligation_to_pay_button() {
        driver.findElement(By.xpath("/html/body/section/div/section/div/div[1]/section[4]/div/div[3]/div[1]/button")).click();
    }

    @Then("^Your order is confirmed is displayed$")
    public void your_order_is_confirmed_is_displayed() {
        assertTrue(driver.findElement(By.xpath("/html/body/main/section/div/div/section/section[1]/div/div/div/h3")).isDisplayed());
        tearDown();

    }

    @Given("^User is shopping website homepage$")
    public void user_is_shopping_website_homepage() {
        driver = new ChromeDriver();
        driver.get("http://40.76.27.113:8085/en/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        js = (JavascriptExecutor)driver;
        assertEquals("PrestShop",driver.getTitle());
    }

    @And("^user clicks sign in$")
    public void user_clicks_sign_in() {
        sign_in();
    }

    @And("^user clicks create one here$")
    public void user_clicks_create_one_here() {
        signup();
    }

    @And("^user check mandatory boxes$")
    public void user_check_mandatory_boxes() {
        selectGender();
    }

//    @When("^user enters data $")
//    public void user_enters_data_firstname_lastname_email_password_birthday() {
//
//
//    }

    @When("user enters data")
    public void user_enters_data() {
        String firstname="Uwa";
        String lastname="JJ";
        String email = getSaltString()+"@iths.se";
        String password="password";
        String birthday="05/31/1970";

        data(firstname, lastname, email,password,birthday);

    }


    @And("^user check optional boxes$")
    public void user_check_optional_boxes() {

    }

    @And("^user click save$")
    public void user_click_save() {
        termsOfA();
    }

    @Then("^user clicks save to save new user data$")
    public void user_clicks_save_to_save_new_user_data() {
        save();
        String pagesource= driver.getPageSource();
        assertTrue(pagesource.contains("Popular Products"));
        System.out.println("New user created and passed!");
        tearDown();
    }
    @Given("^User is on prestshop homepage$")
    public void user_is_on_prestshop_homepage() {

        setUp();
    }

    @When("^User Opens Languague Options$")
    public void user_opens_languague_options()  {


        selectOptionShow();

    }

    @When("^User clicks on Clothes$")
    public void click_clothes(){
        ClickElementXpath("//div[2]/div/ul/li/a");
        assertEquals("Clothes",driver.getTitle());
    }
    @Then("Select {string} and verify {string}")
    public void click_to_verify(String gender,String value){
        ClickElementXpath(gender);
        assertEquals(value,driver.findElement(By.xpath("//div[@id=\"js-product-list-header\"]/div/h1")).getText());
        tearDown();

    }

    @And("^User selects swedish language$")
    public void user_selects_swedish_language() throws InterruptedException {

        Thread.sleep(3000);

        selectOptionSwedish();
    }
    @Then("^Webage language changes to Swedish$")
    public void webage_language_changes_to_swedish() {
        String Url="http://40.76.27.113:8085/sv/";
        String expected_url= driver.getCurrentUrl();
        Assert.assertEquals(expected_url,Url);
    }
    @And("^User selects english language$")
    public void user_selects_english_language() throws InterruptedException {
        selectOptionShow();
        Thread.sleep(3000);
        selectOptionEnglish();

    }

    @Then("^Webpage language is English$")
    public void webpage_language_is_english() {
        String Url="http://40.76.27.113:8085/en/";
        String expected_url= driver.getCurrentUrl();
        Assert.assertEquals(expected_url,Url);
        tearDown();
    }

}