package com.it.pop;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver;
    static JavascriptExecutor js;
    public static String browser = "chrome";
    public static String categoryMen = "//label/span/span";
    public static String categoryWomen = "//section[1]/ul/li[2]/label/span/span";
    public static String filterWomen = "Categories: Women\n" +
        "\uE5CD";
    public static String filterMen = "Categories: Men\n" +
        "\uE5CD";

    public static String category = "CLOTHES";
    public static String linkClothes = "http://40.76.27.113:8085/en/3-clothes";
    public static String linkMen = "http://40.76.27.113:8085/en/4-men";
    public static String linkWomen = "http://40.76.27.113:8085/en/5-women";


    @BeforeAll
    public static void setUp(){
        if(browser.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();

        }
        else if (browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        }
        driver.get("http://40.76.27.113:8085/en/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        js = (JavascriptExecutor)driver;
    }

    @BeforeEach
    public static void setUpDriver(){
        if(browser.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();

        }
        else if (browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        }
        driver.get("http://40.76.27.113:8085/en/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        js = (JavascriptExecutor)driver;
    }

/*    @AfterEach
    public void SelectHomeIcon(){
        driver.findElement(By.id("logo")).click();
    }
*/
    @AfterEach
    public void tearDownDriver(){
        driver.quit();
    }

    @AfterAll
    public static void tearDown(){
        driver.quit();
    }

}
