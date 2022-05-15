package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class _06_Locator_name {
    /*
    Go to https://www.google.com
    Validate the search input box is displayed

     */

    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        driver.get("https://www.google.com/");

        if (driver.findElement(By.name("q")).isDisplayed()) System.out.println("Google search input box PASSSED");
        else System.out.println("Google search input box FAILED!!!");

        Driver.quitDriver();
    }
}
