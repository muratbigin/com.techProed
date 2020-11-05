package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsIntro {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/muratbigin/Documents/selenium dependencies/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        //User goes to https://a.testaddressbook.com/sign in
        driver.get("https://a.testaddressbook.com/sign in");
        //Locate the elements of email textbox, password textbox, and signin button
        //<input type="email" class="form-control" placeholder="Email" data-test="email" name="session[email]" id="session_email">
        WebElement emailTextbox=driver.findElement(By.id("session_email"));
        //<input class="form-control" placeholder="Password" data-test="password" type="password" name="session[password]" id="session_password">
        WebElement passwordTextBox= driver.findElement(By.id("session_password"));
        //<input type="submit" name="commit" value="sign in" class="btn btn-primary" data-test="submit" data-disable-with="Sign in">
        WebElement signinButton=driver.findElement(By.name("commit"));

        //Enter below username and password then click sign in button
        //Username : testtechproed@gmail.com
        //Password : Test1234!
        Thread.sleep(3000);
        //Send username in the email text box
        emailTextbox.sendKeys("testtechproed@gmail.com");
        Thread.sleep(3000);
        //sending the pasword in the pasword textbox
        passwordTextBox.sendKeys("Test1234!");
        Thread.sleep(3000);
        //Click on sign in button
        signinButton.click();


    }
}
