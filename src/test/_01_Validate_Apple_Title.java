package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class _01_Validate_Apple_Title {

    /*
    TEST CASE
    1. Go to "https://www.apple.com/"
    2. Validate the title of the page is displayed as "Apple"
     */

    public static void main(String[] args) throws InterruptedException {
       //1. Set up driver
       WebDriver driver = Driver.getDriver();

        //2. Validation
        driver.get("https://www.apple.com/");

        if (driver.getTitle().equals("Apple")) System.out.println("Apple title validation PASSED");
        else System.out.println("Apple title validation FAILED");

        //3. Quit driver
        Thread.sleep(900);
        Driver.quitDriver();
    }

}
