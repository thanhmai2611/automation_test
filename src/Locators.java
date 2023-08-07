import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locators {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/mainguyen/Documents/chromedriver");


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("inputUsername")).sendKeys("nguyenthanhmai2611@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys("Bibong123!@#");
		driver.findElement(By.className("submit")).click();		
		System.out.println((driver.findElement(By.cssSelector("p.error")).getText()));
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("mainguyen");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("nguyenthanhmai2611@com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("nguyenthanhmai2611@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("0382206246");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();		
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Mai");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		driver.findElement(By.xpath("//*[@class='logout-btn']")).click();
		driver.close();
	
	
	}
	
}
		