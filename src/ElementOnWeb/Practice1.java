package ElementOnWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/mainguyen/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Thanh Mai");
		driver.findElement(By.name("email")).sendKeys("nguyenthanhmai2611@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("password123");
		driver.findElement(By.id("exampleCheck1")).click();
//		Need to review
		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select sex = new Select(dropdown);
		sex.selectByVisibleText("Female");
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("26/11/1995");
		driver.findElement(By.xpath("//input[contains(@class,'btn btn-success')]")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
		
		
		

	}

}
