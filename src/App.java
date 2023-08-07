import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class App implements WebDriver {

	public static void main(String[] args) {

		// chromedriver.exe -> Chromebrowser
		System.setProperty("webdriver.chrome.driver", "/Users/mainguyen/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		// webdriver.chrome -> value of path
		// WebDriver driver = new ChromeDriver();
		
		// Firefox launch
		//geckodriver
		//webdriver.gecko.driver
//		System.setProperty("webdriver.gecko.driver", "/Users/mainguyen/Documents/geckodriver");
//		WebDriver driver1 = new FirefoxDriver();
		
		//Microsoft Edge
//		System.setProperty("webdriver.edge.driver", "/Users/mainguyen/Documents/msedgedriver");
//		WebDriver driver2 = new EdgeDriver();
		
		
		
		driver.get("https://dantri.com.vn/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		// driver.quit();
	}

}
