package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class _01Validate_Apple_Title {

    public static void main(String[] args) {
       WebDriver driver = Driver.getDriver();


        driver.get("https://www.apple.com/");


        if(driver.getTitle().equals("Apple")) System.out.println("The title is verified as " + driver.getTitle());
        else System.out.println("The verification failed!!");

        Driver.quitDriver();
    }
}
