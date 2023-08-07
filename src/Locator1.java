import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locator1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name = "Mai";

		System.setProperty("webdriver.chrome.driver", "/Users/mainguyen/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password = getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver
				.findElement(By.xpath("//p[@style='color: rgb(27, 179, 102); font-size: 18px; text-align: center;']"))
				.getText());
		Assert.assertEquals(driver
				.findElement(By.xpath("//p[@style='color: rgb(27, 179, 102); font-size: 18px; text-align: center;']"))
				.getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),
				"Hello " + name + ",");

	}
//	moi method chi mang mot nhiem vụ duy nhat, ơ method nay nhiem vu là lay password 

	public static String getPassword(WebDriver driver) throws InterruptedException

	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
//		Please use temporary password 'rahulshettyacademy' to Login.
		String[] passwordArray = passwordText.split("'");
		// String[] passwordArray1 = passwordArray[1].split("'");
		// passwordArray1[0];
		String password = passwordArray[1].split("'")[0];
		return password;

	}
}
