package ElementOnWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

//TestNG is a testing framework

public class Checkbox {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", "/Users/mainguyen/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

//		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
//		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());


//		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {

            System.out.println("It's enable");
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);

        }


//		Count the number of checkbox
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());


//		Select dropdown

        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
		
		/*int i=1;
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();//add
			i++;
		}*/

        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "1 Adult");
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        for (int i = 1; i < 5; i++) {
            driver.findElement(By.id("hrefIncAdt")).click();//add

        }

        driver.findElement(By.id("btnclosepaxoption")).click();//close

        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());


    }

}
