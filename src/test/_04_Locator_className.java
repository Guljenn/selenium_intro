package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _04_Locator_className {

    public static void main(String[] args) {


    /*
    TEST CASE
    1. Go to https://www.google.com/
    2. Validate the Google Image is displayed on the top of the page
     */

        //1. Set Driver

        WebDriver driver = Driver.getDriver();

        //2. Validation
        driver.get("https://www.google.com/");

        //Make sure that image is displayed

        WebElement googleImage = driver.findElement(By.className("lnXdpd"));

        if(googleImage.isDisplayed()) System.out.println("Google image validation is displayed!");
        else System.out.println("Validation failed!!");

        Driver.quitDriver();

    }
}
