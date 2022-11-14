package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {
    public static void main(String[] args) {

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://www.training-support.net/selenium/target-practice");
        System.out.println(driver.getTitle());

        WebElement thirdheader = driver.findElement(By.xpath("//h3[@id = 'third-header']"));
        System.out.println(thirdheader.getText());

        String fifthHeaderColour = driver.findElement(By.xpath("//h5")).getCssValue("color");
        System.out.println("Fith header's colour: " + fifthHeaderColour);

        String violetButtonClasses = driver.findElement(By.xpath("//button[contains(text(), 'Violet')]")).getAttribute("class");
        System.out.println("Violet button's classes: " + violetButtonClasses);

        String greyButton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();

        System.out.println("Grey button's text: " + greyButton);
        // Close the browser
        driver.close();
    }
}
