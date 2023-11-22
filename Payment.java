package AutoP;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Payment {
	@Test
	public void Pay() throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[3]/div/span")).click();
		Thread.sleep(3000);
		WebElement search =	driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/div[1]/header/div[1]/div[2]/form/div/div/input"));
		search.sendKeys("Shirt");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/a[1]/div[1]/div[1]/div[1]/div[1]/img[1]")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	    Thread.sleep(3000);
	    //selecting the size
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div/ul/li[1]")).click();
	    // driver.close();
	    //  driver.switchTo().window(tabs.get(0));	
	    Thread.sleep(3000);
	    //add to cart
	    driver.findElement(By.cssSelector("#container > div > div._2c7YLP.UtUXW0._6t1WkM._3HqJxg > div._1YokD2._2GoDe3 > div._1YokD2._3Mn1Gg.col-5-12._78xt5Y > div:nth-child(2) > div > ul > li:nth-child(1) > button")).click();	
	    Thread.sleep(3000);
	    //place order
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[1]/div/div[4]/div/form/button")).click();
	    Thread.sleep(3000);
	    //adding email
	    driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[1]/input")).sendKeys("f65z866q@freeml.net");
	    Thread.sleep(3000);
	    
	    //clicking on continue button 
	    driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[3]/button")).click();
	    
	    //adding phn number
	    WebElement phn = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[2]"));
	    phn.click();
	    phn.sendKeys("9473203988");
	    Thread.sleep(1000);
	    
	  //clicking on continue button 
	    driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[3]/button")).click();
	    
	}

}
