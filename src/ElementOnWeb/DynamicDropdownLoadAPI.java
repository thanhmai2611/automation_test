package ElementOnWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdownLoadAPI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/mainguyen/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='IXB']")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//a[@value=\"MAA\"])[2]")).click();
		
//		Thay vi dung index nhu cach tren thi co the dung parent-child relationship nhu cach duoi
		
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		
	
		
	
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		
		
	
		
		
		
		
		
	}

}
