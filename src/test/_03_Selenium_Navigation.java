package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _03_Selenium_Navigation {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jenni\\IdeaProjects\\selenium_intro\\chromedriver_win32\\chromedriver.exe ");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //2. Validation
        driver.get("https://www.techglobalschool.com");
        driver.navigate().refresh();
        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();
        driver.navigate().forward();

        String expectedTitle = "Amazon.com. Spend less. Smile more.";
        String expectedURL = "https://www.amazon.com/";

        String actualTitle = driver.getTitle();
        String actualURL = driver.getCurrentUrl();

        if(actualTitle.equals(expectedTitle)) System.out.println("Title validation PASSED!");
        else System.out.println("Title validation FAILED!!");

        if(actualURL.equals(expectedURL)) System.out.println("URL validation PASSED!");
        else System.out.println("URL validation FAILED!!");

        driver.quit();
    }
}