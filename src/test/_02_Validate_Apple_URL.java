package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _02_Validate_Apple_URL {


    public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\mstor\\IdeaProjects\\selenium_intro\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    driver.get("https://www.apple.com/");
    if (driver.getCurrentUrl().equals("https://www.apple.com/")) System.out.println("Apple URL validation PASSED");
    else System.out.println("Apple URL validation FAILED");

    driver.quit();
    }
}
