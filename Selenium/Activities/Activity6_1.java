package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6_1 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(20));
        driver.get("https://training-support.net/selenium/dynamic-controls");

        System.out.println("Title: " + driver.getTitle());

        WebElement checkbtn = driver.findElement(By.id("toggleCheckbox"));
        WebElement checkbox = driver.findElement(By.xpath("//input[@type = 'checkbox']"));

        checkbtn.click();
        wait.until(ExpectedConditions.invisibilityOf(checkbox));

        checkbtn.click();
        wait.until(ExpectedConditions.visibilityOf(checkbox));
        checkbox.click();

        driver.close();
    }
}
