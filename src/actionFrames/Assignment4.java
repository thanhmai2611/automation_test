package actionFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Assignment4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/mainguyen/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.cssSelector("a[href='/windows']")).click();
        driver.findElement(By.cssSelector("a[href='/windows/new']")).click();
        Set<String> window = driver.getWindowHandles();
        Iterator<String> a = window.iterator();
        String parentId = a.next();
        String childId = a.next();
        driver.switchTo().window(childId);
        System.out.println(driver.findElement(By.cssSelector("div.example")).getText());
        driver.switchTo().window(parentId);
        System.out.println(driver.findElement(By.cssSelector("div.example h3")).getText());
    }



}
