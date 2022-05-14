package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Demo {
    public static void main(String[] args) {
        // 1. Setup Driver

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jenni\\IdeaProjects\\selenium_intro\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // Instantiate a Chrome Browser

        // 2. Maximize Browser
         driver.manage().window().maximize(); // Maximize the driver

        // 3. Define implicit waits
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // implicit wait

        // 4. Navigate to Google Website
        driver.get("https://www.google.com/");

        // 5. Validate that the title is Google



        System.out.println("The title of the page is = " + driver.getTitle());
        if(driver.getTitle().equals("Google")) System.out.println("Google title validation passed!");
        else System.out.println("Google title validation FAILED!!");

        System.out.println("End of the program");

        // 6. Quit driver
        driver.quit();


    }

}
