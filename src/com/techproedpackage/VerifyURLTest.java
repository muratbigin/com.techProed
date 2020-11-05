package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.lwawt.macosx.CSystemTray;

public class VerifyURLTest {
    public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","/Users/muratbigin/Documents/selenium dependencies/drivers/chromedriver");
       WebDriver driver = new ChromeDriver();
       driver.navigate().to("https://www.google.com/");

       //Getting the page url
        String actualURL=driver.getCurrentUrl();
        String expectedURL="www.google.com";

        if(actualURL.equals(expectedURL)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUAL :"+actualURL);
            System.out.println("EXPECTED :"+expectedURL);
        }
    }
}
