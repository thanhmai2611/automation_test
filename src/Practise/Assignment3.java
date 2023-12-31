package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static java.time.Duration.ofSeconds;

public class Assignment3 {
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "/Users/mainguyen/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait w = new WebDriverWait(driver, ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("password")).sendKeys("learning");
        driver.findElement(By.cssSelector("input[value='user']")).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='okayBtn']")));
        driver.findElement(By.cssSelector("[id='okayBtn']")).click();
        WebElement staticDropdown = driver.findElement(By.cssSelector("select[data-style='btn-info']"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByVisibleText("Consultant");
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("signInBtn")).click();
        String[] items = {"iphone X", "Samsung Note 8", "Nokia Edge", "Blackberry"};
        addItems(driver, items);
        driver.findElement(By.cssSelector("a[class='nav-link btn btn-primary']")).click();


    }

    public static void addItems(WebDriver driver, String[] items) {
        int j = 0;
        List<WebElement> products = driver.findElements(By.cssSelector("h4[class='card-title']"));
        for (int i = 0; i < products.size(); i++) {
            String name = products.get(i).getText();
            List itemsNeeds = Arrays.asList(items);
            if (itemsNeeds.contains(name)) {
                j++;
                driver.findElements(By.cssSelector("button[class='btn btn-info']")).get(i).click();
                if (j == items.length) {
                    break;
                }
            }
        }
    }


    public static class Assignment4 {
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

    public static class Assignment5 {
        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "/Users/mainguyen/Documents/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("https://the-internet.herokuapp.com/");
            driver.findElement(By.linkText("Nested Frames")).click();
            driver.switchTo().frame("frame-top");
            driver.switchTo().frame("frame-middle");
            System.out.println(driver.findElement(By.id("content")).getText());
            driver.quit();

        }
    }
}
