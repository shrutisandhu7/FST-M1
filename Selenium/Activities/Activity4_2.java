package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {
    public static void main(String[] args) throws Exception{

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://training-support.net/selenium/simple-form");
        System.out.println("Title: "+driver.getTitle());

        WebElement firstname = driver.findElement(By.xpath("//input[@id = 'firstName']"));
        firstname.sendKeys("harry");

        WebElement lastname = driver.findElement(By.xpath("//input[@id = 'lastName']"));
        lastname.sendKeys("potter");

        WebElement email = driver.findElement(By.xpath("//input[@id = 'email']"));
        email.sendKeys("xyz@email.com");

        WebElement number = driver.findElement(By.xpath("//input[@id = 'number']"));
        number.sendKeys("1234567890");


        driver.findElement(By.xpath("//textarea")).sendKeys("my message");
        driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();
        driver.switchTo().alert().accept();

        // Close the browser
        driver.close();
    }
}
