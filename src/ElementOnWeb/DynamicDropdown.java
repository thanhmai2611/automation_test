package ElementOnWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/mainguyen/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		/*int i=1;
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();//add
			i++;
		}*/
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();//add
			
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();//close
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		
	}

}
