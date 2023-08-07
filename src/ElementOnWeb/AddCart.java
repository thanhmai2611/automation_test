package ElementOnWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.time.Duration.ofSeconds;

public class AddCart {
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "/Users/mainguyen/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait w = new WebDriverWait(driver, ofSeconds(5));
        String[] items ={"Cucumber","Brocolli","Beetroot","Carrot"};
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        Thread.sleep(3000);
        addItems(driver,items);
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[class='promoCode']")));
        driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button[class='promoBtn']")).click();

//        explicit wait

        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());



    }


    public static void addItems(WebDriver driver,String[] items)
    {
        int j=0;
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        for(int i=0; i<products.size();i++)
        {
            String[] name = products.get(i).getText().split("-");
            String formatName = name[0].trim();
//        format it to get actual vegetable name
//        convert array into array list for easy search
//        check whether name that extract is present in array or not
            List itemsNeeds = Arrays.asList(items);

            if(itemsNeeds.contains(formatName))
            {

                j++;
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                if(j==items.length)
                {
                    break;
                }
            }


        }


    }


}
