package com.techproedpackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {



    public static void main(String[] args) throws InterruptedException {

        // Calling the chromedriver and giving the path
        System.setProperty("webdriver.chrome.driver","/Users/muratbigin/Documents/selenium dependencies/drivers/chromedriver");
        //Create the driver object
        WebDriver driver = new ChromeDriver();
        //going to the google.com
        driver.get("https://www.google.com/");
        Thread.sleep(3000);
        driver.get("https://www.amazon.com/");
        //On the same class, Navigate to amazon home page.
        Thread.sleep(3000);
        driver.navigate().to("https://www.amazon.com/");
        //Navigate back to google
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        //Navigate forward to amazon
        driver.navigate().forward();
        Thread.sleep(3000);
        //Refresh the page
        driver .navigate().refresh();
        Thread.sleep(3000);
        //Maximize the window
        driver.manage().window().maximize();
        Thread.sleep(3000);
        //Close/Quit the browser
        //driver.close(); we will use driver.quit() because this is very stronger
        driver.quit();

    }

}
