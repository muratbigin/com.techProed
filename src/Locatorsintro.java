import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorsintro {
/**
 * Create a class : LocatorsIntro
 * Create main method and complete the following task.
 * user goes to http://a.testaddressbook.com/sign_in
 * Locate the elements of email textbox,password textbox, and signin button
 * Enter below username and password then click sign in button
 * Username :  testtechproed@gmail.com
 * Password : Test1234!
 * Then verify that the expected user id  testtechproed@gmail.com
 * Verify the Addresses and Sign Out  texts are displayed
 * Find the number of total link on the page
 * Sign out from the page
 */

public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "/Users/muratbigin/Documents/selenium dependencies/drivers/chromedriver");
    WebDriver driver = new ChromeDriver();
    // user goes to http://a.testaddressbook.com/sign_in
    driver.get("http://a.testaddressbook.com/sign_in");
    // Locate the elements of email textbox,password textbox, and signin button
//    WebElement emailTextBox = driver.findElement(By.id("session_email"));
}

}


