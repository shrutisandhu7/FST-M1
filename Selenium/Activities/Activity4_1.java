package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {

    public static void main(String[] args) {

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://www.training-support.net");
        System.out.println("First title: "+driver.getTitle());
        WebElement aboutus = driver.findElement(By.xpath("//a[contains(text(), 'About Us')]"));
        aboutus.click();

        System.out.println("Second title: "+driver.getTitle());

        // Close the browser
        driver.close();
    }
}
