package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _05_LocatorID {
    public static void main(String[] args) {
        /*
        TEST CASE
        Validate the company signature
        Logo must be displayed in the header section
        Company must be displayed in the header section
        Company quote must be displayed in the header section
         */

        WebDriver driver = Driver.getDriver();

        driver.get("https://www.techglobalschool.com");

        WebElement logo = driver.findElement(By.id("img_comp-kuiqjide2"));

        if(logo.isDisplayed()) System.out.println("The logo validation PASSED");
        else System.out.println("Logo validation FAILED!!!");


        // Check if company is displayed in the header section


        WebElement name = driver.findElement(By.id("comp-kuiqjidf"));
        WebElement quote = driver.findElement(By.id("comp-kuiqjidf1"));



        System.out.println(name.getText());
        System.out.println(quote.getText());

        if(name.isDisplayed() && name.getText().equals("TechGlobal")) System.out.println("Name validation PASSED!");
        else System.out.println("Validation failed!");

        if(quote.isDisplayed() && quote.getText().equals("OUR GOAL IS YOUR SUCCESS")) System.out.println("Quote validation PASSED");
        else System.out.println("Validation FAILED!");

        Driver.quitDriver();


    }
}
