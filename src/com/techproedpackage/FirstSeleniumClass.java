package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/muratbigin/Documents/selenium dependencies/drivers/chromedriver");


        //Create our driver object
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
    }
}
