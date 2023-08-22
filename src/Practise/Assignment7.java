package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment7 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/mainguyen/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)");

//      1. print number of rows present in the table
        Integer sum = driver.findElements(By.cssSelector(".left-align td:nth-child(3)")).size();
        Integer all = sum + 1;
        System.out.println("Number of rows present in the table is " + all);

//        2. print number of column present in the table
        WebElement table = driver.findElement(By.id("product"));
        Integer column = table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size();
        System.out.println("Number of column present in the table is " + column);
//        3. print the second row contain
        List<WebElement> secondrow = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
        System.out.println(secondrow.get(0).getText());
        System.out.println(secondrow.get(1).getText());
        System.out.println(secondrow.get(2).getText());
        driver.quit();
    }
}
