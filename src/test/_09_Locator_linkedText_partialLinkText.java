package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _09_Locator_linkedText_partialLinkText {
    public static void main(String[] args) {
        /*
        Go to https://www.google.com
        Validate the Gmail, Images, About and Store links are displayed and enabled
        using linkedText or partialLinkText
         */
        WebDriver driver = Driver.getDriver();

        driver.get("https://www.google.com/");

        WebElement gmail = driver.findElement(By.linkText("Gmail"));
        WebElement images = driver.findElement(By.linkText("Images"));
        WebElement about = driver.findElement(By.linkText("About"));
        WebElement store = driver.findElement(By.linkText("Store"));

        System.out.println(gmail.isDisplayed() && gmail.isEnabled() ? "Gmail PASSED" : "Gmail FAILED");
        System.out.println(images.isDisplayed() && images.isEnabled() ? "Images PASSED" : "Images FAILED");
        System.out.println(about.isDisplayed() && about.isEnabled() ? "About PASSED" : "About FAILED");
        System.out.println(store.isDisplayed() && store.isEnabled() ? "Store PASSED" : "Store FAILED");

        Driver.quitDriver();

    }
}
