package OtherTopic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.sql.SQLOutput;
import java.util.List;

public class BrokenLink {
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        List<WebElement> links=   driver.findElements(By.cssSelector("li[class='gf-li'] a"));
        SoftAssert a= new SoftAssert();
        for(WebElement link : links)
        {
            String url = link.getAttribute("href");
            HttpURLConnection con = (HttpURLConnection)new URL(url).openConnection();
            con.setRequestMethod("HEAD");
            con.connect();
            int res = con.getResponseCode();
            System.out.println(res);
            a.assertTrue(res <400,"testcase is false");
        }
        a.assertAll();
//        broken link
//        Java method will call URL's and gets you the status code
//        Step 1: get all the url of link using Selenium
//         Step 2: If the status code >400 => link is broken


    }
}
