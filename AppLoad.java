package AutoP;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AppLoad {

	@Test 
	public void AppLoad1() throws InterruptedException
	{
	
	
		WebDriver driver = new ChromeDriver();
	//	SoftAssert softAssert = new SoftAssert();
		
		String url = "https://www.flipkart.com/";
		 driver.get(url);	//loads the page 
		driver.manage().window().maximize();	//maximize the window size 
	//	Thread.sleep(5000);
		String actual = driver.getTitle();
		String expected = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		Assert.assertEquals(actual, expected);
		driver.findElement(By.xpath("/html/body/div[3]/div/span")).click();
		System.out.println("Application loaded successfully");
					
	}
			
}
