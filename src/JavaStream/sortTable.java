package JavaStream;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.asynchttpclient.ClientStats;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class sortTable {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
//        click on column
        driver.findElement(By.xpath("//tr/th[1]")).click();

//        capture all webelements into list
        List<WebElement> list1 = driver.findElements(By.xpath("//tr/td[1]"));

//        capture text of all webelements into new list
        List<String> originalList = list1.stream().map(s -> s.getText()).collect(Collectors.toList());

//        sort on the original list of step 3 -> sorted list
        List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());

//        compare original list vs sorted list
        Assert.assertTrue(originalList.equals(sortedList));
//scan the name column with get text -> rice -> print the price of the rice
        List<String> price;
        do {
            List<WebElement> rows = list1;
            price = rows
                    .stream()
                    .filter(s -> s.getText().contains("Rice"))
                    .map(sortTable::getPrice).collect(Collectors.toList());
//            price.forEach(a -> System.out.println(a));

            if (price.size() < 1) {
                driver.findElement(By.cssSelector("[aria-label='Next']")).click();
            }
        } while (price.size() < 1);

    }

    private static String getPrice(WebElement s) {
        String price = s.findElement(By.xpath("following-sibling::td[1]")).getText();
        return price;
    }


}
