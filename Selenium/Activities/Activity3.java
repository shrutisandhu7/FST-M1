package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) throws InterruptedException{

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://training-support.net/selenium/simple-form");

        System.out.println(driver.getTitle());

        WebElement firstname = driver.findElement(By.id("firstName"));
        firstname.sendKeys("harry");

        WebElement lastname = driver.findElement(By.id("lastName"));
        lastname.sendKeys("potter");

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("xyz@email.com");

        WebElement number = driver.findElement(By.id("number"));
        number.sendKeys("1234567890");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();

        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        // Close the browser
        driver.close();
    }
}
