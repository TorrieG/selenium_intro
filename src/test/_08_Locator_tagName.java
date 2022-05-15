package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _08_Locator_tagName {
    public static void main(String[] args) {
        /*
        Go to https://www.wikipedia.org/
        Validate the WIKIPEDIA heading1 is displayed
        Validate the WIKIPEDIA LOGO is displayed
        Validate the search input box is displayed
        Validate the search button is displayed
        Validate the search button is enabled
         */
        WebDriver driver = Driver.getDriver();

        driver.get("https://www.wikipedia.org/");

        WebElement heading1 = driver.findElement(By.tagName("h1"));
        WebElement logo = driver.findElement(By.cssSelector(".central-featured-logo"));
        WebElement input = driver.findElement(By.cssSelector("#searchInput"));
        WebElement buttonDisplayed = driver.findElement(By.className("pure-button"));

        System.out.println((heading1.isDisplayed()) ? "heading validation PASSED" : "heading validation FAILED");
        System.out.println(logo.isDisplayed() ? "logo PASSED" : "logo FAILED");
        System.out.println(input.isDisplayed() ? "input box PASSED" : "input box FAILED");
        System.out.println(buttonDisplayed.isDisplayed() ? "search button displayed PASSED" : "search button displayed FAILED");
        System.out.println(buttonDisplayed.isEnabled() ? "search button enabled PASSED" : "search button enabled FAILED");



        Driver.quitDriver();
    }

}
