package JavaStream;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class filter {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.findElement(By.id("search-field")).sendKeys("Rice");

       List<WebElement> fruits =  driver.findElements(By.xpath("//tr/td[1]"));
       List<WebElement> filterList = fruits.stream().filter(fruit -> fruit.getText().contains("Rice"))
               .collect(Collectors.toList());

//       1 result
        Assert.assertEquals(fruits.size(),filterList.size());



    }
}
