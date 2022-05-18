package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _09_Locator_linkText_partialLinkText {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        driver.get("https://www.google.com/");


        WebElement aboutLInk = driver.findElement(By.linkText("About"));
        WebElement storeLink = driver.findElement(By.linkText("Store"));
        WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
        WebElement imagesLink = driver.findElement(By.partialLinkText("ges"));


        System.out.println(aboutLInk.getText());
        System.out.println(storeLink.getText());
        System.out.println(gmailLink.getText());
        System.out.println(imagesLink.getText());

        if(aboutLInk.isDisplayed() && aboutLInk.isEnabled()) System.out.println("Validation PASSED!!");
        else System.out.println("Validation FAILED");

        if(storeLink.isDisplayed() && storeLink.isEnabled()) System.out.println("Validation PASSED!!");
        else System.out.println("Validation FAILED!");

        if(gmailLink.isDisplayed() && gmailLink.isEnabled()) System.out.println("Validation PASSED!!");
        else System.out.println("Validation FAILED!");

        if(imagesLink.isDisplayed() && imagesLink.isEnabled()) System.out.println("Validation PASSED!!");
        else System.out.println("Validation FAILED!");


        Driver.quitDriver();





    }
}
