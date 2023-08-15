package ElementOnWeb;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.lang.model.element.Element;
import java.time.Duration;
import java.util.List;

public class Calendar {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/mainguyen/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.path2usa.com/travel-companion/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        //December 25
//        driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).click();
        WebElement element = driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']"));
        Actions actions = new Actions(driver);
//        Cach 1: scroll man hinhh toi element mong muon
//        WebElement myElement = new WebDriverWait(driver, Duration.ofSeconds(2))
//                .until(ExpectedConditions.visibilityOf(element));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", myElement);
//        Thread.sleep(2000);
//        actions.moveToElement(element).build().perform();
//        element.click();

//        Cach 2: scroll man hinh theo toa do
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,900)");
        Thread.sleep(3000);
        element.click();
//      click on the month
        while(!driver.findElement(By.cssSelector("[class='flatpickr-month'] [class='cur-month']")).getText().contains("December"))
        {
            driver.findElement(By.className("flatpickr-next-month")).click();
            Thread.sleep(1000);
        }
//        grab common attribute//put into list and iterate
        List<WebElement> dates = driver.findElements(By.className("flatpickr-day"));
        int countDates = driver.findElements(By.className("flatpickr-day")).size();
        for(int i=0; i<countDates;i++)
        {
            String text = driver.findElements(By.className("flatpickr-day")).get(i).getText();
            if(text.equalsIgnoreCase("3"))
            {
                driver.findElements(By.className("flatpickr-day")).get(i).click();
                break;
            }

        }

    }
}
