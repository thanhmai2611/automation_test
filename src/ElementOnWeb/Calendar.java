package ElementOnWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.lang.model.element.Element;
import java.time.Duration;
import java.util.List;

public class Calendar {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/mainguyen/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.path2usa.com/travel-companion/");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        //August 25
        WebElement element= driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']"));
        Point point = element.getLocation();
        int xcord = point.getX();
        System.out.println("Position of the webelement from left side is "+xcord +" pixels");
        int ycord = point.getY();
        System.out.println("Position of the webelement from top side is "+ycord +" pixels");
        Actions actions = new Actions(driver);
        actions.moveToElement(element, xcord, ycord).click().build().perform();



        List<WebElement> dates = driver.findElements(By.className("flatpickr-day"));
        int countDates = driver.findElements(By.className("flatpickr-day")).size();
        for(int i=0; i<countDates;i++)
        {
            String text = driver.findElements(By.className("flatpickr-day")).get(i).getText();
            if(text.equalsIgnoreCase("23"))
            {
                driver.findElements(By.className("flatpickr-day")).get(i).click();
                break;
            }

        }

    }
}
