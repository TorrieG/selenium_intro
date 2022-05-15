package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _05_Locator_id {
    /*
    Go to https://www.techglobalschool.com

    Validate the company signature
        Logo must be displayed in the header section
        Company name must be displayed in the header section
        Company quote must be displayed in the header section
     */
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        driver.get("https://www.techglobalschool.com/");

        WebElement logo = driver.findElement(By.id("comp-kuiqjide2"));
        WebElement name = driver.findElement(By.id("comp-kuiqjidf"));
        WebElement quote = driver.findElement(By.id("comp-kuiqjidf1"));

        if (logo.isDisplayed()) System.out.println("The logo validation PASSED");
        else System.out.println("The logo validation FAILED!!");

        if (name.isDisplayed() && name.getText().equals("TechGlobal")) System.out.println("The company name validation PASSED");
        else System.out.println("The name validation FAILED!!");

        if (quote.isDisplayed() && quote.getText().equals("OUR GOAL IS YOUR SUCCESS")) System.out.println("The quote validation PASSED");
        else System.out.println("The company quote validation FAILED!!");

        Driver.quitDriver();
    }
}
