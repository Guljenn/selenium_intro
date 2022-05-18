package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    private Driver(){

    }
    private static WebDriver driver;

    public static WebDriver getDriver(){
        if(driver == null) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\jenni\\IdeaProjects\\selenium_intro\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        return driver;

    }

    public static void quitDriver(){
        if(driver != null){

            driver.quit();
            driver = null;
        }
    }
}
