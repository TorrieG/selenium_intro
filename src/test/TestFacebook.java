package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestFacebook {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.diver", "C:\\Users\\mstor\\IdeaProjects\\selenium_intro\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.facebook.com/");

        if (driver.getTitle().equals("Facebook - log in or sign up")) System.out.println("Title PASSED");
        else System.out.println("Title FAILED");

        if (driver.getCurrentUrl().equals("https://www.facebook.com/")) System.out.println("URL PASSED");
        else System.out.println("URL FAILED");

        if (driver.findElement(By.className("fb_logo")).isDisplayed())
            System.out.println("Logo PASSED");
        else System.out.println("Logo FAILED");

        if (driver.findElement(By.xpath("//h2[contains(text(),'Connect with friends and the world around you on F')]")).isDisplayed())
            System.out.println("Heading 2 PASSED");
        else System.out.println("Heading 2 FAILED");

        if (driver.findElement(By.cssSelector("#email")).isDisplayed()) System.out.println("Email PASSED");
        else System.out.println("Email FAILED");

        System.out.println(driver.findElement(By.cssSelector("#pass")).isDisplayed() ? "Password PASSED" : "Password FAILED");

        WebElement login = driver.findElement(By.cssSelector("._42ft"));

        System.out.println((login.isDisplayed() && login.isEnabled()) ? "Log In PASSED" : "Log In FAILED");

        System.out.println(driver.findElement(By.linkText("Forgot password?")).isDisplayed() ?
                "Forgot Password PASSED" : "Forgot Password FAILED");
        System.out.println(driver.findElement(By.linkText("Create new account")).isDisplayed() ?
                "Create New Account PASSED" : "Create New Account FAILED");


        driver.quit();

    }
}
