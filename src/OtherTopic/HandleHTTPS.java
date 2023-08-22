package OtherTopic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class HandleHTTPS {
        public static void main(String[] args) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions option = new ChromeOptions();
//            set special proxy
            Proxy proxy = new Proxy();
            proxy.setHttpProxy("ipaddress:555");
            option.setCapability("proxy",proxy);
//          blocking the pop up
            Map<String, Object> prefs = new HashMap<String, Object>();
            prefs.put("download.default_directory", "/directory/path");
            option.setExperimentalOption("prefs", prefs);
//            using SSL certification
            option.setAcceptInsecureCerts(true);
            WebDriver driver = new ChromeDriver(option);
            driver.get("https://expried.badssl.com/");
            System.out.println(driver.getTitle());
        }
}
