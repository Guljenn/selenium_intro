package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _01Validate_Apple_Title {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jenni\\IdeaProjects\\selenium_intro\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        driver.get("https://www.apple.com/");


        if(driver.getTitle().equals("Apple")) System.out.println("The title is verified as " + driver.getTitle());
        else System.out.println("The verification failed!!");

        driver.quit();
    }
}
