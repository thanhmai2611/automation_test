package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Assignment6 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/mainguyen/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("checkBoxOption2")).click();
//        step 2
        String label = driver.findElement(By.xpath("//label[@for='benz']")).getText();
        System.out.println(label);
        driver.findElement(By.id("dropdown-class-example")).sendKeys(label);
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys(label);
        driver.findElement(By.id("alertbtn")).click();
        String alert = driver.switchTo().alert().getText();
        System.out.println(alert);
        if (alert.contains(label))
        {
            System.out.println("Text grabbed from step 2 is present in the pop up message");
        }
//        driver.quit();
    }
}
