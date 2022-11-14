package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity8_2 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://training-support.net/selenium/tables");

        System.out.println("Title: " + driver.getTitle());

        List<WebElement> listelements = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr[1]/td"));
        System.out.println("Numbers of columns: " + listelements.size());

        List<WebElement> listelements2 = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));
        System.out.println("Numbers of rows: " + listelements2.size());

        WebElement secondrl1 = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
        System.out.println("Second row second column: "+secondrl1.getText());

        driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th[1]")).click();

        WebElement secondrl2 = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
        System.out.println("Second row second column: "+secondrl2.getText());


        List<WebElement> listfootheader = driver.findElements(By.xpath("//table[@id='sortableTable']/tfoot"));
        for (WebElement listelement: listfootheader) {
            System.out.println("Footer head elements: "+listelement.getText());
        }

        driver.close();
    }
}
