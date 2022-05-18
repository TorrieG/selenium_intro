package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Testing_ebay {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mstor\\IdeaProjects\\selenium_intro\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.ebay.com/");

        List<WebElement> buttons = driver.findElements(By.xpath("//li[@class ='hl-cat-nav__js-tab']/a"));



        for (int i = 0; i < buttons.size(); i++) {
            System.out.println(buttons.get(i).getText());
        }
        driver.quit();
    }
}
