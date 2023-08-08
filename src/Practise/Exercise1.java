package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Exercise1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/mainguyen/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //Count links on the page
        System.out.println(driver.findElements(By.tagName("a")).size());
//      count links in the section on the page
        WebElement footer = driver.findElement(By.id("gf-BIG"));
        System.out.println(footer.findElements(By.tagName("a")).size());
//      count links in the column
        WebElement column = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(column.findElements(By.tagName("a")).size());
//      click on each link in the column
        for(int i =1; i<column.findElements(By.tagName("a")).size();i++) {
            String click = Keys.chord(Keys.COMMAND, Keys.ENTER);
            column.findElements(By.tagName("a")).get(i).sendKeys(click);
            Thread.sleep(5000);
        }
            Set<String> windows = driver.getWindowHandles();
            Iterator<String> it = windows.iterator();
            while(it.hasNext()) //hasNext() to tell the next index is present or not
            {
               driver.switchTo().window(it.next());// next() : move to next index
                System.out.println(driver.getTitle());
            }








    }
}
