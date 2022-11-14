package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity8_1 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/tables");

        System.out.println("Title: " + driver.getTitle());

        List<WebElement> listelements = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[1]/td"));
        System.out.println("Numbers of columns: "+listelements.size());

        List<WebElement> listelements2 = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr"));
        System.out.println("Numbers of rows: "+listelements2.size());

        for (WebElement listelement: listelements2) {
            System.out.println(listelement.getText());
        }
        System.out.println("3rd row: "+driver.findElement(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[3]")).getText());

        WebElement secondrl = driver.findElement(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[2]/td[2]"));
        System.out.println("Second row second column: "+secondrl.getText());

        driver.close();
    }
}
