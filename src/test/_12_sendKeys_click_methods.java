package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.security.Key;

public class _12_sendKeys_click_methods {
    public static void main(String[] args) {
        /*
        Go to https://www.wikipedia.org/

        Search for “Tesla”

        Validate the main title of the page is “Tesla”

        NOTE: Use xpath or cssSelector to locate the web elements

         */

        WebDriver driver = Driver.getDriver();
        driver.get("https://www.wikipedia.org/");

        WebElement search = driver.findElement(By.cssSelector("#searchInput"));
        //WebElement button = driver.findElement(By.cssSelector("#pute-button"));

        search.sendKeys("Tesla" + Keys.ENTER);

        WebElement heading = driver.findElement(By.cssSelector("#firstHeading"));
        //button.click();
        System.out.println(heading.getText().equals("Tesla") ? "PASSED" : "FAILED");

        driver.quit();
    }
}
