package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

    public static void main(String[] args) {

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://www.training-support.net");
        //Title
        System.out.println(driver.getTitle());

        WebElement aboutUs_id = driver.findElement(By.id("about-link"));
        System.out.println("Element text: "+aboutUs_id.getText());

        WebElement aboutUs_classname = driver.findElement(By.className("green"));
        System.out.println("Element text: "+aboutUs_classname.getText());

        WebElement aboutUs_linktext = driver.findElement(By.linkText("About Us"));
        System.out.println("Element text: "+aboutUs_linktext.getText());

        WebElement aboutUs_css = driver.findElement(By.cssSelector(".green"));
        System.out.println("Element text: "+aboutUs_css.getText());

        // Close the browser
        driver.close();
    }
}
