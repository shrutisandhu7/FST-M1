package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity7_2 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/dynamic-attributes");

        System.out.println("Title: " + driver.getTitle());

        WebElement username = driver.findElement(By.xpath("//input[contains(@class, '-username')]"));
        username.sendKeys("harry");
        WebElement password = driver.findElement(By.xpath("//input[contains(@class, '-password')]"));
        password.sendKeys("abcpass");
        WebElement confirmpassword = driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following::input"));
        confirmpassword.sendKeys("abcpass");
        WebElement email = driver.findElement(By.xpath("//label[contains(text(), 'mail')]/following-sibling::input"));
        email.sendKeys("ab@ww.cc");

        driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]")).click();
        System.out.println("Login message: " +driver.findElement(By.id("action-confirmation")).getText());

        driver.close();
    }
}
