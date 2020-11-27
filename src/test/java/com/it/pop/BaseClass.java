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
    public static String homePage = "http://40.76.27.113:8085/en/";
    public static String categoryMen = "//label/span/span";
    public static String categoryWomen = "//section[1]/ul/li[2]/label/span/span";
    public static String filterWomen = "Categories: Women\n" +
        "\uE5CD";
    public static String filterMen = "Categories: Men\n" +
        "\uE5CD";

    public static String filterColorWhite = "//section/section/div[2]/section/ul/li";
    public static String filterColorBlack = "//div[2]/section/ul/li[2]";
    public static String colorWhite = "//ul/li[1]/label/span/span";
    public static String clothesWhite = "//section[3]/ul/li[1]/label/span/span";
    public static String clothesBlack = "//section[3]/ul/li[2]/label/span/span";
    public static String colorBlack ="//section[2]/ul/li[2]/label/span/span";
    public static String clothesSection = "//*[@id=\"category-3\"]/a";
    public static String category = "CLOTHES";
    public static String linkClothes = "http://40.76.27.113:8085/en/3-clothes";
    public static String linkMen = "http://40.76.27.113:8085/en/4-men";
    public static String linkWomen = "http://40.76.27.113:8085/en/5-women";
    public static String linkMenBlack = "http://40.76.27.113:8085/en/4-men?q=Color-Black";
    public static String linkMenWhite = "http://40.76.27.113:8085/en/4-men?q=Color-White";
    public static String linkMenWhiteBlack = "http://40.76.27.113:8085/en/4-men?q=Color-White-Black";


    public static String signin ="_desktop_user_info";
    public static String fNa= "firstname";
    public static String lNa= "lastname";
    public static String  emelj= "email";
    public static String  pword="password";
    public static String  birthD= "birthday";
    public static String terms= "/html/body/main/section/div/div/section/section/section/form/section/div[9]/div[1]/span";
    public static String sav="submitCreate";


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
    public void setUpDriver(){
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

 //   @AfterEach
    public void tearDown(){
        driver.quit();
    }



}
