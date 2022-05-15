package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class _02_Validate_Apple_URL {


    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

    driver.get("https://www.apple.com/");
    if (driver.getCurrentUrl().equals("https://www.apple.com/")) System.out.println("Apple URL validation PASSED");
    else System.out.println("Apple URL validation FAILED");

    Driver.quitDriver();
    }
}
