package OtherTopic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Miscellaneous {
        public static void main(String[] args) throws IOException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

//            delete all cookies or a cookie
            driver.manage().deleteAllCookies();
//            driver.manage().getCookieNamed("cookie name");
            driver.get("https://www.google.com.vn/");
//            chup anh trang web test
//            ep kieu driver object sang screenshot object => get the out put as a file
            File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scr,new File("/Users/mainguyen/Desktop/screenshot.png"));


        }
}
