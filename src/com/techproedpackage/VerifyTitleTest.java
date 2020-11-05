package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitleTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/muratbigin/Documents/selenium dependencies/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        //get the page title
        String actualTitle=driver.getTitle();
        System.out.println("ACTUAL : "+actualTitle);
        String expectedTitle="Google";
        System.out.println("EXPECTED : "+expectedTitle);
        //Verify if google title is "goole"
        if(actualTitle.equals(expectedTitle)){
            System.out.println("PAssed");
        }else{
            System.out.println("Failed");
        }
        driver.close();


    }


}
